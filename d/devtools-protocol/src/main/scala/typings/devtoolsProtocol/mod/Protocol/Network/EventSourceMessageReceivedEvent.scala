package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMessageReceivedEvent extends js.Object {
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
  implicit class EventSourceMessageReceivedEventOps[Self <: EventSourceMessageReceivedEvent] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

