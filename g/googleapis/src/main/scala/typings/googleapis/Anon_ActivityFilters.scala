package typings.googleapis

import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$DateRange
import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$DimensionValue
import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActivityFilters extends js.Object {
  var activityFilters: js.UndefOr[js.Array[Schema$DimensionValue]] = js.native
  var conversionDimensions: js.UndefOr[js.Array[Schema$SortedDimension]] = js.native
  var customFloodlightVariables: js.UndefOr[js.Array[Schema$SortedDimension]] = js.native
  var customRichMediaEvents: js.UndefOr[js.Array[Schema$DimensionValue]] = js.native
  var dateRange: js.UndefOr[Schema$DateRange] = js.native
  var floodlightConfigId: js.UndefOr[Schema$DimensionValue] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var perInteractionDimensions: js.UndefOr[js.Array[Schema$SortedDimension]] = js.native
  var reportProperties: js.UndefOr[Anon_ClicksLookbackWindow] = js.native
}

object Anon_ActivityFilters {
  @scala.inline
  def apply(
    activityFilters: js.Array[Schema$DimensionValue] = null,
    conversionDimensions: js.Array[Schema$SortedDimension] = null,
    customFloodlightVariables: js.Array[Schema$SortedDimension] = null,
    customRichMediaEvents: js.Array[Schema$DimensionValue] = null,
    dateRange: Schema$DateRange = null,
    floodlightConfigId: Schema$DimensionValue = null,
    metricNames: js.Array[String] = null,
    perInteractionDimensions: js.Array[Schema$SortedDimension] = null,
    reportProperties: Anon_ClicksLookbackWindow = null
  ): Anon_ActivityFilters = {
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
    __obj.asInstanceOf[Anon_ActivityFilters]
  }
}

