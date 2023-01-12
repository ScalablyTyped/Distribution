package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketWillSendHandshakeRequestEvent extends StObject {
  
  /**
    * WebSocket request data.
    */
  var request: WebSocketRequest
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
  
  /**
    * UTC Timestamp.
    */
  var wallTime: TimeSinceEpoch
}
object WebSocketWillSendHandshakeRequestEvent {
  
  inline def apply(
    request: WebSocketRequest,
    requestId: RequestId,
    timestamp: MonotonicTime,
    wallTime: TimeSinceEpoch
  ): WebSocketWillSendHandshakeRequestEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], wallTime = wallTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketWillSendHandshakeRequestEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSocketWillSendHandshakeRequestEvent] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: WebSocketRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setWallTime(value: TimeSinceEpoch): Self = StObject.set(x, "wallTime", value.asInstanceOf[js.Any])
  }
}
