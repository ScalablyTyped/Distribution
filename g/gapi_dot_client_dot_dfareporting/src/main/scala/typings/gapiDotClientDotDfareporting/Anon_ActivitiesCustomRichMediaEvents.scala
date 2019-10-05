package typings.gapiDotClientDotDfareporting

import typings.gapiDotClientDotDfareporting.gapi.client.dfareporting.Activities
import typings.gapiDotClientDotDfareporting.gapi.client.dfareporting.CustomRichMediaEvents
import typings.gapiDotClientDotDfareporting.gapi.client.dfareporting.DateRange
import typings.gapiDotClientDotDfareporting.gapi.client.dfareporting.DimensionValue
import typings.gapiDotClientDotDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActivitiesCustomRichMediaEvents extends js.Object {
  /** Activity group. */
  var activities: js.UndefOr[Activities] = js.undefined
  /** Custom Rich Media Events group. */
  var customRichMediaEvents: js.UndefOr[CustomRichMediaEvents] = js.undefined
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  /**
    * The list of filters on which dimensions are filtered.
    * Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed.
    */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  /** The list of dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  /**
    * Whether to enable all reach dimension combinations in the report. Defaults to false. If enabled, the date range of the report should be within the last
    * three months.
    */
  var enableAllDimensionCombinations: js.UndefOr[Boolean] = js.undefined
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of names of  Reach By Frequency metrics the report should include. */
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_ActivitiesCustomRichMediaEvents {
  @scala.inline
  def apply(
    activities: Activities = null,
    customRichMediaEvents: CustomRichMediaEvents = null,
    dateRange: DateRange = null,
    dimensionFilters: js.Array[DimensionValue] = null,
    dimensions: js.Array[SortedDimension] = null,
    enableAllDimensionCombinations: js.UndefOr[Boolean] = js.undefined,
    metricNames: js.Array[String] = null,
    reachByFrequencyMetricNames: js.Array[String] = null
  ): Anon_ActivitiesCustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents)
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (!js.isUndefined(enableAllDimensionCombinations)) __obj.updateDynamic("enableAllDimensionCombinations")(enableAllDimensionCombinations)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    if (reachByFrequencyMetricNames != null) __obj.updateDynamic("reachByFrequencyMetricNames")(reachByFrequencyMetricNames)
    __obj.asInstanceOf[Anon_ActivitiesCustomRichMediaEvents]
  }
}

