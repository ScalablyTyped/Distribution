package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportFloodlightCriteria extends js.Object {
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  var dateRange: js.UndefOr[DateRange] = js.undefined
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.undefined
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  var reportProperties: js.UndefOr[ReportFloodlightCriteriaReportProperties] = js.undefined
}

object ReportFloodlightCriteria {
  @scala.inline
  def apply(
    customRichMediaEvents: js.Array[DimensionValue] = null,
    dateRange: DateRange = null,
    dimensionFilters: js.Array[DimensionValue] = null,
    dimensions: js.Array[SortedDimension] = null,
    floodlightConfigId: DimensionValue = null,
    metricNames: js.Array[String] = null,
    reportProperties: ReportFloodlightCriteriaReportProperties = null
  ): ReportFloodlightCriteria = {
    val __obj = js.Dynamic.literal()
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents)
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (floodlightConfigId != null) __obj.updateDynamic("floodlightConfigId")(floodlightConfigId)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    if (reportProperties != null) __obj.updateDynamic("reportProperties")(reportProperties)
    __obj.asInstanceOf[ReportFloodlightCriteria]
  }
}

