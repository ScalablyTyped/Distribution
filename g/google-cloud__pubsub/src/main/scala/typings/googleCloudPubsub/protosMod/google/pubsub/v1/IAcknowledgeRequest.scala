package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an AcknowledgeRequest. */
trait IAcknowledgeRequest extends StObject {
  
  /** AcknowledgeRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** AcknowledgeRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object IAcknowledgeRequest {
  
  inline def apply(): IAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAcknowledgeRequest]
  }
  
  extension [Self <: IAcknowledgeRequest](x: Self) {
    
    inline def setAckIds(value: js.Array[String]): Self = StObject.set(x, "ackIds", value.asInstanceOf[js.Any])
    
    inline def setAckIdsNull: Self = StObject.set(x, "ackIds", null)
    
    inline def setAckIdsUndefined: Self = StObject.set(x, "ackIds", js.undefined)
    
    inline def setAckIdsVarargs(value: String*): Self = StObject.set(x, "ackIds", js.Array(value*))
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
