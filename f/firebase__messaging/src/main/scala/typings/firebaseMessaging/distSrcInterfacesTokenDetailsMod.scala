package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcInterfacesTokenDetailsMod {
  
  trait SubscriptionOptions extends StObject {
    
    var auth: String
    
    var endpoint: String
    
    var p256dh: String
    
    var swScope: String
    
    var vapidKey: String
  }
  object SubscriptionOptions {
    
    inline def apply(auth: String, endpoint: String, p256dh: String, swScope: String, vapidKey: String): SubscriptionOptions = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any], swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    extension [Self <: SubscriptionOptions](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setP256dh(value: String): Self = StObject.set(x, "p256dh", value.asInstanceOf[js.Any])
      
      inline def setSwScope(value: String): Self = StObject.set(x, "swScope", value.asInstanceOf[js.Any])
      
      inline def setVapidKey(value: String): Self = StObject.set(x, "vapidKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenDetails extends StObject {
    
    var createTime: Double
    
    /** Does not exist in Safari since it's not using Push API. */
    var subscriptionOptions: js.UndefOr[SubscriptionOptions] = js.undefined
    
    var token: String
  }
  object TokenDetails {
    
    inline def apply(createTime: Double, token: String): TokenDetails = {
      val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenDetails]
    }
    
    extension [Self <: TokenDetails](x: Self) {
      
      inline def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionOptions(value: SubscriptionOptions): Self = StObject.set(x, "subscriptionOptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionOptionsUndefined: Self = StObject.set(x, "subscriptionOptions", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
