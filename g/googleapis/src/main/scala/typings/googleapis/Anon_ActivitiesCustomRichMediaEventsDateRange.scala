package typings.googleapis

import typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2.Schema$Activities
import typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2.Schema$CustomRichMediaEvents
import typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2.Schema$DateRange
import typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2.Schema$DimensionValue
import typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2.Schema$SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActivitiesCustomRichMediaEventsDateRange extends js.Object {
  var activities: js.UndefOr[Schema$Activities] = js.native
  var customRichMediaEvents: js.UndefOr[Schema$CustomRichMediaEvents] = js.native
  var dateRange: js.UndefOr[Schema$DateRange] = js.native
  var dimensionFilters: js.UndefOr[js.Array[Schema$DimensionValue]] = js.native
  var dimensions: js.UndefOr[js.Array[Schema$SortedDimension]] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
}

object Anon_ActivitiesCustomRichMediaEventsDateRange {
  @scala.inline
  def apply(
    activities: Schema$Activities = null,
    customRichMediaEvents: Schema$CustomRichMediaEvents = null,
    dateRange: Schema$DateRange = null,
    dimensionFilters: js.Array[Schema$DimensionValue] = null,
    dimensions: js.Array[Schema$SortedDimension] = null,
    metricNames: js.Array[String] = null
  ): Anon_ActivitiesCustomRichMediaEventsDateRange = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActivitiesCustomRichMediaEventsDateRange]
  }
}

