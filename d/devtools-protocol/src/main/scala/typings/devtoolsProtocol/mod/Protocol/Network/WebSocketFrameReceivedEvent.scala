package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketFrameReceivedEvent extends StObject {
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * WebSocket response data.
    */
  var response: WebSocketFrame
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
}
object WebSocketFrameReceivedEvent {
  
  inline def apply(requestId: RequestId, response: WebSocketFrame, timestamp: MonotonicTime): WebSocketFrameReceivedEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketFrameReceivedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSocketFrameReceivedEvent] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: WebSocketFrame): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
