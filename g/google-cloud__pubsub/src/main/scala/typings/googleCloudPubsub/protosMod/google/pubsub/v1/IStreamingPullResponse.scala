package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.IAcknowledgeConfirmation
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.IModifyAckDeadlineConfirmation
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.StreamingPullResponse.ISubscriptionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StreamingPullResponse. */
trait IStreamingPullResponse extends StObject {
  
  /** StreamingPullResponse acknowledgeConfirmation */
  var acknowledgeConfirmation: js.UndefOr[IAcknowledgeConfirmation | Null] = js.undefined
  
  /** StreamingPullResponse modifyAckDeadlineConfirmation */
  var modifyAckDeadlineConfirmation: js.UndefOr[IModifyAckDeadlineConfirmation | Null] = js.undefined
  
  /** StreamingPullResponse receivedMessages */
  var receivedMessages: js.UndefOr[js.Array[IReceivedMessage] | Null] = js.undefined
  
  /** StreamingPullResponse subscriptionProperties */
  var subscriptionProperties: js.UndefOr[ISubscriptionProperties | Null] = js.undefined
}
object IStreamingPullResponse {
  
  inline def apply(): IStreamingPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingPullResponse]
  }
  
  extension [Self <: IStreamingPullResponse](x: Self) {
    
    inline def setAcknowledgeConfirmation(value: IAcknowledgeConfirmation): Self = StObject.set(x, "acknowledgeConfirmation", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeConfirmationNull: Self = StObject.set(x, "acknowledgeConfirmation", null)
    
    inline def setAcknowledgeConfirmationUndefined: Self = StObject.set(x, "acknowledgeConfirmation", js.undefined)
    
    inline def setModifyAckDeadlineConfirmation(value: IModifyAckDeadlineConfirmation): Self = StObject.set(x, "modifyAckDeadlineConfirmation", value.asInstanceOf[js.Any])
    
    inline def setModifyAckDeadlineConfirmationNull: Self = StObject.set(x, "modifyAckDeadlineConfirmation", null)
    
    inline def setModifyAckDeadlineConfirmationUndefined: Self = StObject.set(x, "modifyAckDeadlineConfirmation", js.undefined)
    
    inline def setReceivedMessages(value: js.Array[IReceivedMessage]): Self = StObject.set(x, "receivedMessages", value.asInstanceOf[js.Any])
    
    inline def setReceivedMessagesNull: Self = StObject.set(x, "receivedMessages", null)
    
    inline def setReceivedMessagesUndefined: Self = StObject.set(x, "receivedMessages", js.undefined)
    
    inline def setReceivedMessagesVarargs(value: IReceivedMessage*): Self = StObject.set(x, "receivedMessages", js.Array(value*))
    
    inline def setSubscriptionProperties(value: ISubscriptionProperties): Self = StObject.set(x, "subscriptionProperties", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPropertiesNull: Self = StObject.set(x, "subscriptionProperties", null)
    
    inline def setSubscriptionPropertiesUndefined: Self = StObject.set(x, "subscriptionProperties", js.undefined)
  }
}
