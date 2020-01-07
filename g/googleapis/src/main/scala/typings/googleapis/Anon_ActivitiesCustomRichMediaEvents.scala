package typings.googleapis

import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$Activities
import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$CustomRichMediaEvents
import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$DateRange
import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$DimensionValue
import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActivitiesCustomRichMediaEvents extends js.Object {
  var activities: js.UndefOr[Schema$Activities] = js.native
  var customRichMediaEvents: js.UndefOr[Schema$CustomRichMediaEvents] = js.native
  var dateRange: js.UndefOr[Schema$DateRange] = js.native
  var dimensionFilters: js.UndefOr[js.Array[Schema$DimensionValue]] = js.native
  var dimensions: js.UndefOr[js.Array[Schema$SortedDimension]] = js.native
  var enableAllDimensionCombinations: js.UndefOr[Boolean] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[String]] = js.native
}

object Anon_ActivitiesCustomRichMediaEvents {
  @scala.inline
  def apply(
    activities: Schema$Activities = null,
    customRichMediaEvents: Schema$CustomRichMediaEvents = null,
    dateRange: Schema$DateRange = null,
    dimensionFilters: js.Array[Schema$DimensionValue] = null,
    dimensions: js.Array[Schema$SortedDimension] = null,
    enableAllDimensionCombinations: js.UndefOr[Boolean] = js.undefined,
    metricNames: js.Array[String] = null,
    reachByFrequencyMetricNames: js.Array[String] = null
  ): Anon_ActivitiesCustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAllDimensionCombinations)) __obj.updateDynamic("enableAllDimensionCombinations")(enableAllDimensionCombinations.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (reachByFrequencyMetricNames != null) __obj.updateDynamic("reachByFrequencyMetricNames")(reachByFrequencyMetricNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActivitiesCustomRichMediaEvents]
  }
}

