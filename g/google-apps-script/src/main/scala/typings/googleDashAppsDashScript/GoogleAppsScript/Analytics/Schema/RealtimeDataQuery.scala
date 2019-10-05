package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeDataQuery extends js.Object {
  var dimensions: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[String] = js.undefined
  var ids: js.UndefOr[String] = js.undefined
  var max_results: js.UndefOr[Double] = js.undefined
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  var sort: js.UndefOr[js.Array[String]] = js.undefined
}

object RealtimeDataQuery {
  @scala.inline
  def apply(
    dimensions: String = null,
    filters: String = null,
    ids: String = null,
    max_results: Int | Double = null,
    metrics: js.Array[String] = null,
    sort: js.Array[String] = null
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

