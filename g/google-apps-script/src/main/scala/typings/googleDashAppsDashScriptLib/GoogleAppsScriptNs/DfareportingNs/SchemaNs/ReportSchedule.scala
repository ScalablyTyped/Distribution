package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportSchedule extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var every: js.UndefOr[scala.Double] = js.undefined
  var expirationDate: js.UndefOr[java.lang.String] = js.undefined
  var repeats: js.UndefOr[java.lang.String] = js.undefined
  var repeatsOnWeekDays: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var runsOnDayOfMonth: js.UndefOr[java.lang.String] = js.undefined
  var startDate: js.UndefOr[java.lang.String] = js.undefined
}

object ReportSchedule {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    every: scala.Int | scala.Double = null,
    expirationDate: java.lang.String = null,
    repeats: java.lang.String = null,
    repeatsOnWeekDays: js.Array[java.lang.String] = null,
    runsOnDayOfMonth: java.lang.String = null,
    startDate: java.lang.String = null
  ): ReportSchedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (every != null) __obj.updateDynamic("every")(every.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (repeats != null) __obj.updateDynamic("repeats")(repeats)
    if (repeatsOnWeekDays != null) __obj.updateDynamic("repeatsOnWeekDays")(repeatsOnWeekDays)
    if (runsOnDayOfMonth != null) __obj.updateDynamic("runsOnDayOfMonth")(runsOnDayOfMonth)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[ReportSchedule]
  }
}

