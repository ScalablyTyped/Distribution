package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.messagingMod.messaging.TokenMessage
  - typings.firebaseAdmin.messagingMod.messaging.TopicMessage
  - typings.firebaseAdmin.messagingMod.messaging.ConditionMessage
*/
trait Message extends StObject
object Message {
  
  inline def ConditionMessage(condition: String): typings.firebaseAdmin.messagingMod.messaging.ConditionMessage = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.messagingMod.messaging.ConditionMessage]
  }
  
  inline def TokenMessage(token: String): typings.firebaseAdmin.messagingMod.messaging.TokenMessage = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.messagingMod.messaging.TokenMessage]
  }
  
  inline def TopicMessage(topic: String): typings.firebaseAdmin.messagingMod.messaging.TopicMessage = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.messagingMod.messaging.TopicMessage]
  }
}
