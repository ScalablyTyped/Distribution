package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The headers for the metrics.
  */
@js.native
trait Schema$MetricHeader extends js.Object {
  /**
    * Headers for the metrics in the response.
    */
  var metricHeaderEntries: js.UndefOr[js.Array[Schema$MetricHeaderEntry]] = js.native
  /**
    * Headers for the pivots in the response.
    */
  var pivotHeaders: js.UndefOr[js.Array[Schema$PivotHeader]] = js.native
}

object Schema$MetricHeader {
  @scala.inline
  def apply(
    metricHeaderEntries: js.Array[Schema$MetricHeaderEntry] = null,
    pivotHeaders: js.Array[Schema$PivotHeader] = null
  ): Schema$MetricHeader = {
    val __obj = js.Dynamic.literal()
    if (metricHeaderEntries != null) __obj.updateDynamic("metricHeaderEntries")(metricHeaderEntries.asInstanceOf[js.Any])
    if (pivotHeaders != null) __obj.updateDynamic("pivotHeaders")(pivotHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetricHeader]
  }
}

