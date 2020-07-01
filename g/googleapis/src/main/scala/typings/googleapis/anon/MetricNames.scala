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
  def apply(
    activities: SchemaActivities = null,
    customRichMediaEvents: SchemaCustomRichMediaEvents = null,
    dateRange: SchemaDateRange = null,
    dimensionFilters: js.Array[SchemaDimensionValue] = null,
    dimensions: js.Array[SchemaSortedDimension] = null,
    metricNames: js.Array[String] = null
  ): MetricNames = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricNames]
  }
}

