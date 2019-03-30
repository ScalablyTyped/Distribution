package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportReachCriteria extends js.Object {
  var activities: js.UndefOr[Activities] = js.undefined
  var customRichMediaEvents: js.UndefOr[CustomRichMediaEvents] = js.undefined
  var dateRange: js.UndefOr[DateRange] = js.undefined
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  var enableAllDimensionCombinations: js.UndefOr[scala.Boolean] = js.undefined
  var metricNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ReportReachCriteria {
  @scala.inline
  def apply(
    activities: Activities = null,
    customRichMediaEvents: CustomRichMediaEvents = null,
    dateRange: DateRange = null,
    dimensionFilters: js.Array[DimensionValue] = null,
    dimensions: js.Array[SortedDimension] = null,
    enableAllDimensionCombinations: js.UndefOr[scala.Boolean] = js.undefined,
    metricNames: js.Array[java.lang.String] = null,
    reachByFrequencyMetricNames: js.Array[java.lang.String] = null
  ): ReportReachCriteria = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents)
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (!js.isUndefined(enableAllDimensionCombinations)) __obj.updateDynamic("enableAllDimensionCombinations")(enableAllDimensionCombinations)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    if (reachByFrequencyMetricNames != null) __obj.updateDynamic("reachByFrequencyMetricNames")(reachByFrequencyMetricNames)
    __obj.asInstanceOf[ReportReachCriteria]
  }
}

