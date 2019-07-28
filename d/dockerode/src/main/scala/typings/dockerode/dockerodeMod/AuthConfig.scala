package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthConfig extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var password: String
  var serveraddress: String
  var username: String
}

object AuthConfig {
  @scala.inline
  def apply(password: String, serveraddress: String, username: String, email: String = null): AuthConfig = {
    val __obj = js.Dynamic.literal(password = password, serveraddress = serveraddress, username = username)
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[AuthConfig]
  }
}

