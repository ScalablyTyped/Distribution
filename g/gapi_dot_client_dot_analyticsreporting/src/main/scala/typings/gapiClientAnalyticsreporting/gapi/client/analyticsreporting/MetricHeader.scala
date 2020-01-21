package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricHeader extends js.Object {
  /** Headers for the metrics in the response. */
  var metricHeaderEntries: js.UndefOr[js.Array[MetricHeaderEntry]] = js.undefined
  /** Headers for the pivots in the response. */
  var pivotHeaders: js.UndefOr[js.Array[PivotHeader]] = js.undefined
}

object MetricHeader {
  @scala.inline
  def apply(
    metricHeaderEntries: js.Array[MetricHeaderEntry] = null,
    pivotHeaders: js.Array[PivotHeader] = null
  ): MetricHeader = {
    val __obj = js.Dynamic.literal()
    if (metricHeaderEntries != null) __obj.updateDynamic("metricHeaderEntries")(metricHeaderEntries.asInstanceOf[js.Any])
    if (pivotHeaders != null) __obj.updateDynamic("pivotHeaders")(pivotHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricHeader]
  }
}

