package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentService extends Service {
  def setContent(slot: Slot, content: java.lang.String): scala.Unit
}

object ContentService {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[
      /* event */ doubleclickDashGptLib.googletagNs.eventsNs.ImpressionViewableEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotOnloadEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotRenderEndedEvent | doubleclickDashGptLib.googletagNs.eventsNs.slotVisibilityChangedEvent, 
      scala.Unit
    ]) => scala.Unit,
    getSlots: () => js.Array[Slot],
    setContent: (Slot, java.lang.String) => scala.Unit
  ): ContentService = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), getSlots = js.Any.fromFunction0(getSlots), setContent = js.Any.fromFunction2(setContent))
  
    __obj.asInstanceOf[ContentService]
  }
}

