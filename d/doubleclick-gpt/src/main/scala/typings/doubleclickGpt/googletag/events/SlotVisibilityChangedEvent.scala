package typings.doubleclickGpt.googletag.events

import typings.doubleclickGpt.googletag.Slot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotVisibilityChangedEvent extends Event {
  var inViewPercentage: Double
}

object SlotVisibilityChangedEvent {
  @scala.inline
  def apply(inViewPercentage: Double, serviceName: String, slot: Slot): SlotVisibilityChangedEvent = {
    val __obj = js.Dynamic.literal(inViewPercentage = inViewPercentage.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotVisibilityChangedEvent]
  }
}

