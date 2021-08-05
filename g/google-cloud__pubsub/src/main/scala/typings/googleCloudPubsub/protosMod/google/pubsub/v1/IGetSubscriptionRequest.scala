package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetSubscriptionRequest. */
trait IGetSubscriptionRequest extends StObject {
  
  /** GetSubscriptionRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object IGetSubscriptionRequest {
  
  inline def apply(): IGetSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetSubscriptionRequest]
  }
  
  extension [Self <: IGetSubscriptionRequest](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
