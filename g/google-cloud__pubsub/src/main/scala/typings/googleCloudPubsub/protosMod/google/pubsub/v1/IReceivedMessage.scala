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
  
  @scala.inline
  def apply(): IReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReceivedMessage]
  }
  
  @scala.inline
  implicit class IReceivedMessageMutableBuilder[Self <: IReceivedMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckId(value: String): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdNull: Self = StObject.set(x, "ackId", null)
    
    @scala.inline
    def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    @scala.inline
    def setDeliveryAttempt(value: Double): Self = StObject.set(x, "deliveryAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryAttemptNull: Self = StObject.set(x, "deliveryAttempt", null)
    
    @scala.inline
    def setDeliveryAttemptUndefined: Self = StObject.set(x, "deliveryAttempt", js.undefined)
    
    @scala.inline
    def setMessage(value: IPubsubMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
