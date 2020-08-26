package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInfoChangedEvent extends js.Object {
  var targetInfo: TargetInfo = js.native
}

object TargetInfoChangedEvent {
  @scala.inline
  def apply(targetInfo: TargetInfo): TargetInfoChangedEvent = {
    val __obj = js.Dynamic.literal(targetInfo = targetInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfoChangedEvent]
  }
  @scala.inline
  implicit class TargetInfoChangedEventOps[Self <: TargetInfoChangedEvent] (val x: Self) extends AnyVal {
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
    def setTargetInfo(value: TargetInfo): Self = this.set("targetInfo", value.asInstanceOf[js.Any])
  }
  
}

