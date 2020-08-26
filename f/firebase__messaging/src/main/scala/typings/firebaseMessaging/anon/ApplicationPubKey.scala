package typings.firebaseMessaging.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationPubKey extends js.Object {
  var applicationPubKey: js.UndefOr[String] = js.native
  var auth: String = js.native
  var endpoint: String = js.native
  var p256dh: String = js.native
}

object ApplicationPubKey {
  @scala.inline
  def apply(auth: String, endpoint: String, p256dh: String): ApplicationPubKey = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationPubKey]
  }
  @scala.inline
  implicit class ApplicationPubKeyOps[Self <: ApplicationPubKey] (val x: Self) extends AnyVal {
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
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setP256dh(value: String): Self = this.set("p256dh", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationPubKey(value: String): Self = this.set("applicationPubKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationPubKey: Self = this.set("applicationPubKey", js.undefined)
  }
  
}

