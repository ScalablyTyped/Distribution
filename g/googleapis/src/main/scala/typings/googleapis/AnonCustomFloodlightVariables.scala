package typings.googleapis

import typings.googleapis.v33Mod.dfareportingV33.SchemaDateRange
import typings.googleapis.v33Mod.dfareportingV33.SchemaDimensionValue
import typings.googleapis.v33Mod.dfareportingV33.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomFloodlightVariables extends js.Object {
  var activityFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var conversionDimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var customFloodlightVariables: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var customRichMediaEvents: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var perInteractionDimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var reportProperties: js.UndefOr[AnonClicksLookbackWindow] = js.native
}

object AnonCustomFloodlightVariables {
  @scala.inline
  def apply(
    activityFilters: js.Array[SchemaDimensionValue] = null,
    conversionDimensions: js.Array[SchemaSortedDimension] = null,
    customFloodlightVariables: js.Array[SchemaSortedDimension] = null,
    customRichMediaEvents: js.Array[SchemaDimensionValue] = null,
    dateRange: SchemaDateRange = null,
    floodlightConfigId: SchemaDimensionValue = null,
    metricNames: js.Array[String] = null,
    perInteractionDimensions: js.Array[SchemaSortedDimension] = null,
    reportProperties: AnonClicksLookbackWindow = null
  ): AnonCustomFloodlightVariables = {
    val __obj = js.Dynamic.literal()
    if (activityFilters != null) __obj.updateDynamic("activityFilters")(activityFilters.asInstanceOf[js.Any])
    if (conversionDimensions != null) __obj.updateDynamic("conversionDimensions")(conversionDimensions.asInstanceOf[js.Any])
    if (customFloodlightVariables != null) __obj.updateDynamic("customFloodlightVariables")(customFloodlightVariables.asInstanceOf[js.Any])
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (floodlightConfigId != null) __obj.updateDynamic("floodlightConfigId")(floodlightConfigId.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (perInteractionDimensions != null) __obj.updateDynamic("perInteractionDimensions")(perInteractionDimensions.asInstanceOf[js.Any])
    if (reportProperties != null) __obj.updateDynamic("reportProperties")(reportProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomFloodlightVariables]
  }
}

