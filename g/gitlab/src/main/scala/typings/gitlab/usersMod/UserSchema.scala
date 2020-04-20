package typings.gitlab.usersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSchema extends js.Object {
  var avatar_url: String
  var id: Double
  var name: String
  var state: String
  var username: String
  var web_url: String
}

object UserSchema {
  @scala.inline
  def apply(avatar_url: String, id: Double, name: String, state: String, username: String, web_url: String): UserSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSchema]
  }
}

