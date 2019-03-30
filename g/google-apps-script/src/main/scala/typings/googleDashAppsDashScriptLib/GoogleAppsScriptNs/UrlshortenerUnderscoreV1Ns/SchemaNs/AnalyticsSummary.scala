package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs

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
    if (allTime != null) __obj.updateDynamic("allTime")(allTime)
    if (day != null) __obj.updateDynamic("day")(day)
    if (month != null) __obj.updateDynamic("month")(month)
    if (twoHours != null) __obj.updateDynamic("twoHours")(twoHours)
    if (week != null) __obj.updateDynamic("week")(week)
    __obj.asInstanceOf[AnalyticsSummary]
  }
}

