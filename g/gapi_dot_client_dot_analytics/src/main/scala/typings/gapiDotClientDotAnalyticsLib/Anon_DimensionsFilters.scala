package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DimensionsFilters extends js.Object {
  /** List of real time dimensions. */
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  /** Comma-separated list of dimension or metric filters. */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /** Unique table ID. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum results per page. */
  var `max-results`: js.UndefOr[scala.Double] = js.undefined
  /** List of real time metrics. */
  var metrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of dimensions or metrics based on which real time data is sorted. */
  var sort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_DimensionsFilters {
  @scala.inline
  def apply(
    dimensions: java.lang.String = null,
    filters: java.lang.String = null,
    ids: java.lang.String = null,
    `max-results`: scala.Int | scala.Double = null,
    metrics: js.Array[java.lang.String] = null,
    sort: js.Array[java.lang.String] = null
  ): Anon_DimensionsFilters = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[Anon_DimensionsFilters]
  }
}

