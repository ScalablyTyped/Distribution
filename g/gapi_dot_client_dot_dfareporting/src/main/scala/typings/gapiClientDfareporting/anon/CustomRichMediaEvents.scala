package typings.gapiClientDfareporting.anon

import typings.gapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.gapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomRichMediaEvents extends js.Object {
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.gapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.native
  /**
    * The list of filters on which dimensions are filtered.
    * Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed.
    */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The list of dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the
    * value needs to be 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.native
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  /** The properties of the report. */
  var reportProperties: js.UndefOr[IncludeAttributedIPConversions] = js.native
}

object CustomRichMediaEvents {
  @scala.inline
  def apply(): CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRichMediaEvents]
  }
  @scala.inline
  implicit class CustomRichMediaEventsOps[Self <: CustomRichMediaEvents] (val x: Self) extends AnyVal {
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
    def setDimensionFiltersVarargs(value: DimensionValue*): Self = this.set("dimensionFilters", js.Array(value :_*))
    @scala.inline
    def setDimensionFilters(value: js.Array[DimensionValue]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    @scala.inline
    def setDimensionsVarargs(value: SortedDimension*): Self = this.set("dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[SortedDimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
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
    def setReportProperties(value: IncludeAttributedIPConversions): Self = this.set("reportProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportProperties: Self = this.set("reportProperties", js.undefined)
  }
  
}

