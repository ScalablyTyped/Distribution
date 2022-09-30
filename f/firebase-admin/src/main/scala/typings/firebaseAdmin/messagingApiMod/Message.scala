package typings.firebaseAdmin.messagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.messagingApiMod.TokenMessage
  - typings.firebaseAdmin.messagingApiMod.TopicMessage
  - typings.firebaseAdmin.messagingApiMod.ConditionMessage
*/
trait Message extends StObject
object Message {
  
  inline def ConditionMessage(condition: String): typings.firebaseAdmin.messagingApiMod.ConditionMessage = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.messagingApiMod.ConditionMessage]
  }
  
  inline def TokenMessage(token: String): typings.firebaseAdmin.messagingApiMod.TokenMessage = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.messagingApiMod.TokenMessage]
  }
  
  inline def TopicMessage(topic: String): typings.firebaseAdmin.messagingApiMod.TopicMessage = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.messagingApiMod.TopicMessage]
  }
}
