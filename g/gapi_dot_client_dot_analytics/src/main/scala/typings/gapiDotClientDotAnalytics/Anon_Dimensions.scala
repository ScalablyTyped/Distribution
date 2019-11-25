package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  /** List of analytics dimensions. */
  var dimensions: js.UndefOr[String] = js.undefined
  /** End date. */
  var `end-date`: js.UndefOr[String] = js.undefined
  /** Comma-separated list of dimension or metric filters. */
  var filters: js.UndefOr[String] = js.undefined
  /** Unique table ID. */
  var ids: js.UndefOr[String] = js.undefined
  /** Maximum results per page. */
  var `max-results`: js.UndefOr[Double] = js.undefined
  /** List of analytics metrics. */
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  /** Desired sampling level */
  var samplingLevel: js.UndefOr[String] = js.undefined
  /** Analytics advanced segment. */
  var segment: js.UndefOr[String] = js.undefined
  /** List of dimensions or metrics based on which Analytics data is sorted. */
  var sort: js.UndefOr[js.Array[String]] = js.undefined
  /** Start date. */
  var `start-date`: js.UndefOr[String] = js.undefined
  /** Start index. */
  var `start-index`: js.UndefOr[Double] = js.undefined
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    dimensions: String = null,
    `end-date`: String = null,
    filters: String = null,
    ids: String = null,
    `max-results`: Int | Double = null,
    metrics: js.Array[String] = null,
    samplingLevel: String = null,
    segment: String = null,
    sort: js.Array[String] = null,
    `start-date`: String = null,
    `start-index`: Int | Double = null
  ): Anon_Dimensions = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

