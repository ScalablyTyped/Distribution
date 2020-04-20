package typings.discordRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvatar extends js.Object {
  var avatar: String
  var discriminator: String
  var id: String
  var username: String
}

object AnonAvatar {
  @scala.inline
  def apply(avatar: String, discriminator: String, id: String, username: String): AnonAvatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], discriminator = discriminator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvatar]
  }
}

