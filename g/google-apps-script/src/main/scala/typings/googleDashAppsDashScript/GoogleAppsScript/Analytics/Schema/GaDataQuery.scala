package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaDataQuery extends js.Object {
  var dimensions: js.UndefOr[String] = js.undefined
  var end_date: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[String] = js.undefined
  var ids: js.UndefOr[String] = js.undefined
  var max_results: js.UndefOr[Double] = js.undefined
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  var samplingLevel: js.UndefOr[String] = js.undefined
  var segment: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[js.Array[String]] = js.undefined
  var start_date: js.UndefOr[String] = js.undefined
  var start_index: js.UndefOr[Double] = js.undefined
}

object GaDataQuery {
  @scala.inline
  def apply(
    dimensions: String = null,
    end_date: String = null,
    filters: String = null,
    ids: String = null,
    max_results: Int | Double = null,
    metrics: js.Array[String] = null,
    samplingLevel: String = null,
    segment: String = null,
    sort: js.Array[String] = null,
    start_date: String = null,
    start_index: Int | Double = null
  ): GaDataQuery = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (end_date != null) __obj.updateDynamic("end_date")(end_date.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (max_results != null) __obj.updateDynamic("max_results")(max_results.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (start_date != null) __obj.updateDynamic("start_date")(start_date.asInstanceOf[js.Any])
    if (start_index != null) __obj.updateDynamic("start_index")(start_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaDataQuery]
  }
}

