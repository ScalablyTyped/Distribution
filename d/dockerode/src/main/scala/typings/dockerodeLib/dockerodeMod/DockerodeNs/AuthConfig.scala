package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthConfig extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var serveraddress: java.lang.String
  var username: java.lang.String
}

object AuthConfig {
  @scala.inline
  def apply(
    password: java.lang.String,
    serveraddress: java.lang.String,
    username: java.lang.String,
    email: java.lang.String = null
  ): AuthConfig = {
    val __obj = js.Dynamic.literal(password = password, serveraddress = serveraddress, username = username)
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[AuthConfig]
  }
}

