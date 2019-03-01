package typings
package doubleclickDashGptLib.googletagNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotOnloadEvent extends js.Object {
  var serviceName: java.lang.String
  var slot: doubleclickDashGptLib.googletagNs.Slot
}

object SlotOnloadEvent {
  @scala.inline
  def apply(serviceName: java.lang.String, slot: doubleclickDashGptLib.googletagNs.Slot): SlotOnloadEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serviceName")(serviceName)
    __obj.updateDynamic("slot")(slot)
    __obj.asInstanceOf[SlotOnloadEvent]
  }
}

