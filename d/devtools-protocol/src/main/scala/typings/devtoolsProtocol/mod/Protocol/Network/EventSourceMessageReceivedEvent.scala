package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceMessageReceivedEvent extends StObject {
  
  /**
    * Message content.
    */
  var data: String
  
  /**
    * Message identifier.
    */
  var eventId: String
  
  /**
    * Message type.
    */
  var eventName: String
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
}
object EventSourceMessageReceivedEvent {
  
  inline def apply(data: String, eventId: String, eventName: String, requestId: RequestId, timestamp: MonotonicTime): EventSourceMessageReceivedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceMessageReceivedEvent]
  }
  
  extension [Self <: EventSourceMessageReceivedEvent](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
