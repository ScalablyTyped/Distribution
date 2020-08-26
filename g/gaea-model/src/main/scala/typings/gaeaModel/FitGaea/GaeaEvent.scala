package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaeaEvent extends js.Object {
  var effects: js.Array[EventAction] = js.native
  var triggers: js.Array[EventTriggerCondition] = js.native
}

object GaeaEvent {
  @scala.inline
  def apply(effects: js.Array[EventAction], triggers: js.Array[EventTriggerCondition]): GaeaEvent = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaeaEvent]
  }
  @scala.inline
  implicit class GaeaEventOps[Self <: GaeaEvent] (val x: Self) extends AnyVal {
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
    def setEffectsVarargs(value: EventAction*): Self = this.set("effects", js.Array(value :_*))
    @scala.inline
    def setEffects(value: js.Array[EventAction]): Self = this.set("effects", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggersVarargs(value: EventTriggerCondition*): Self = this.set("triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: js.Array[EventTriggerCondition]): Self = this.set("triggers", value.asInstanceOf[js.Any])
  }
  
}

