package typings
package doubleclickDashGptLib.googletagNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImpressionViewableEvent extends js.Object {
  var serviceName: java.lang.String
  var slot: doubleclickDashGptLib.googletagNs.Slot
}

object ImpressionViewableEvent {
  @scala.inline
  def apply(serviceName: java.lang.String, slot: doubleclickDashGptLib.googletagNs.Slot): ImpressionViewableEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serviceName")(serviceName)
    __obj.updateDynamic("slot")(slot)
    __obj.asInstanceOf[ImpressionViewableEvent]
  }
}

