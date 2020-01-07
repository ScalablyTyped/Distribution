package typings.googleapis

import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$DateRange
import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$DimensionValue
import typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Schema$SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CustomRichMediaEvents extends js.Object {
  var customRichMediaEvents: js.UndefOr[js.Array[Schema$DimensionValue]] = js.native
  var dateRange: js.UndefOr[Schema$DateRange] = js.native
  var dimensionFilters: js.UndefOr[js.Array[Schema$DimensionValue]] = js.native
  var dimensions: js.UndefOr[js.Array[Schema$SortedDimension]] = js.native
  var floodlightConfigId: js.UndefOr[Schema$DimensionValue] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var reportProperties: js.UndefOr[Anon_IncludeAttributedIPConversions] = js.native
}

object Anon_CustomRichMediaEvents {
  @scala.inline
  def apply(
    customRichMediaEvents: js.Array[Schema$DimensionValue] = null,
    dateRange: Schema$DateRange = null,
    dimensionFilters: js.Array[Schema$DimensionValue] = null,
    dimensions: js.Array[Schema$SortedDimension] = null,
    floodlightConfigId: Schema$DimensionValue = null,
    metricNames: js.Array[String] = null,
    reportProperties: Anon_IncludeAttributedIPConversions = null
  ): Anon_CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (floodlightConfigId != null) __obj.updateDynamic("floodlightConfigId")(floodlightConfigId.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (reportProperties != null) __obj.updateDynamic("reportProperties")(reportProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomRichMediaEvents]
  }
}

