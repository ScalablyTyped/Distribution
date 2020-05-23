package typings.gapiClientDfareporting.anon

import typings.gapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.gapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityFilters extends js.Object {
  /** The list of 'dfa:activity' values to filter on. */
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  /** The list of conversion dimensions the report should include. */
  var conversionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  /** The list of custom floodlight variables the report should include. */
  var customFloodlightVariables: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.gapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.undefined
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the
    * value needs to be 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.undefined
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of per interaction dimensions the report should include. */
  var perInteractionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  /** The properties of the report. */
  var reportProperties: js.UndefOr[ClicksLookbackWindow] = js.undefined
}

object ActivityFilters {
  @scala.inline
  def apply(
    activityFilters: js.Array[DimensionValue] = null,
    conversionDimensions: js.Array[SortedDimension] = null,
    customFloodlightVariables: js.Array[SortedDimension] = null,
    customRichMediaEvents: js.Array[DimensionValue] = null,
    dateRange: typings.gapiClientDfareporting.gapi.client.dfareporting.DateRange = null,
    floodlightConfigId: DimensionValue = null,
    metricNames: js.Array[String] = null,
    perInteractionDimensions: js.Array[SortedDimension] = null,
    reportProperties: ClicksLookbackWindow = null
  ): ActivityFilters = {
    val __obj = js.Dynamic.literal()
    if (activityFilters != null) __obj.updateDynamic("activityFilters")(activityFilters.asInstanceOf[js.Any])
    if (conversionDimensions != null) __obj.updateDynamic("conversionDimensions")(conversionDimensions.asInstanceOf[js.Any])
    if (customFloodlightVariables != null) __obj.updateDynamic("customFloodlightVariables")(customFloodlightVariables.asInstanceOf[js.Any])
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (floodlightConfigId != null) __obj.updateDynamic("floodlightConfigId")(floodlightConfigId.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (perInteractionDimensions != null) __obj.updateDynamic("perInteractionDimensions")(perInteractionDimensions.asInstanceOf[js.Any])
    if (reportProperties != null) __obj.updateDynamic("reportProperties")(reportProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityFilters]
  }
}

