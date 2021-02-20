package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceMessageReceivedEvent extends StObject {
  
  /**
    * Message content.
    */
  var data: String = js.native
  
  /**
    * Message identifier.
    */
  var eventId: String = js.native
  
  /**
    * Message type.
    */
  var eventName: String = js.native
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
}
object EventSourceMessageReceivedEvent {
  
  @scala.inline
  def apply(data: String, eventId: String, eventName: String, requestId: RequestId, timestamp: MonotonicTime): EventSourceMessageReceivedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceMessageReceivedEvent]
  }
  
  @scala.inline
  implicit class EventSourceMessageReceivedEventMutableBuilder[Self <: EventSourceMessageReceivedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
