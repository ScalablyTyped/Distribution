package typings.discordRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar extends js.Object {
  var avatar: String = js.native
  var discriminator: String = js.native
  var id: String = js.native
  var username: String = js.native
}

object Avatar {
  @scala.inline
  def apply(avatar: String, discriminator: String, id: String, username: String): Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], discriminator = discriminator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  @scala.inline
  implicit class AvatarOps[Self <: Avatar] (val x: Self) extends AnyVal {
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
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscriminator(value: String): Self = this.set("discriminator", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

