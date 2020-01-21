package typings.doubleclickGpt.googletag.events

import typings.doubleclickGpt.googletag.Slot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var serviceName: String
  var slot: Slot
}

object Event {
  @scala.inline
  def apply(serviceName: String, slot: Slot): Event = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Event]
  }
}

