package typings.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDimensionsFilters extends js.Object {
  /** List of real time dimensions. */
  var dimensions: js.UndefOr[String] = js.undefined
  /** Comma-separated list of dimension or metric filters. */
  var filters: js.UndefOr[String] = js.undefined
  /** Unique table ID. */
  var ids: js.UndefOr[String] = js.undefined
  /** Maximum results per page. */
  var `max-results`: js.UndefOr[Double] = js.undefined
  /** List of real time metrics. */
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  /** List of dimensions or metrics based on which real time data is sorted. */
  var sort: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonDimensionsFilters {
  @scala.inline
  def apply(
    dimensions: String = null,
    filters: String = null,
    ids: String = null,
    `max-results`: Int | Double = null,
    metrics: js.Array[String] = null,
    sort: js.Array[String] = null
  ): AnonDimensionsFilters = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDimensionsFilters]
  }
}

