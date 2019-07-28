package typings.gapiDotClientDotDfareporting

import typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs.DateRange
import typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs.DimensionValue
import typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomRichMediaEvents extends js.Object {
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.undefined
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
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the
    * value needs to be 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.undefined
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  /** The properties of the report. */
  var reportProperties: js.UndefOr[Anon_IncludeAttributedIPConversions] = js.undefined
}

object Anon_CustomRichMediaEvents {
  @scala.inline
  def apply(
    customRichMediaEvents: js.Array[DimensionValue] = null,
    dateRange: DateRange = null,
    dimensionFilters: js.Array[DimensionValue] = null,
    dimensions: js.Array[SortedDimension] = null,
    floodlightConfigId: DimensionValue = null,
    metricNames: js.Array[String] = null,
    reportProperties: Anon_IncludeAttributedIPConversions = null
  ): Anon_CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents)
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (floodlightConfigId != null) __obj.updateDynamic("floodlightConfigId")(floodlightConfigId)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    if (reportProperties != null) __obj.updateDynamic("reportProperties")(reportProperties)
    __obj.asInstanceOf[Anon_CustomRichMediaEvents]
  }
}

