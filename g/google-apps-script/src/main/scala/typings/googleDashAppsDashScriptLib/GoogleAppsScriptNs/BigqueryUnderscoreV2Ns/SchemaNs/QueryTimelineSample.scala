package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTimelineSample extends js.Object {
  var activeUnits: js.UndefOr[java.lang.String] = js.undefined
  var completedUnits: js.UndefOr[java.lang.String] = js.undefined
  var elapsedMs: js.UndefOr[java.lang.String] = js.undefined
  var pendingUnits: js.UndefOr[java.lang.String] = js.undefined
  var totalSlotMs: js.UndefOr[java.lang.String] = js.undefined
}

object QueryTimelineSample {
  @scala.inline
  def apply(
    activeUnits: java.lang.String = null,
    completedUnits: java.lang.String = null,
    elapsedMs: java.lang.String = null,
    pendingUnits: java.lang.String = null,
    totalSlotMs: java.lang.String = null
  ): QueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    if (activeUnits != null) __obj.updateDynamic("activeUnits")(activeUnits)
    if (completedUnits != null) __obj.updateDynamic("completedUnits")(completedUnits)
    if (elapsedMs != null) __obj.updateDynamic("elapsedMs")(elapsedMs)
    if (pendingUnits != null) __obj.updateDynamic("pendingUnits")(pendingUnits)
    if (totalSlotMs != null) __obj.updateDynamic("totalSlotMs")(totalSlotMs)
    __obj.asInstanceOf[QueryTimelineSample]
  }
}

