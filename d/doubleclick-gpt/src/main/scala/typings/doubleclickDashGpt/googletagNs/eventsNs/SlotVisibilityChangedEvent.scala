package typings.doubleclickDashGpt.googletagNs.eventsNs

import typings.doubleclickDashGpt.googletagNs.Slot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotVisibilityChangedEvent extends Event {
  var inViewPercentage: Double
}

object SlotVisibilityChangedEvent {
  @scala.inline
  def apply(inViewPercentage: Double, serviceName: String, slot: Slot): SlotVisibilityChangedEvent = {
    val __obj = js.Dynamic.literal(inViewPercentage = inViewPercentage, serviceName = serviceName, slot = slot)
  
    __obj.asInstanceOf[SlotVisibilityChangedEvent]
  }
}

