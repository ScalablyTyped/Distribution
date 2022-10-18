package typings.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingConditionResponse extends StObject {
  
  /**
    * The message ID for a successfully received request which FCM will attempt to
    * deliver to all subscribed devices.
    */
  var messageId: Double
}
object MessagingConditionResponse {
  
  inline def apply(messageId: Double): MessagingConditionResponse = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingConditionResponse]
  }
  
  extension [Self <: MessagingConditionResponse](x: Self) {
    
    inline def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
  }
}
