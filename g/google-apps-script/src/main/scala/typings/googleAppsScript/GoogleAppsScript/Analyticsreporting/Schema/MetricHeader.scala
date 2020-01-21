package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricHeader extends js.Object {
  var metricHeaderEntries: js.UndefOr[js.Array[MetricHeaderEntry]] = js.undefined
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

