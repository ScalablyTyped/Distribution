package typings.devtoolsProtocol.mod.Protocol.BackgroundService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordingStateChangedEvent extends js.Object {
  var isRecording: Boolean = js.native
  var service: ServiceName = js.native
}

object RecordingStateChangedEvent {
  @scala.inline
  def apply(isRecording: Boolean, service: ServiceName): RecordingStateChangedEvent = {
    val __obj = js.Dynamic.literal(isRecording = isRecording.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingStateChangedEvent]
  }
  @scala.inline
  implicit class RecordingStateChangedEventOps[Self <: RecordingStateChangedEvent] (val x: Self) extends AnyVal {
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
    def setIsRecording(value: Boolean): Self = this.set("isRecording", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: ServiceName): Self = this.set("service", value.asInstanceOf[js.Any])
  }
  
}

