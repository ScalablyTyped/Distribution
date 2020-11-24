package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketWillSendHandshakeRequestEvent extends js.Object {
  
  /**
    * WebSocket request data.
    */
  var request: WebSocketRequest = js.native
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
  
  /**
    * UTC Timestamp.
    */
  var wallTime: TimeSinceEpoch = js.native
}
object WebSocketWillSendHandshakeRequestEvent {
  
  @scala.inline
  def apply(
    request: WebSocketRequest,
    requestId: RequestId,
    timestamp: MonotonicTime,
    wallTime: TimeSinceEpoch
  ): WebSocketWillSendHandshakeRequestEvent = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], wallTime = wallTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketWillSendHandshakeRequestEvent]
  }
  
  @scala.inline
  implicit class WebSocketWillSendHandshakeRequestEventOps[Self <: WebSocketWillSendHandshakeRequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequest(value: WebSocketRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWallTime(value: TimeSinceEpoch): Self = this.set("wallTime", value.asInstanceOf[js.Any])
  }
}
