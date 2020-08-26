package typings.gapiClientDfareporting.anon

import typings.gapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.gapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityFilters extends js.Object {
  /** The list of 'dfa:activity' values to filter on. */
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The list of conversion dimensions the report should include. */
  var conversionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  /** The list of custom floodlight variables the report should include. */
  var customFloodlightVariables: js.UndefOr[js.Array[SortedDimension]] = js.native
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.gapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.native
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the
    * value needs to be 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.native
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  /** The list of per interaction dimensions the report should include. */
  var perInteractionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  /** The properties of the report. */
  var reportProperties: js.UndefOr[ClicksLookbackWindow] = js.native
}

object ActivityFilters {
  @scala.inline
  def apply(): ActivityFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityFilters]
  }
  @scala.inline
  implicit class ActivityFiltersOps[Self <: ActivityFilters] (val x: Self) extends AnyVal {
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
    def setDateRange(value: typings.gapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
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
    def setReportProperties(value: ClicksLookbackWindow): Self = this.set("reportProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportProperties: Self = this.set("reportProperties", js.undefined)
  }
  
}

