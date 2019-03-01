package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActivitiesCustomRichMediaEvents extends js.Object {
  /** Activity group. */
  var activities: js.UndefOr[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.Activities] = js.undefined
  /** Custom Rich Media Events group. */
  var customRichMediaEvents: js.UndefOr[
    gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.CustomRichMediaEvents
  ] = js.undefined
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DateRange] = js.undefined
  /**
    * The list of filters on which dimensions are filtered.
    * Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed.
    */
  var dimensionFilters: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue]
  ] = js.undefined
  /** The list of dimensions the report should include. */
  var dimensions: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension]
  ] = js.undefined
  /**
    * Whether to enable all reach dimension combinations in the report. Defaults to false. If enabled, the date range of the report should be within the last
    * three months.
    */
  var enableAllDimensionCombinations: js.UndefOr[scala.Boolean] = js.undefined
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of names of  Reach By Frequency metrics the report should include. */
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_ActivitiesCustomRichMediaEvents {
  @scala.inline
  def apply(
    activities: gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.Activities = null,
    customRichMediaEvents: gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.CustomRichMediaEvents = null,
    dateRange: gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DateRange = null,
    dimensionFilters: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue] = null,
    dimensions: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension] = null,
    enableAllDimensionCombinations: js.UndefOr[scala.Boolean] = js.undefined,
    metricNames: js.Array[java.lang.String] = null,
    reachByFrequencyMetricNames: js.Array[java.lang.String] = null
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

