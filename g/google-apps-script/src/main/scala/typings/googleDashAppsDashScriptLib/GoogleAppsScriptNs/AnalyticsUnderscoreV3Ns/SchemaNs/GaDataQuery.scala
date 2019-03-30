package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaDataQuery extends js.Object {
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  var end_date: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[java.lang.String] = js.undefined
  var ids: js.UndefOr[java.lang.String] = js.undefined
  var max_results: js.UndefOr[scala.Double] = js.undefined
  var metrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var samplingLevel: js.UndefOr[java.lang.String] = js.undefined
  var segment: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var start_date: js.UndefOr[java.lang.String] = js.undefined
  var start_index: js.UndefOr[scala.Double] = js.undefined
}

object GaDataQuery {
  @scala.inline
  def apply(
    dimensions: java.lang.String = null,
    end_date: java.lang.String = null,
    filters: java.lang.String = null,
    ids: java.lang.String = null,
    max_results: scala.Int | scala.Double = null,
    metrics: js.Array[java.lang.String] = null,
    samplingLevel: java.lang.String = null,
    segment: java.lang.String = null,
    sort: js.Array[java.lang.String] = null,
    start_date: java.lang.String = null,
    start_index: scala.Int | scala.Double = null
  ): GaDataQuery = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (end_date != null) __obj.updateDynamic("end_date")(end_date)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (max_results != null) __obj.updateDynamic("max_results")(max_results.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start_date != null) __obj.updateDynamic("start_date")(start_date)
    if (start_index != null) __obj.updateDynamic("start_index")(start_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaDataQuery]
  }
}

