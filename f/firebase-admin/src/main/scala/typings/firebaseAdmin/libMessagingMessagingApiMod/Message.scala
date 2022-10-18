package typings.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.libMessagingMessagingApiMod.TokenMessage
  - typings.firebaseAdmin.libMessagingMessagingApiMod.TopicMessage
  - typings.firebaseAdmin.libMessagingMessagingApiMod.ConditionMessage
*/
trait Message extends StObject
object Message {
  
  inline def ConditionMessage(condition: String): typings.firebaseAdmin.libMessagingMessagingApiMod.ConditionMessage = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.libMessagingMessagingApiMod.ConditionMessage]
  }
  
  inline def TokenMessage(token: String): typings.firebaseAdmin.libMessagingMessagingApiMod.TokenMessage = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.libMessagingMessagingApiMod.TokenMessage]
  }
  
  inline def TopicMessage(topic: String): typings.firebaseAdmin.libMessagingMessagingApiMod.TopicMessage = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.libMessagingMessagingApiMod.TopicMessage]
  }
}
