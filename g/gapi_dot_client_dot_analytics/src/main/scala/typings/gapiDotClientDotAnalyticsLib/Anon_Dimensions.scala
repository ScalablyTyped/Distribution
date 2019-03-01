package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  /** List of analytics dimensions. */
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  /** End date. */
  var `end-date`: js.UndefOr[java.lang.String] = js.undefined
  /** Comma-separated list of dimension or metric filters. */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /** Unique table ID. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum results per page. */
  var `max-results`: js.UndefOr[scala.Double] = js.undefined
  /** List of analytics metrics. */
  var metrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Desired sampling level */
  var samplingLevel: js.UndefOr[java.lang.String] = js.undefined
  /** Analytics advanced segment. */
  var segment: js.UndefOr[java.lang.String] = js.undefined
  /** List of dimensions or metrics based on which Analytics data is sorted. */
  var sort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Start date. */
  var `start-date`: js.UndefOr[java.lang.String] = js.undefined
  /** Start index. */
  var `start-index`: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    dimensions: java.lang.String = null,
    `end-date`: java.lang.String = null,
    filters: java.lang.String = null,
    ids: java.lang.String = null,
    `max-results`: scala.Int | scala.Double = null,
    metrics: js.Array[java.lang.String] = null,
    samplingLevel: java.lang.String = null,
    segment: java.lang.String = null,
    sort: js.Array[java.lang.String] = null,
    `start-date`: java.lang.String = null,
    `start-index`: scala.Int | scala.Double = null
  ): Anon_Dimensions = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`)
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

