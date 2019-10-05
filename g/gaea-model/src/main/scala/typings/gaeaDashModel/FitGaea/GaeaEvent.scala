package typings.gaeaDashModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaeaEvent extends js.Object {
  var effects: js.Array[EventAction]
  var triggers: js.Array[EventTriggerCondition]
}

object GaeaEvent {
  @scala.inline
  def apply(effects: js.Array[EventAction], triggers: js.Array[EventTriggerCondition]): GaeaEvent = {
    val __obj = js.Dynamic.literal(effects = effects, triggers = triggers)
  
    __obj.asInstanceOf[GaeaEvent]
  }
}

