package typings.googleapis

import typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3.Schema$DateRange
import typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3.Schema$DimensionValue
import typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3.Schema$SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BreakdownDateRangeDimension extends js.Object {
  var breakdown: js.UndefOr[js.Array[Schema$SortedDimension]] = js.native
  var dateRange: js.UndefOr[Schema$DateRange] = js.native
  var dimension: js.UndefOr[String] = js.native
  var dimensionFilters: js.UndefOr[js.Array[Schema$DimensionValue]] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.native
  var pivoted: js.UndefOr[Boolean] = js.native
}

object Anon_BreakdownDateRangeDimension {
  @scala.inline
  def apply(
    breakdown: js.Array[Schema$SortedDimension] = null,
    dateRange: Schema$DateRange = null,
    dimension: String = null,
    dimensionFilters: js.Array[Schema$DimensionValue] = null,
    metricNames: js.Array[String] = null,
    overlapMetricNames: js.Array[String] = null,
    pivoted: js.UndefOr[Boolean] = js.undefined
  ): Anon_BreakdownDateRangeDimension = {
    val __obj = js.Dynamic.literal()
    if (breakdown != null) __obj.updateDynamic("breakdown")(breakdown.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (overlapMetricNames != null) __obj.updateDynamic("overlapMetricNames")(overlapMetricNames.asInstanceOf[js.Any])
    if (!js.isUndefined(pivoted)) __obj.updateDynamic("pivoted")(pivoted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BreakdownDateRangeDimension]
  }
}

