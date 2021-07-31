package typings.firebaseMessaging

import typings.firebaseMessaging.tokenDetailsMod.TokenDetails
import typings.std.ArrayBuffer
import typings.std.ArrayBufferLike
import typings.std.PushSubscription
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrateOldDatabaseMod {
  
  @JSImport("@firebase/messaging/dist/helpers/migrate-old-database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def migrateOldDatabase(senderId: String): js.Promise[TokenDetails | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("migrateOldDatabase")(senderId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TokenDetails | Null]]
  
  trait V2TokenDetails extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var createTime: js.UndefOr[Double] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var fcmPushSet: String
    
    var fcmSenderId: String
    
    var fcmToken: String
    
    var p256dh: js.UndefOr[String] = js.undefined
    
    var subscription: PushSubscription
    
    var swScope: String
    
    var vapidKey: String | Uint8Array
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
    implicit class V2TokenDetailsMutableBuilder[Self <: V2TokenDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setFcmPushSet(value: String): Self = StObject.set(x, "fcmPushSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcmSenderId(value: String): Self = StObject.set(x, "fcmSenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcmToken(value: String): Self = StObject.set(x, "fcmToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP256dh(value: String): Self = StObject.set(x, "p256dh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP256dhUndefined: Self = StObject.set(x, "p256dh", js.undefined)
      
      @scala.inline
      def setSubscription(value: PushSubscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwScope(value: String): Self = StObject.set(x, "swScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVapidKey(value: String | Uint8Array): Self = StObject.set(x, "vapidKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait V3TokenDetails extends StObject {
    
    var auth: ArrayBuffer
    
    var createTime: Double
    
    var endpoint: String
    
    var fcmPushSet: String
    
    var fcmSenderId: String
    
    var fcmToken: String
    
    var p256dh: ArrayBuffer
    
    var swScope: String
    
    var vapidKey: Uint8Array
  }
  object V3TokenDetails {
    
    @scala.inline
    def apply(
      auth: ArrayBuffer,
      createTime: Double,
      endpoint: String,
      fcmPushSet: String,
      fcmSenderId: String,
      fcmToken: String,
      p256dh: ArrayBuffer,
      swScope: String,
      vapidKey: Uint8Array
    ): V3TokenDetails = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], fcmPushSet = fcmPushSet.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[V3TokenDetails]
    }
    
    @scala.inline
    implicit class V3TokenDetailsMutableBuilder[Self <: V3TokenDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: ArrayBuffer): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcmPushSet(value: String): Self = StObject.set(x, "fcmPushSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcmSenderId(value: String): Self = StObject.set(x, "fcmSenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcmToken(value: String): Self = StObject.set(x, "fcmToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP256dh(value: ArrayBuffer): Self = StObject.set(x, "p256dh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwScope(value: String): Self = StObject.set(x, "swScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVapidKey(value: Uint8Array): Self = StObject.set(x, "vapidKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait V4TokenDetails extends StObject {
    
    var auth: ArrayBufferLike
    
    var createTime: Double
    
    var endpoint: String
    
    var fcmSenderId: String
    
    var fcmToken: String
    
    var p256dh: ArrayBufferLike
    
    var swScope: String
    
    var vapidKey: Uint8Array
  }
  object V4TokenDetails {
    
    @scala.inline
    def apply(
      auth: ArrayBufferLike,
      createTime: Double,
      endpoint: String,
      fcmSenderId: String,
      fcmToken: String,
      p256dh: ArrayBufferLike,
      swScope: String,
      vapidKey: Uint8Array
    ): V4TokenDetails = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], fcmSenderId = fcmSenderId.asInstanceOf[js.Any], fcmToken = fcmToken.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[V4TokenDetails]
    }
    
    @scala.inline
    implicit class V4TokenDetailsMutableBuilder[Self <: V4TokenDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: ArrayBufferLike): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcmSenderId(value: String): Self = StObject.set(x, "fcmSenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcmToken(value: String): Self = StObject.set(x, "fcmToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP256dh(value: ArrayBufferLike): Self = StObject.set(x, "p256dh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwScope(value: String): Self = StObject.set(x, "swScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVapidKey(value: Uint8Array): Self = StObject.set(x, "vapidKey", value.asInstanceOf[js.Any])
    }
  }
}
