package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ReceivedMessage. */
trait IReceivedMessage extends StObject {
  
  /** ReceivedMessage ackId */
  var ackId: js.UndefOr[String | Null] = js.undefined
  
  /** ReceivedMessage deliveryAttempt */
  var deliveryAttempt: js.UndefOr[Double | Null] = js.undefined
  
  /** ReceivedMessage message */
  var message: js.UndefOr[IPubsubMessage | Null] = js.undefined
}
object IReceivedMessage {
  
  inline def apply(): IReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReceivedMessage]
  }
  
  extension [Self <: IReceivedMessage](x: Self) {
    
    inline def setAckId(value: String): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    inline def setAckIdNull: Self = StObject.set(x, "ackId", null)
    
    inline def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    inline def setDeliveryAttempt(value: Double): Self = StObject.set(x, "deliveryAttempt", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAttemptNull: Self = StObject.set(x, "deliveryAttempt", null)
    
    inline def setDeliveryAttemptUndefined: Self = StObject.set(x, "deliveryAttempt", js.undefined)
    
    inline def setMessage(value: IPubsubMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
