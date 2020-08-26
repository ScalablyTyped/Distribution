package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventActionEvent extends js.Object {
  var emit: js.UndefOr[String] = js.native
}

object EventActionEvent {
  @scala.inline
  def apply(): EventActionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventActionEvent]
  }
  @scala.inline
  implicit class EventActionEventOps[Self <: EventActionEvent] (val x: Self) extends AnyVal {
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
    def setEmit(value: String): Self = this.set("emit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmit: Self = this.set("emit", js.undefined)
  }
  
}

