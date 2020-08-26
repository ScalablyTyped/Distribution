package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthInfo extends js.Object {
  var host: String = js.native
  var isProxy: Boolean = js.native
  var port: Double = js.native
  var realm: String = js.native
  var scheme: String = js.native
}

object AuthInfo {
  @scala.inline
  def apply(host: String, isProxy: Boolean, port: Double, realm: String, scheme: String): AuthInfo = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], isProxy = isProxy.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthInfo]
  }
  @scala.inline
  implicit class AuthInfoOps[Self <: AuthInfo] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsProxy(value: Boolean): Self = this.set("isProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
  }
  
}

