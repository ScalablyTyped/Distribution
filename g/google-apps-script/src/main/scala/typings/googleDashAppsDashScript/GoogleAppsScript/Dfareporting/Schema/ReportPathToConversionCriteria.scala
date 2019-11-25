package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportPathToConversionCriteria extends js.Object {
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  var conversionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  var customFloodlightVariables: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  var dateRange: js.UndefOr[DateRange] = js.undefined
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.undefined
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  var perInteractionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  var reportProperties: js.UndefOr[ReportPathToConversionCriteriaReportProperties] = js.undefined
}

object ReportPathToConversionCriteria {
  @scala.inline
  def apply(
    activityFilters: js.Array[DimensionValue] = null,
    conversionDimensions: js.Array[SortedDimension] = null,
    customFloodlightVariables: js.Array[SortedDimension] = null,
    customRichMediaEvents: js.Array[DimensionValue] = null,
    dateRange: DateRange = null,
    floodlightConfigId: DimensionValue = null,
    metricNames: js.Array[String] = null,
    perInteractionDimensions: js.Array[SortedDimension] = null,
    reportProperties: ReportPathToConversionCriteriaReportProperties = null
  ): ReportPathToConversionCriteria = {
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
    __obj.asInstanceOf[ReportPathToConversionCriteria]
  }
}

