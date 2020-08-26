package typings.googleapis.anon

import typings.googleapis.v31Mod.dfareportingV31.SchemaDateRange
import typings.googleapis.v31Mod.dfareportingV31.SchemaDimensionValue
import typings.googleapis.v31Mod.dfareportingV31.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityFilters extends js.Object {
  var activityFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var conversionDimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var customFloodlightVariables: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var customRichMediaEvents: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var perInteractionDimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
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
    def setActivityFiltersVarargs(value: SchemaDimensionValue*): Self = this.set("activityFilters", js.Array(value :_*))
    @scala.inline
    def setActivityFilters(value: js.Array[SchemaDimensionValue]): Self = this.set("activityFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityFilters: Self = this.set("activityFilters", js.undefined)
    @scala.inline
    def setConversionDimensionsVarargs(value: SchemaSortedDimension*): Self = this.set("conversionDimensions", js.Array(value :_*))
    @scala.inline
    def setConversionDimensions(value: js.Array[SchemaSortedDimension]): Self = this.set("conversionDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionDimensions: Self = this.set("conversionDimensions", js.undefined)
    @scala.inline
    def setCustomFloodlightVariablesVarargs(value: SchemaSortedDimension*): Self = this.set("customFloodlightVariables", js.Array(value :_*))
    @scala.inline
    def setCustomFloodlightVariables(value: js.Array[SchemaSortedDimension]): Self = this.set("customFloodlightVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFloodlightVariables: Self = this.set("customFloodlightVariables", js.undefined)
    @scala.inline
    def setCustomRichMediaEventsVarargs(value: SchemaDimensionValue*): Self = this.set("customRichMediaEvents", js.Array(value :_*))
    @scala.inline
    def setCustomRichMediaEvents(value: js.Array[SchemaDimensionValue]): Self = this.set("customRichMediaEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomRichMediaEvents: Self = this.set("customRichMediaEvents", js.undefined)
    @scala.inline
    def setDateRange(value: SchemaDateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    @scala.inline
    def setFloodlightConfigId(value: SchemaDimensionValue): Self = this.set("floodlightConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightConfigId: Self = this.set("floodlightConfigId", js.undefined)
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = this.set("metricNames", js.Array(value :_*))
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = this.set("metricNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricNames: Self = this.set("metricNames", js.undefined)
    @scala.inline
    def setPerInteractionDimensionsVarargs(value: SchemaSortedDimension*): Self = this.set("perInteractionDimensions", js.Array(value :_*))
    @scala.inline
    def setPerInteractionDimensions(value: js.Array[SchemaSortedDimension]): Self = this.set("perInteractionDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerInteractionDimensions: Self = this.set("perInteractionDimensions", js.undefined)
    @scala.inline
    def setReportProperties(value: ClicksLookbackWindow): Self = this.set("reportProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportProperties: Self = this.set("reportProperties", js.undefined)
  }
  
}

