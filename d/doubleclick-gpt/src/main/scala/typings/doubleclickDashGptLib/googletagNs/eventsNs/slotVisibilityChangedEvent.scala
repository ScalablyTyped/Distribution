package typings
package doubleclickDashGptLib.googletagNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait slotVisibilityChangedEvent extends js.Object {
  var inViewPercentage: scala.Double
  var serviceName: java.lang.String
  var slot: doubleclickDashGptLib.googletagNs.Slot
}

object slotVisibilityChangedEvent {
  @scala.inline
  def apply(
    inViewPercentage: scala.Double,
    serviceName: java.lang.String,
    slot: doubleclickDashGptLib.googletagNs.Slot
  ): slotVisibilityChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inViewPercentage")(inViewPercentage)
    __obj.updateDynamic("serviceName")(serviceName)
    __obj.updateDynamic("slot")(slot)
    __obj.asInstanceOf[slotVisibilityChangedEvent]
  }
}

