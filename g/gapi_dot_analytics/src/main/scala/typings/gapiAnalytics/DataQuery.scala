package typings.gapiAnalytics

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
    if (`30daysAgo` != null) __obj.updateDynamic("30daysAgo")(`30daysAgo`.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (`include-empty-rows` != null) __obj.updateDynamic("include-empty-rows")(`include-empty-rows`.asInstanceOf[js.Any])
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    if (yesterday != null) __obj.updateDynamic("yesterday")(yesterday.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataQuery]
  }
}

