package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportSchedule extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var every: js.UndefOr[Double] = js.undefined
  var expirationDate: js.UndefOr[String] = js.undefined
  var repeats: js.UndefOr[String] = js.undefined
  var repeatsOnWeekDays: js.UndefOr[js.Array[String]] = js.undefined
  var runsOnDayOfMonth: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
}

object ReportSchedule {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    every: Int | Double = null,
    expirationDate: String = null,
    repeats: String = null,
    repeatsOnWeekDays: js.Array[String] = null,
    runsOnDayOfMonth: String = null,
    startDate: String = null
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

