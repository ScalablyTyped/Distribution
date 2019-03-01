package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Breakdown extends js.Object {
  /** The list of dimensions the report should include. */
  var breakdown: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension]
  ] = js.undefined
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DateRange] = js.undefined
  /** The dimension option. */
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  /** The list of filters on which dimensions are filtered. */
  var dimensionFilters: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue]
  ] = js.undefined
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of names of overlap metrics the report should include. */
  var overlapMetricNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether the report is pivoted or not. Defaults to true. */
  var pivoted: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Breakdown {
  @scala.inline
  def apply(
    breakdown: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.SortedDimension] = null,
    dateRange: gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DateRange = null,
    dimension: java.lang.String = null,
    dimensionFilters: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.DimensionValue] = null,
    metricNames: js.Array[java.lang.String] = null,
    overlapMetricNames: js.Array[java.lang.String] = null,
    pivoted: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Breakdown = {
    val __obj = js.Dynamic.literal()
    if (breakdown != null) __obj.updateDynamic("breakdown")(breakdown)
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    if (overlapMetricNames != null) __obj.updateDynamic("overlapMetricNames")(overlapMetricNames)
    if (!js.isUndefined(pivoted)) __obj.updateDynamic("pivoted")(pivoted)
    __obj.asInstanceOf[Anon_Breakdown]
  }
}

