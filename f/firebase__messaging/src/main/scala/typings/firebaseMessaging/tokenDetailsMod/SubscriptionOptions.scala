package typings.firebaseMessaging.tokenDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionOptions extends js.Object {
  
  var auth: String = js.native
  
  var endpoint: String = js.native
  
  var p256dh: String = js.native
  
  var swScope: String = js.native
  
  var vapidKey: String = js.native
}
object SubscriptionOptions {
  
  @scala.inline
  def apply(auth: String, endpoint: String, p256dh: String, swScope: String, vapidKey: String): SubscriptionOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
  
  @scala.inline
  implicit class SubscriptionOptionsOps[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
    
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
    def setSwScope(value: String): Self = this.set("swScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVapidKey(value: String): Self = this.set("vapidKey", value.asInstanceOf[js.Any])
  }
}
