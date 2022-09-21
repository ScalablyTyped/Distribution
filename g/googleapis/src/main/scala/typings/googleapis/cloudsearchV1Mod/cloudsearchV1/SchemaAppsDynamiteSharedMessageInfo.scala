package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedMessageInfo extends StObject {
  
  /**
    * Id of the source chat message. This is kept here because the top-level message ID to refers the AF message ID.
    */
  var messageId: js.UndefOr[SchemaMessageId] = js.undefined
  
  /**
    * Timestamp of when the topic containing the message has been read by the user. This is populated if the message references an inline reply, in which case the space may be marked as read but the topic still has unread messages.
    */
  var topicReadTimeUsec: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedMessageInfo {
  
  inline def apply(): SchemaAppsDynamiteSharedMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedMessageInfo]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedMessageInfo](x: Self) {
    
    inline def setMessageId(value: SchemaMessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setTopicReadTimeUsec(value: String): Self = StObject.set(x, "topicReadTimeUsec", value.asInstanceOf[js.Any])
    
    inline def setTopicReadTimeUsecNull: Self = StObject.set(x, "topicReadTimeUsec", null)
    
    inline def setTopicReadTimeUsecUndefined: Self = StObject.set(x, "topicReadTimeUsec", js.undefined)
  }
}
