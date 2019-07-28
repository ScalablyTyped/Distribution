package typings.giphyDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avatarurl extends js.Object {
  var avatar_url: String
  var banner_url: String
  var display_name: String
  var profile_url: String
  var twitter: String
  var username: String
}

object Anon_Avatarurl {
  @scala.inline
  def apply(
    avatar_url: String,
    banner_url: String,
    display_name: String,
    profile_url: String,
    twitter: String,
    username: String
  ): Anon_Avatarurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, banner_url = banner_url, display_name = display_name, profile_url = profile_url, twitter = twitter, username = username)
  
    __obj.asInstanceOf[Anon_Avatarurl]
  }
}

