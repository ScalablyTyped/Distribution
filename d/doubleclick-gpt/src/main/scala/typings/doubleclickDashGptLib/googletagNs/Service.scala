package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  def addEventListener(
    eventType: java.lang.String,
    listener: js.Function1[
      /* event */ doubleclickDashGptLib.googletagNs.eventsNs.ImpressionViewableEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotOnloadEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotRenderEndedEvent | doubleclickDashGptLib.googletagNs.eventsNs.slotVisibilityChangedEvent, 
      scala.Unit
    ]
  ): scala.Unit
  def getSlots(): js.Array[Slot]
}

object Service {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[
      /* event */ doubleclickDashGptLib.googletagNs.eventsNs.ImpressionViewableEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotOnloadEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotRenderEndedEvent | doubleclickDashGptLib.googletagNs.eventsNs.slotVisibilityChangedEvent, 
      scala.Unit
    ]) => scala.Unit,
    getSlots: () => js.Array[Slot]
  ): Service = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), getSlots = js.Any.fromFunction0(getSlots))
  
    __obj.asInstanceOf[Service]
  }
}

