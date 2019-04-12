package typings
package doubleclickDashGptLib.googletagNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var serviceName: java.lang.String
  var slot: doubleclickDashGptLib.googletagNs.Slot
}

object Event {
  @scala.inline
  def apply(serviceName: java.lang.String, slot: doubleclickDashGptLib.googletagNs.Slot): Event = {
    val __obj = js.Dynamic.literal(serviceName = serviceName, slot = slot)
  
    __obj.asInstanceOf[Event]
  }
}

