package typings.googleapis

import typings.googleapis.v33Mod.dfareportingV33.SchemaDateRange
import typings.googleapis.v33Mod.dfareportingV33.SchemaDimensionValue
import typings.googleapis.v33Mod.dfareportingV33.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomRichMediaEventsDateRangeDimensionFilters extends js.Object {
  var customRichMediaEvents: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var reportProperties: js.UndefOr[AnonIncludeAttributedIPConversions] = js.native
}

object AnonCustomRichMediaEventsDateRangeDimensionFilters {
  @scala.inline
  def apply(
    customRichMediaEvents: js.Array[SchemaDimensionValue] = null,
    dateRange: SchemaDateRange = null,
    dimensionFilters: js.Array[SchemaDimensionValue] = null,
    dimensions: js.Array[SchemaSortedDimension] = null,
    floodlightConfigId: SchemaDimensionValue = null,
    metricNames: js.Array[String] = null,
    reportProperties: AnonIncludeAttributedIPConversions = null
  ): AnonCustomRichMediaEventsDateRangeDimensionFilters = {
    val __obj = js.Dynamic.literal()
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (floodlightConfigId != null) __obj.updateDynamic("floodlightConfigId")(floodlightConfigId.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (reportProperties != null) __obj.updateDynamic("reportProperties")(reportProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomRichMediaEventsDateRangeDimensionFilters]
  }
}

