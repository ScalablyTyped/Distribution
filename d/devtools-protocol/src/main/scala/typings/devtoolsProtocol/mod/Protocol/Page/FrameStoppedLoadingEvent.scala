package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameStoppedLoadingEvent extends js.Object {
  /**
    * Id of the frame that has stopped loading.
    */
  var frameId: FrameId = js.native
}

object FrameStoppedLoadingEvent {
  @scala.inline
  def apply(frameId: FrameId): FrameStoppedLoadingEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameStoppedLoadingEvent]
  }
  @scala.inline
  implicit class FrameStoppedLoadingEventOps[Self <: FrameStoppedLoadingEvent] (val x: Self) extends AnyVal {
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
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
  }
  
}

