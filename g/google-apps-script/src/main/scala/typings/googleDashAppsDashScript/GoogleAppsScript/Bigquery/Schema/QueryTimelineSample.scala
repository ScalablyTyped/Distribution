package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTimelineSample extends js.Object {
  var activeUnits: js.UndefOr[String] = js.undefined
  var completedUnits: js.UndefOr[String] = js.undefined
  var elapsedMs: js.UndefOr[String] = js.undefined
  var pendingUnits: js.UndefOr[String] = js.undefined
  var totalSlotMs: js.UndefOr[String] = js.undefined
}

object QueryTimelineSample {
  @scala.inline
  def apply(
    activeUnits: String = null,
    completedUnits: String = null,
    elapsedMs: String = null,
    pendingUnits: String = null,
    totalSlotMs: String = null
  ): QueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    if (activeUnits != null) __obj.updateDynamic("activeUnits")(activeUnits.asInstanceOf[js.Any])
    if (completedUnits != null) __obj.updateDynamic("completedUnits")(completedUnits.asInstanceOf[js.Any])
    if (elapsedMs != null) __obj.updateDynamic("elapsedMs")(elapsedMs.asInstanceOf[js.Any])
    if (pendingUnits != null) __obj.updateDynamic("pendingUnits")(pendingUnits.asInstanceOf[js.Any])
    if (totalSlotMs != null) __obj.updateDynamic("totalSlotMs")(totalSlotMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTimelineSample]
  }
}

