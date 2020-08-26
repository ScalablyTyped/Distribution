package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthConfig extends js.Object {
  var email: js.UndefOr[String] = js.native
  var password: String = js.native
  var serveraddress: String = js.native
  var username: String = js.native
}

object AuthConfig {
  @scala.inline
  def apply(password: String, serveraddress: String, username: String): AuthConfig = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], serveraddress = serveraddress.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthConfig]
  }
  @scala.inline
  implicit class AuthConfigOps[Self <: AuthConfig] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setServeraddress(value: String): Self = this.set("serveraddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
  }
  
}

