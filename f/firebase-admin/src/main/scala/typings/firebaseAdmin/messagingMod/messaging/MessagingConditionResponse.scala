package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingConditionResponse extends StObject {
  
  /**
    * The message ID for a successfully received request which FCM will attempt to
    * deliver to all subscribed devices.
    */
  var messageId: Double = js.native
}
object MessagingConditionResponse {
  
  @scala.inline
  def apply(messageId: Double): MessagingConditionResponse = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingConditionResponse]
  }
  
  @scala.inline
  implicit class MessagingConditionResponseMutableBuilder[Self <: MessagingConditionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
  }
}
