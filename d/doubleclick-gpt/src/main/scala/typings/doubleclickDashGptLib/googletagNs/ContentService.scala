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
    addEventListener: js.Function2[
      java.lang.String, 
      js.Function1[
        /* event */ doubleclickDashGptLib.googletagNs.eventsNs.ImpressionViewableEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotOnloadEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotRenderEndedEvent | doubleclickDashGptLib.googletagNs.eventsNs.slotVisibilityChangedEvent, 
        scala.Unit
      ], 
      scala.Unit
    ],
    getSlots: js.Function0[js.Array[Slot]],
    setContent: js.Function2[Slot, java.lang.String, scala.Unit]
  ): ContentService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("getSlots")(getSlots)
    __obj.updateDynamic("setContent")(setContent)
    __obj.asInstanceOf[ContentService]
  }
}

