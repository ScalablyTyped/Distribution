package typings.gitlab.usersMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDetailSchema extends UserSchema {
  var bio: js.UndefOr[String] = js.undefined
  var created_at: Date
  var linkedin: String
  var location: js.UndefOr[String] = js.undefined
  var organization: js.UndefOr[String] = js.undefined
  var public_email: String
  var skype: String
  var twitter: String
  var website_url: js.UndefOr[String] = js.undefined
}

object UserDetailSchema {
  @scala.inline
  def apply(
    avatar_url: String,
    created_at: Date,
    id: Double,
    linkedin: String,
    name: String,
    public_email: String,
    skype: String,
    state: String,
    twitter: String,
    username: String,
    web_url: String,
    bio: String = null,
    location: String = null,
    organization: String = null,
    website_url: String = null
  ): UserDetailSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], linkedin = linkedin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_email = public_email.asInstanceOf[js.Any], skype = skype.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    if (bio != null) __obj.updateDynamic("bio")(bio.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (website_url != null) __obj.updateDynamic("website_url")(website_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDetailSchema]
  }
}

