package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ModifyAckDeadlineRequest. */
trait IModifyAckDeadlineRequest extends StObject {
  
  /** ModifyAckDeadlineRequest ackDeadlineSeconds */
  var ackDeadlineSeconds: js.UndefOr[Double | Null] = js.undefined
  
  /** ModifyAckDeadlineRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ModifyAckDeadlineRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object IModifyAckDeadlineRequest {
  
  inline def apply(): IModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModifyAckDeadlineRequest]
  }
  
  extension [Self <: IModifyAckDeadlineRequest](x: Self) {
    
    inline def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setAckDeadlineSecondsNull: Self = StObject.set(x, "ackDeadlineSeconds", null)
    
    inline def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
    
    inline def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
    
    inline def setAckIdsNull: Self = StObject.set(x, "ackIds", null)
    
    inline def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
    
    inline def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value*))
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
