package typings.googleapis.buildSrcApisUrlshortenerV1Mod.urlshortener_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AnalyticsSummary extends js.Object {
  /**
    * Click analytics over all time.
    */
  var allTime: js.UndefOr[Schema$AnalyticsSnapshot] = js.native
  /**
    * Click analytics over the last day.
    */
  var day: js.UndefOr[Schema$AnalyticsSnapshot] = js.native
  /**
    * Click analytics over the last month.
    */
  var month: js.UndefOr[Schema$AnalyticsSnapshot] = js.native
  /**
    * Click analytics over the last two hours.
    */
  var twoHours: js.UndefOr[Schema$AnalyticsSnapshot] = js.native
  /**
    * Click analytics over the last week.
    */
  var week: js.UndefOr[Schema$AnalyticsSnapshot] = js.native
}

object Schema$AnalyticsSummary {
  @scala.inline
  def apply(
    allTime: Schema$AnalyticsSnapshot = null,
    day: Schema$AnalyticsSnapshot = null,
    month: Schema$AnalyticsSnapshot = null,
    twoHours: Schema$AnalyticsSnapshot = null,
    week: Schema$AnalyticsSnapshot = null
  ): Schema$AnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    if (allTime != null) __obj.updateDynamic("allTime")(allTime.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (twoHours != null) __obj.updateDynamic("twoHours")(twoHours.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyticsSummary]
  }
}

