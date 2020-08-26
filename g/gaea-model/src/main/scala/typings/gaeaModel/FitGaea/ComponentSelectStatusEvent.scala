package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentSelectStatusEvent extends js.Object {
  var mapUniqueKey: String = js.native
  var selected: Boolean = js.native
}

object ComponentSelectStatusEvent {
  @scala.inline
  def apply(mapUniqueKey: String, selected: Boolean): ComponentSelectStatusEvent = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSelectStatusEvent]
  }
  @scala.inline
  implicit class ComponentSelectStatusEventOps[Self <: ComponentSelectStatusEvent] (val x: Self) extends AnyVal {
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
    def setMapUniqueKey(value: String): Self = this.set("mapUniqueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}

