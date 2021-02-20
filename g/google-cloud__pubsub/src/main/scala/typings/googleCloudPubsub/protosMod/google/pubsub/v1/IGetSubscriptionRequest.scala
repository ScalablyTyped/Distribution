package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetSubscriptionRequest. */
@js.native
trait IGetSubscriptionRequest extends StObject {
  
  /** GetSubscriptionRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}
object IGetSubscriptionRequest {
  
  @scala.inline
  def apply(): IGetSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetSubscriptionRequest]
  }
  
  @scala.inline
  implicit class IGetSubscriptionRequestMutableBuilder[Self <: IGetSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
