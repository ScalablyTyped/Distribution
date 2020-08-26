package typings.googleapis.anon

import typings.googleapis.v33Mod.dfareportingV33.SchemaActivities
import typings.googleapis.v33Mod.dfareportingV33.SchemaCustomRichMediaEvents
import typings.googleapis.v33Mod.dfareportingV33.SchemaDateRange
import typings.googleapis.v33Mod.dfareportingV33.SchemaDimensionValue
import typings.googleapis.v33Mod.dfareportingV33.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricNames extends js.Object {
  var activities: js.UndefOr[SchemaActivities] = js.native
  var customRichMediaEvents: js.UndefOr[SchemaCustomRichMediaEvents] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
}

object MetricNames {
  @scala.inline
  def apply(): MetricNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricNames]
  }
  @scala.inline
  implicit class MetricNamesOps[Self <: MetricNames] (val x: Self) extends AnyVal {
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
    def setActivities(value: SchemaActivities): Self = this.set("activities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    @scala.inline
    def setCustomRichMediaEvents(value: SchemaCustomRichMediaEvents): Self = this.set("customRichMediaEvents", value.asInstanceOf[js.Any])
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
    def setMetricNamesVarargs(value: String*): Self = this.set("metricNames", js.Array(value :_*))
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = this.set("metricNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricNames: Self = this.set("metricNames", js.undefined)
  }
  
}

