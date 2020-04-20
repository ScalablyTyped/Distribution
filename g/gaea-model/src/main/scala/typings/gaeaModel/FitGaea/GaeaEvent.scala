package typings.gaeaModel.FitGaea

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
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaeaEvent]
  }
}

