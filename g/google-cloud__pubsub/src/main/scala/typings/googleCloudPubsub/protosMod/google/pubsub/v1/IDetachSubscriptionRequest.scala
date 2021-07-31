package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DetachSubscriptionRequest. */
trait IDetachSubscriptionRequest extends StObject {
  
  /** DetachSubscriptionRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object IDetachSubscriptionRequest {
  
  @scala.inline
  def apply(): IDetachSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetachSubscriptionRequest]
  }
  
  @scala.inline
  implicit class IDetachSubscriptionRequestMutableBuilder[Self <: IDetachSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
