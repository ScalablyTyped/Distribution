package typings.doubleclickDashGpt.googletagNs.eventsNs

import typings.doubleclickDashGpt.googletagNs.Slot
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
    val __obj = js.Dynamic.literal(serviceName = serviceName, slot = slot)
  
    __obj.asInstanceOf[Event]
  }
}

