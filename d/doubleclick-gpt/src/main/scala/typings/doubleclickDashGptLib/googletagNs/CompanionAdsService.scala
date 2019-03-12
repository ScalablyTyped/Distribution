package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanionAdsService extends Service {
  def enableSyncLoading(): scala.Unit
  def setRefreshUnfilledSlots(value: scala.Boolean): scala.Unit
}

object CompanionAdsService {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[
      /* event */ doubleclickDashGptLib.googletagNs.eventsNs.ImpressionViewableEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotOnloadEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotRenderEndedEvent | doubleclickDashGptLib.googletagNs.eventsNs.slotVisibilityChangedEvent, 
      scala.Unit
    ]) => scala.Unit,
    enableSyncLoading: () => scala.Unit,
    getSlots: () => js.Array[Slot],
    setRefreshUnfilledSlots: scala.Boolean => scala.Unit
  ): CompanionAdsService = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), enableSyncLoading = js.Any.fromFunction0(enableSyncLoading), getSlots = js.Any.fromFunction0(getSlots), setRefreshUnfilledSlots = js.Any.fromFunction1(setRefreshUnfilledSlots))
  
    __obj.asInstanceOf[CompanionAdsService]
  }
}

