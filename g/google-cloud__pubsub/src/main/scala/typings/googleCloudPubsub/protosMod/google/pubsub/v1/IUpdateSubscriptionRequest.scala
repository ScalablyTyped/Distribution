package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateSubscriptionRequest. */
trait IUpdateSubscriptionRequest extends StObject {
  
  /** UpdateSubscriptionRequest subscription */
  var subscription: js.UndefOr[ISubscription | Null] = js.undefined
  
  /** UpdateSubscriptionRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateSubscriptionRequest {
  
  @scala.inline
  def apply(): IUpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateSubscriptionRequest]
  }
  
  @scala.inline
  implicit class IUpdateSubscriptionRequestMutableBuilder[Self <: IUpdateSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: ISubscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
