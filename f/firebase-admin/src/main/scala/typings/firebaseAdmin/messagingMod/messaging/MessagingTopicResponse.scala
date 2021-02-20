package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingTopicResponse extends StObject {
  
  /**
    * The message ID for a successfully received request which FCM will attempt to
    * deliver to all subscribed devices.
    */
  var messageId: Double = js.native
}
object MessagingTopicResponse {
  
  @scala.inline
  def apply(messageId: Double): MessagingTopicResponse = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingTopicResponse]
  }
  
  @scala.inline
  implicit class MessagingTopicResponseMutableBuilder[Self <: MessagingTopicResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
  }
}
