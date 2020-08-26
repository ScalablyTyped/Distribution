package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait connectionObject extends js.Object {
  var clientKey: String = js.native
  var clientSecret: String = js.native
  var password: String = js.native
  var username: String = js.native
}

object connectionObject {
  @scala.inline
  def apply(clientKey: String, clientSecret: String, password: String, username: String): connectionObject = {
    val __obj = js.Dynamic.literal(clientKey = clientKey.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectionObject]
  }
  @scala.inline
  implicit class connectionObjectOps[Self <: connectionObject] (val x: Self) extends AnyVal {
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
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

