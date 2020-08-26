package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameNavigatedEvent extends js.Object {
  /**
    * Frame object.
    */
  var frame: Frame = js.native
}

object FrameNavigatedEvent {
  @scala.inline
  def apply(frame: Frame): FrameNavigatedEvent = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameNavigatedEvent]
  }
  @scala.inline
  implicit class FrameNavigatedEventOps[Self <: FrameNavigatedEvent] (val x: Self) extends AnyVal {
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
    def setFrame(value: Frame): Self = this.set("frame", value.asInstanceOf[js.Any])
  }
  
}

