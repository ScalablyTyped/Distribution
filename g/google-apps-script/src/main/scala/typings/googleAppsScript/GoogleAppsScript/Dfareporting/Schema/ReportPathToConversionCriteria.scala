package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportPathToConversionCriteria extends js.Object {
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  var conversionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  var customFloodlightVariables: js.UndefOr[js.Array[SortedDimension]] = js.native
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.native
  var dateRange: js.UndefOr[DateRange] = js.native
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var perInteractionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  var reportProperties: js.UndefOr[ReportPathToConversionCriteriaReportProperties] = js.native
}

object ReportPathToConversionCriteria {
  @scala.inline
  def apply(): ReportPathToConversionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportPathToConversionCriteria]
  }
  @scala.inline
  implicit class ReportPathToConversionCriteriaOps[Self <: ReportPathToConversionCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivityFiltersVarargs(value: DimensionValue*): Self = this.set("activityFilters", js.Array(value :_*))
    @scala.inline
    def setActivityFilters(value: js.Array[DimensionValue]): Self = this.set("activityFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityFilters: Self = this.set("activityFilters", js.undefined)
    @scala.inline
    def setConversionDimensionsVarargs(value: SortedDimension*): Self = this.set("conversionDimensions", js.Array(value :_*))
    @scala.inline
    def setConversionDimensions(value: js.Array[SortedDimension]): Self = this.set("conversionDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionDimensions: Self = this.set("conversionDimensions", js.undefined)
    @scala.inline
    def setCustomFloodlightVariablesVarargs(value: SortedDimension*): Self = this.set("customFloodlightVariables", js.Array(value :_*))
    @scala.inline
    def setCustomFloodlightVariables(value: js.Array[SortedDimension]): Self = this.set("customFloodlightVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFloodlightVariables: Self = this.set("customFloodlightVariables", js.undefined)
    @scala.inline
    def setCustomRichMediaEventsVarargs(value: DimensionValue*): Self = this.set("customRichMediaEvents", js.Array(value :_*))
    @scala.inline
    def setCustomRichMediaEvents(value: js.Array[DimensionValue]): Self = this.set("customRichMediaEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomRichMediaEvents: Self = this.set("customRichMediaEvents", js.undefined)
    @scala.inline
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    @scala.inline
    def setFloodlightConfigId(value: DimensionValue): Self = this.set("floodlightConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightConfigId: Self = this.set("floodlightConfigId", js.undefined)
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = this.set("metricNames", js.Array(value :_*))
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = this.set("metricNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricNames: Self = this.set("metricNames", js.undefined)
    @scala.inline
    def setPerInteractionDimensionsVarargs(value: SortedDimension*): Self = this.set("perInteractionDimensions", js.Array(value :_*))
    @scala.inline
    def setPerInteractionDimensions(value: js.Array[SortedDimension]): Self = this.set("perInteractionDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerInteractionDimensions: Self = this.set("perInteractionDimensions", js.undefined)
    @scala.inline
    def setReportProperties(value: ReportPathToConversionCriteriaReportProperties): Self = this.set("reportProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportProperties: Self = this.set("reportProperties", js.undefined)
  }
  
}

