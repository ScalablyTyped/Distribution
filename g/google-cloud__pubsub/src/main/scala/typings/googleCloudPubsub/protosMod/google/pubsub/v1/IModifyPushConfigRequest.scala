package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ModifyPushConfigRequest. */
trait IModifyPushConfigRequest extends StObject {
  
  /** ModifyPushConfigRequest pushConfig */
  var pushConfig: js.UndefOr[IPushConfig | Null] = js.undefined
  
  /** ModifyPushConfigRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object IModifyPushConfigRequest {
  
  inline def apply(): IModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModifyPushConfigRequest]
  }
  
  extension [Self <: IModifyPushConfigRequest](x: Self) {
    
    inline def setPushConfig(value: IPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    inline def setPushConfigNull: Self = StObject.set(x, "pushConfig", null)
    
    inline def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
