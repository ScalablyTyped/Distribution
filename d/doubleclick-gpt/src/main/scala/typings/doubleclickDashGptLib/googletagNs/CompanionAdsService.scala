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
    addEventListener: js.Function2[
      java.lang.String, 
      js.Function1[
        /* event */ doubleclickDashGptLib.googletagNs.eventsNs.ImpressionViewableEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotOnloadEvent | doubleclickDashGptLib.googletagNs.eventsNs.SlotRenderEndedEvent | doubleclickDashGptLib.googletagNs.eventsNs.slotVisibilityChangedEvent, 
        scala.Unit
      ], 
      scala.Unit
    ],
    enableSyncLoading: js.Function0[scala.Unit],
    getSlots: js.Function0[js.Array[Slot]],
    setRefreshUnfilledSlots: js.Function1[scala.Boolean, scala.Unit]
  ): CompanionAdsService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("enableSyncLoading")(enableSyncLoading)
    __obj.updateDynamic("getSlots")(getSlots)
    __obj.updateDynamic("setRefreshUnfilledSlots")(setRefreshUnfilledSlots)
    __obj.asInstanceOf[CompanionAdsService]
  }
}

