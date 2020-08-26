package typings.gitlab.usersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSchema extends js.Object {
  var avatar_url: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var state: String = js.native
  var username: String = js.native
  var web_url: String = js.native
}

object UserSchema {
  @scala.inline
  def apply(avatar_url: String, id: Double, name: String, state: String, username: String, web_url: String): UserSchema = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSchema]
  }
  @scala.inline
  implicit class UserSchemaOps[Self <: UserSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeb_url(value: String): Self = this.set("web_url", value.asInstanceOf[js.Any])
  }
  
}

