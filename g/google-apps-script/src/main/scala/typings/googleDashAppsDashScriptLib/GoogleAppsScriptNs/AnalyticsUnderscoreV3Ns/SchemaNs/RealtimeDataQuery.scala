package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeDataQuery extends js.Object {
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[java.lang.String] = js.undefined
  var ids: js.UndefOr[java.lang.String] = js.undefined
  var max_results: js.UndefOr[scala.Double] = js.undefined
  var metrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RealtimeDataQuery {
  @scala.inline
  def apply(
    dimensions: java.lang.String = null,
    filters: java.lang.String = null,
    ids: java.lang.String = null,
    max_results: scala.Int | scala.Double = null,
    metrics: js.Array[java.lang.String] = null,
    sort: js.Array[java.lang.String] = null
  ): RealtimeDataQuery = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (max_results != null) __obj.updateDynamic("max_results")(max_results.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[RealtimeDataQuery]
  }
}

