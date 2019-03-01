package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActivityFilters extends js.Object {
  /** The list of 'dfa:activity' values to filter on. */
  var activityFilters: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue]
  ] = js.undefined
  /** The list of conversion dimensions the report should include. */
  var conversionDimensions: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension]
  ] = js.undefined
  /** The list of custom floodlight variables the report should include. */
  var customFloodlightVariables: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension]
  ] = js.undefined
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue]
  ] = js.undefined
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DateRange] = js.undefined
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the
    * value needs to be 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue] = js.undefined
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of per interaction dimensions the report should include. */
  var perInteractionDimensions: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension]
  ] = js.undefined
  /** The properties of the report. */
  var reportProperties: js.UndefOr[Anon_ClicksLookbackWindow] = js.undefined
}

object Anon_ActivityFilters {
  @scala.inline
  def apply(
    activityFilters: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue] = null,
    conversionDimensions: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension] = null,
    customFloodlightVariables: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension] = null,
    customRichMediaEvents: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue] = null,
    dateRange: gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DateRange = null,
    floodlightConfigId: gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue = null,
    metricNames: js.Array[java.lang.String] = null,
    perInteractionDimensions: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension] = null,
    reportProperties: Anon_ClicksLookbackWindow = null
  ): Anon_ActivityFilters = {
    val __obj = js.Dynamic.literal()
    if (activityFilters != null) __obj.updateDynamic("activityFilters")(activityFilters)
    if (conversionDimensions != null) __obj.updateDynamic("conversionDimensions")(conversionDimensions)
    if (customFloodlightVariables != null) __obj.updateDynamic("customFloodlightVariables")(customFloodlightVariables)
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents)
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (floodlightConfigId != null) __obj.updateDynamic("floodlightConfigId")(floodlightConfigId)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    if (perInteractionDimensions != null) __obj.updateDynamic("perInteractionDimensions")(perInteractionDimensions)
    if (reportProperties != null) __obj.updateDynamic("reportProperties")(reportProperties)
    __obj.asInstanceOf[Anon_ActivityFilters]
  }
}

