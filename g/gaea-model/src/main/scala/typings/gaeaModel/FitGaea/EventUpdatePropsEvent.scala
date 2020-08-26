package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventUpdatePropsEvent extends js.Object {
  /**
    * 修改后的 props
    */
  var props: ComponentProps = js.native
}

object EventUpdatePropsEvent {
  @scala.inline
  def apply(props: ComponentProps): EventUpdatePropsEvent = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventUpdatePropsEvent]
  }
  @scala.inline
  implicit class EventUpdatePropsEventOps[Self <: EventUpdatePropsEvent] (val x: Self) extends AnyVal {
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
    def setProps(value: ComponentProps): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}

