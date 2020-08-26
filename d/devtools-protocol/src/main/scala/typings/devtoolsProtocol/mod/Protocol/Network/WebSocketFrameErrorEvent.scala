package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketFrameErrorEvent extends js.Object {
  /**
    * WebSocket error message.
    */
  var errorMessage: String = js.native
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
}

object WebSocketFrameErrorEvent {
  @scala.inline
  def apply(errorMessage: String, requestId: RequestId, timestamp: MonotonicTime): WebSocketFrameErrorEvent = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketFrameErrorEvent]
  }
  @scala.inline
  implicit class WebSocketFrameErrorEventOps[Self <: WebSocketFrameErrorEvent] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

