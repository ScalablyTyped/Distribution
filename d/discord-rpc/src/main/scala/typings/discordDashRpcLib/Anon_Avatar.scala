package typings
package discordDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avatar extends js.Object {
  var avatar: java.lang.String
  var discriminator: java.lang.String
  var id: java.lang.String
  var username: java.lang.String
}

object Anon_Avatar {
  @scala.inline
  def apply(
    avatar: java.lang.String,
    discriminator: java.lang.String,
    id: java.lang.String,
    username: java.lang.String
  ): Anon_Avatar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatar")(avatar)
    __obj.updateDynamic("discriminator")(discriminator)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Avatar]
  }
}

