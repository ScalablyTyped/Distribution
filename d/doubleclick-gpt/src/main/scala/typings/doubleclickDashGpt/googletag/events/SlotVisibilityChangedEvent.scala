package typings.doubleclickDashGpt.googletag.events

import typings.doubleclickDashGpt.googletag.Slot
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

