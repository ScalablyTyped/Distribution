package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketClosedEvent extends StObject {
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
}
object WebSocketClosedEvent {
  
  @scala.inline
  def apply(requestId: RequestId, timestamp: MonotonicTime): WebSocketClosedEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketClosedEvent]
  }
  
  @scala.inline
  implicit class WebSocketClosedEventMutableBuilder[Self <: WebSocketClosedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
