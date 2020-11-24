package typings.firebaseMessaging.migrateOldDatabaseMod

import typings.std.PushSubscription
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V2TokenDetails extends js.Object {
  
  var auth: js.UndefOr[String] = js.native
  
  var createTime: js.UndefOr[Double] = js.native
  
  var endpoint: js.UndefOr[String] = js.native
  
  var fcmPushSet: String = js.native
  
  var fcmSenderId: String = js.native
  
  var fcmToken: String = js.native
  
  var p256dh: js.UndefOr[String] = js.native
  
  var subscription: PushSubscription = js.native
  
  var swScope: String = js.native
  
  var vapidKey: String | Uint8Array = js.native
}
object V2TokenDetails {
  
  @scala.inline
  def apply(
    fcmPushSet: String,
    fcmSenderId: String,
    fcmToken: String,
    subscription: PushSubscription,
    swScope: String,
    vapidKey: String | Uint8Array
  ): V2TokenDetails = {
    val __obj = js.Dynamic.literal(fcmPushSet = fcmPushSet.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[V2TokenDetails]
  }
  
  @scala.inline
  implicit class V2TokenDetailsOps[Self <: V2TokenDetails] (val x: Self) extends AnyVal {
    
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
    def setFcmPushSet(value: String): Self = this.set("fcmPushSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcmSenderId(value: String): Self = this.set("fcmSenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcmToken(value: String): Self = this.set("fcmToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: PushSubscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwScope(value: String): Self = this.set("swScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVapidKey(value: String | Uint8Array): Self = this.set("vapidKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCreateTime(value: Double): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setP256dh(value: String): Self = this.set("p256dh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP256dh: Self = this.set("p256dh", js.undefined)
  }
}
