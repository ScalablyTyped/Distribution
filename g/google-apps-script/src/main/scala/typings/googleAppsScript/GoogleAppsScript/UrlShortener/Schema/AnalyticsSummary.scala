package typings.googleAppsScript.GoogleAppsScript.UrlShortener.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsSummary extends js.Object {
  var allTime: js.UndefOr[AnalyticsSnapshot] = js.undefined
  var day: js.UndefOr[AnalyticsSnapshot] = js.undefined
  var month: js.UndefOr[AnalyticsSnapshot] = js.undefined
  var twoHours: js.UndefOr[AnalyticsSnapshot] = js.undefined
  var week: js.UndefOr[AnalyticsSnapshot] = js.undefined
}

object AnalyticsSummary {
  @scala.inline
  def apply(
    allTime: AnalyticsSnapshot = null,
    day: AnalyticsSnapshot = null,
    month: AnalyticsSnapshot = null,
    twoHours: AnalyticsSnapshot = null,
    week: AnalyticsSnapshot = null
  ): AnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    if (allTime != null) __obj.updateDynamic("allTime")(allTime.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (twoHours != null) __obj.updateDynamic("twoHours")(twoHours.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsSummary]
  }
}

