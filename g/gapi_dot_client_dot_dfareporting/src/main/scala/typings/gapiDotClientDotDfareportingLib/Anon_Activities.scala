package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Activities extends js.Object {
  /** Activity group. */
  var activities: js.UndefOr[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.Activities] = js.undefined
  /** Custom Rich Media Events group. */
  var customRichMediaEvents: js.UndefOr[
    gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.CustomRichMediaEvents
  ] = js.undefined
  /** The date range for which this report should be run. */
  var dateRange: js.UndefOr[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DateRange] = js.undefined
  /**
    * The list of filters on which dimensions are filtered.
    * Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed.
    */
  var dimensionFilters: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue]
  ] = js.undefined
  /** The list of standard dimensions the report should include. */
  var dimensions: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension]
  ] = js.undefined
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Activities {
  @scala.inline
  def apply(
    activities: gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.Activities = null,
    customRichMediaEvents: gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.CustomRichMediaEvents = null,
    dateRange: gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DateRange = null,
    dimensionFilters: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue] = null,
    dimensions: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension] = null,
    metricNames: js.Array[java.lang.String] = null
  ): Anon_Activities = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents)
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    __obj.asInstanceOf[Anon_Activities]
  }
}

