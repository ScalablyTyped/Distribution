package typings
package doubleclickDashGptLib.googletagNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotVisibilityChangedEvent extends Event {
  var inViewPercentage: scala.Double
}

object SlotVisibilityChangedEvent {
  @scala.inline
  def apply(
    inViewPercentage: scala.Double,
    serviceName: java.lang.String,
    slot: doubleclickDashGptLib.googletagNs.Slot
  ): SlotVisibilityChangedEvent = {
    val __obj = js.Dynamic.literal(inViewPercentage = inViewPercentage, serviceName = serviceName, slot = slot)
  
    __obj.asInstanceOf[SlotVisibilityChangedEvent]
  }
}

