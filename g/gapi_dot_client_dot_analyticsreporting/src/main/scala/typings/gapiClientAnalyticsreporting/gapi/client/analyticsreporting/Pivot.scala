package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pivot extends js.Object {
  /**
    * DimensionFilterClauses are logically combined with an `AND` operator: only
    * data that is included by all these DimensionFilterClauses contributes to
    * the values in this pivot region. Dimension filters can be used to restrict
    * the columns shown in the pivot region. For example if you have
    * `ga:browser` as the requested dimension in the pivot region, and you
    * specify key filters to restrict `ga:browser` to only "IE" or "Firefox",
    * then only those two browsers would show up as columns.
    */
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.undefined
  /**
    * A list of dimensions to show as pivot columns. A Pivot can have a maximum
    * of 4 dimensions. Pivot dimensions are part of the restriction on the
    * total number of dimensions allowed in the request.
    */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  /**
    * Specifies the maximum number of groups to return.
    * The default value is 10, also the maximum value is 1,000.
    */
  var maxGroupCount: js.UndefOr[Double] = js.undefined
  /**
    * The pivot metrics. Pivot metrics are part of the
    * restriction on total number of metrics allowed in the request.
    */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  /**
    * If k metrics were requested, then the response will contain some
    * data-dependent multiple of k columns in the report.  E.g., if you pivoted
    * on the dimension `ga:browser` then you'd get k columns for "Firefox", k
    * columns for "IE", k columns for "Chrome", etc. The ordering of the groups
    * of columns is determined by descending order of "total" for the first of
    * the k values.  Ties are broken by lexicographic ordering of the first
    * pivot dimension, then lexicographic ordering of the second pivot
    * dimension, and so on.  E.g., if the totals for the first value for
    * Firefox, IE, and Chrome were 8, 2, 8, respectively, the order of columns
    * would be Chrome, Firefox, IE.
    *
    * The following let you choose which of the groups of k columns are
    * included in the response.
    */
  var startGroup: js.UndefOr[Double] = js.undefined
}

object Pivot {
  @scala.inline
  def apply(
    dimensionFilterClauses: js.Array[DimensionFilterClause] = null,
    dimensions: js.Array[Dimension] = null,
    maxGroupCount: js.UndefOr[Double] = js.undefined,
    metrics: js.Array[Metric] = null,
    startGroup: js.UndefOr[Double] = js.undefined
  ): Pivot = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilterClauses != null) __obj.updateDynamic("dimensionFilterClauses")(dimensionFilterClauses.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (!js.isUndefined(maxGroupCount)) __obj.updateDynamic("maxGroupCount")(maxGroupCount.get.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (!js.isUndefined(startGroup)) __obj.updateDynamic("startGroup")(startGroup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pivot]
  }
}

