package com.example.leoshekhpersonalone.users;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.leoshekhpersonalone.R;
import org.checkerframework.checker.nullness.qual.NonNull;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    CircleImageView profileImage_iv;

    TextView username_tv;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        profileImage_iv = itemView.findViewById(R.id.profile_iv);
        username_tv = itemView.findViewById(R.id.username_tv);

    }
}
