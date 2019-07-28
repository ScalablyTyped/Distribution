package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportCrossDimensionReachCriteria extends js.Object {
  var breakdown: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  var dateRange: js.UndefOr[DateRange] = js.undefined
  var dimension: js.UndefOr[String] = js.undefined
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.undefined
  var pivoted: js.UndefOr[Boolean] = js.undefined
}

object ReportCrossDimensionReachCriteria {
  @scala.inline
  def apply(
    breakdown: js.Array[SortedDimension] = null,
    dateRange: DateRange = null,
    dimension: String = null,
    dimensionFilters: js.Array[DimensionValue] = null,
    metricNames: js.Array[String] = null,
    overlapMetricNames: js.Array[String] = null,
    pivoted: js.UndefOr[Boolean] = js.undefined
  ): ReportCrossDimensionReachCriteria = {
    val __obj = js.Dynamic.literal()
    if (breakdown != null) __obj.updateDynamic("breakdown")(breakdown)
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    if (overlapMetricNames != null) __obj.updateDynamic("overlapMetricNames")(overlapMetricNames)
    if (!js.isUndefined(pivoted)) __obj.updateDynamic("pivoted")(pivoted)
    __obj.asInstanceOf[ReportCrossDimensionReachCriteria]
  }
}

