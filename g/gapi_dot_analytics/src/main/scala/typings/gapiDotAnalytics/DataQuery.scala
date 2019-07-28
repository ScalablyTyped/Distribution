package typings.gapiDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataQuery extends js.Object {
  var `30daysAgo`: js.UndefOr[String] = js.undefined
  var dimensions: js.UndefOr[String] = js.undefined
  var `end-date`: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[String] = js.undefined
  var ids: js.UndefOr[String] = js.undefined
  var `include-empty-rows`: js.UndefOr[String] = js.undefined
  var `max-results`: js.UndefOr[String] = js.undefined
  var metrics: js.UndefOr[String] = js.undefined
  var samplingLevel: js.UndefOr[String] = js.undefined
  var segment: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var `start-date`: js.UndefOr[String] = js.undefined
  var `start-index`: js.UndefOr[String] = js.undefined
  var yesterday: js.UndefOr[String] = js.undefined
}

object DataQuery {
  @scala.inline
  def apply(
    `30daysAgo`: String = null,
    dimensions: String = null,
    `end-date`: String = null,
    filters: String = null,
    ids: String = null,
    `include-empty-rows`: String = null,
    `max-results`: String = null,
    metrics: String = null,
    samplingLevel: String = null,
    segment: String = null,
    sort: String = null,
    `start-date`: String = null,
    `start-index`: String = null,
    yesterday: String = null
  ): DataQuery = {
    val __obj = js.Dynamic.literal()
    if (`30daysAgo` != null) __obj.updateDynamic("30daysAgo")(`30daysAgo`)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (`include-empty-rows` != null) __obj.updateDynamic("include-empty-rows")(`include-empty-rows`)
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`)
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`)
    if (yesterday != null) __obj.updateDynamic("yesterday")(yesterday)
    __obj.asInstanceOf[DataQuery]
  }
}

