package typings.gapiDotClientDotAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnHeader extends js.Object {
  /** The dimension names in the response. */
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  /** Metric headers for the metrics in the response. */
  var metricHeader: js.UndefOr[MetricHeader] = js.undefined
}

object ColumnHeader {
  @scala.inline
  def apply(dimensions: js.Array[String] = null, metricHeader: MetricHeader = null): ColumnHeader = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (metricHeader != null) __obj.updateDynamic("metricHeader")(metricHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnHeader]
  }
}

