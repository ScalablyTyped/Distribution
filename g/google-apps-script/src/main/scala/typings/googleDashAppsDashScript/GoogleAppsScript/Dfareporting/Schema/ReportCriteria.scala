package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportCriteria extends js.Object {
  var activities: js.UndefOr[Activities] = js.undefined
  var customRichMediaEvents: js.UndefOr[CustomRichMediaEvents] = js.undefined
  var dateRange: js.UndefOr[DateRange] = js.undefined
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
}

object ReportCriteria {
  @scala.inline
  def apply(
    activities: Activities = null,
    customRichMediaEvents: CustomRichMediaEvents = null,
    dateRange: DateRange = null,
    dimensionFilters: js.Array[DimensionValue] = null,
    dimensions: js.Array[SortedDimension] = null,
    metricNames: js.Array[String] = null
  ): ReportCriteria = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportCriteria]
  }
}

