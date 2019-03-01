package typings
package giphyDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avatarurl extends js.Object {
  var avatar_url: java.lang.String
  var banner_url: java.lang.String
  var display_name: java.lang.String
  var profile_url: java.lang.String
  var twitter: java.lang.String
  var username: java.lang.String
}

object Anon_Avatarurl {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    banner_url: java.lang.String,
    display_name: java.lang.String,
    profile_url: java.lang.String,
    twitter: java.lang.String,
    username: java.lang.String
  ): Anon_Avatarurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatar_url")(avatar_url)
    __obj.updateDynamic("banner_url")(banner_url)
    __obj.updateDynamic("display_name")(display_name)
    __obj.updateDynamic("profile_url")(profile_url)
    __obj.updateDynamic("twitter")(twitter)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Avatarurl]
  }
}

