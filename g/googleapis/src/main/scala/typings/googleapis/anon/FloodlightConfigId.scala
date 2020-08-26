package typings.googleapis.anon

import typings.googleapis.v32Mod.dfareportingV32.SchemaDateRange
import typings.googleapis.v32Mod.dfareportingV32.SchemaDimensionValue
import typings.googleapis.v32Mod.dfareportingV32.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightConfigId extends js.Object {
  var customRichMediaEvents: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var reportProperties: js.UndefOr[IncludeAttributedIPConversions] = js.native
}

object FloodlightConfigId {
  @scala.inline
  def apply(): FloodlightConfigId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightConfigId]
  }
  @scala.inline
  implicit class FloodlightConfigIdOps[Self <: FloodlightConfigId] (val x: Self) extends AnyVal {
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
    def setDimensionFiltersVarargs(value: SchemaDimensionValue*): Self = this.set("dimensionFilters", js.Array(value :_*))
    @scala.inline
    def setDimensionFilters(value: js.Array[SchemaDimensionValue]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    @scala.inline
    def setDimensionsVarargs(value: SchemaSortedDimension*): Self = this.set("dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[SchemaSortedDimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
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
    def setReportProperties(value: IncludeAttributedIPConversions): Self = this.set("reportProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportProperties: Self = this.set("reportProperties", js.undefined)
  }
  
}

