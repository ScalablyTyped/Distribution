package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvatarurl extends js.Object {
  var avatar_url: String
  var banner_url: String
  var display_name: String
  var profile_url: String
  var twitter: String
  var username: String
}

object AnonAvatarurl {
  @scala.inline
  def apply(
    avatar_url: String,
    banner_url: String,
    display_name: String,
    profile_url: String,
    twitter: String,
    username: String
  ): AnonAvatarurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], banner_url = banner_url.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], profile_url = profile_url.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAvatarurl]
  }
}

