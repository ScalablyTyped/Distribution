package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ModifyPushConfigRequest. */
@js.native
trait IModifyPushConfigRequest extends StObject {
  
  /** ModifyPushConfigRequest pushConfig */
  var pushConfig: js.UndefOr[IPushConfig | Null] = js.native
  
  /** ModifyPushConfigRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}
object IModifyPushConfigRequest {
  
  @scala.inline
  def apply(): IModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModifyPushConfigRequest]
  }
  
  @scala.inline
  implicit class IModifyPushConfigRequestMutableBuilder[Self <: IModifyPushConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushConfig(value: IPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushConfigNull: Self = StObject.set(x, "pushConfig", null)
    
    @scala.inline
    def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
