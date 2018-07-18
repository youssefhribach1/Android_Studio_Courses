package com.example.thenewjoseph.styles_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  int index=0;
    int[]liste=new int[]{R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7};
    public void next(View view) {
        ImageView imagesV=(ImageView)findViewById(R.id.imageView2);
        imagesV.setImageResource(liste[index]);
        index++;
        if (index>6){
            index=0;
        }
    }
}
