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

