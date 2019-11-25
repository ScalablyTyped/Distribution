package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeseriesPoint extends js.Object {
  /** The data point in this time series snapshot. */
  var point: js.UndefOr[Point] = js.undefined
  /** The descriptor of this time series. */
  var timeseriesDesc: js.UndefOr[TimeseriesDescriptor] = js.undefined
}

object TimeseriesPoint {
  @scala.inline
  def apply(point: Point = null, timeseriesDesc: TimeseriesDescriptor = null): TimeseriesPoint = {
    val __obj = js.Dynamic.literal()
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (timeseriesDesc != null) __obj.updateDynamic("timeseriesDesc")(timeseriesDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeseriesPoint]
  }
}

