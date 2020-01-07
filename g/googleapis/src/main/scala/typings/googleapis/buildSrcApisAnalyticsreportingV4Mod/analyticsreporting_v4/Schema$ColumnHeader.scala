package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Column headers.
  */
@js.native
trait Schema$ColumnHeader extends js.Object {
  /**
    * The dimension names in the response.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Metric headers for the metrics in the response.
    */
  var metricHeader: js.UndefOr[Schema$MetricHeader] = js.native
}

object Schema$ColumnHeader {
  @scala.inline
  def apply(dimensions: js.Array[String] = null, metricHeader: Schema$MetricHeader = null): Schema$ColumnHeader = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (metricHeader != null) __obj.updateDynamic("metricHeader")(metricHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ColumnHeader]
  }
}

