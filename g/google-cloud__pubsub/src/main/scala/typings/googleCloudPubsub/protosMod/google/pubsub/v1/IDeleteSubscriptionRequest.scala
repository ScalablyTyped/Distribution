package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteSubscriptionRequest. */
trait IDeleteSubscriptionRequest extends StObject {
  
  /** DeleteSubscriptionRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object IDeleteSubscriptionRequest {
  
  @scala.inline
  def apply(): IDeleteSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteSubscriptionRequest]
  }
  
  @scala.inline
  implicit class IDeleteSubscriptionRequestMutableBuilder[Self <: IDeleteSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
