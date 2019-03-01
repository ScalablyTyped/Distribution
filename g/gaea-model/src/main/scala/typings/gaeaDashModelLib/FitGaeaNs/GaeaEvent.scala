package typings
package gaeaDashModelLib.FitGaeaNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("effects")(effects)
    __obj.updateDynamic("triggers")(triggers)
    __obj.asInstanceOf[GaeaEvent]
  }
}

