package typings.gapiDotClientDotDfareporting

import typings.gapiDotClientDotDfareporting.gapi.client.dfareporting.DateRange
import typings.gapiDotClientDotDfareporting.gapi.client.dfareporting.DimensionValue
import typings.gapiDotClientDotDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Breakdown extends js.Object {
  /** The list of dimensions the report should include. */
  var breakdown: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  /** The dimension option. */
  var dimension: js.UndefOr[String] = js.undefined
  /** The list of filters on which dimensions are filtered. */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of names of overlap metrics the report should include. */
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether the report is pivoted or not. Defaults to true. */
  var pivoted: js.UndefOr[Boolean] = js.undefined
}

object Anon_Breakdown {
  @scala.inline
  def apply(
    breakdown: js.Array[SortedDimension] = null,
    dateRange: DateRange = null,
    dimension: String = null,
    dimensionFilters: js.Array[DimensionValue] = null,
    metricNames: js.Array[String] = null,
    overlapMetricNames: js.Array[String] = null,
    pivoted: js.UndefOr[Boolean] = js.undefined
  ): Anon_Breakdown = {
    val __obj = js.Dynamic.literal()
    if (breakdown != null) __obj.updateDynamic("breakdown")(breakdown.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (overlapMetricNames != null) __obj.updateDynamic("overlapMetricNames")(overlapMetricNames.asInstanceOf[js.Any])
    if (!js.isUndefined(pivoted)) __obj.updateDynamic("pivoted")(pivoted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Breakdown]
  }
}

