package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PublishRequest. */
trait IPublishRequest extends StObject {
  
  /** PublishRequest messages */
  var messages: js.UndefOr[js.Array[IPubsubMessage] | Null] = js.undefined
  
  /** PublishRequest topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object IPublishRequest {
  
  @scala.inline
  def apply(): IPublishRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPublishRequest]
  }
  
  @scala.inline
  implicit class IPublishRequestMutableBuilder[Self <: IPublishRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[IPubsubMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: IPubsubMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNull: Self = StObject.set(x, "topic", null)
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
