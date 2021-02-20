package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicMessage
  extends BaseMessage
     with Message {
  
  var topic: String = js.native
}
object TopicMessage {
  
  @scala.inline
  def apply(topic: String): TopicMessage = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicMessage]
  }
  
  @scala.inline
  implicit class TopicMessageMutableBuilder[Self <: TopicMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
