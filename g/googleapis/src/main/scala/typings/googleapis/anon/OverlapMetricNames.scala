package typings.googleapis.anon

import typings.googleapis.v33Mod.dfareportingV33.SchemaDateRange
import typings.googleapis.v33Mod.dfareportingV33.SchemaDimensionValue
import typings.googleapis.v33Mod.dfareportingV33.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlapMetricNames extends js.Object {
  var breakdown: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var dimension: js.UndefOr[String] = js.native
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.native
  var pivoted: js.UndefOr[Boolean] = js.native
}

object OverlapMetricNames {
  @scala.inline
  def apply(
    breakdown: js.Array[SchemaSortedDimension] = null,
    dateRange: SchemaDateRange = null,
    dimension: String = null,
    dimensionFilters: js.Array[SchemaDimensionValue] = null,
    metricNames: js.Array[String] = null,
    overlapMetricNames: js.Array[String] = null,
    pivoted: js.UndefOr[Boolean] = js.undefined
  ): OverlapMetricNames = {
    val __obj = js.Dynamic.literal()
    if (breakdown != null) __obj.updateDynamic("breakdown")(breakdown.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (overlapMetricNames != null) __obj.updateDynamic("overlapMetricNames")(overlapMetricNames.asInstanceOf[js.Any])
    if (!js.isUndefined(pivoted)) __obj.updateDynamic("pivoted")(pivoted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlapMetricNames]
  }
}

