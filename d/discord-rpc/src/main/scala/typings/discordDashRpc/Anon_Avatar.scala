package typings.discordDashRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avatar extends js.Object {
  var avatar: String
  var discriminator: String
  var id: String
  var username: String
}

object Anon_Avatar {
  @scala.inline
  def apply(avatar: String, discriminator: String, id: String, username: String): Anon_Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar, discriminator = discriminator, id = id, username = username)
  
    __obj.asInstanceOf[Anon_Avatar]
  }
}

