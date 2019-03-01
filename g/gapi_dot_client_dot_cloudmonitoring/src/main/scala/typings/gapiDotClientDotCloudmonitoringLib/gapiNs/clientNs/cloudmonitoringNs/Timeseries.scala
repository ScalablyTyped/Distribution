package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeseries extends js.Object {
  /** The data points of this time series. The points are listed in order of their end timestamp, from younger to older. */
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  /** The descriptor of this time series. */
  var timeseriesDesc: js.UndefOr[TimeseriesDescriptor] = js.undefined
}

object Timeseries {
  @scala.inline
  def apply(points: js.Array[Point] = null, timeseriesDesc: TimeseriesDescriptor = null): Timeseries = {
    val __obj = js.Dynamic.literal()
    if (points != null) __obj.updateDynamic("points")(points)
    if (timeseriesDesc != null) __obj.updateDynamic("timeseriesDesc")(timeseriesDesc)
    __obj.asInstanceOf[Timeseries]
  }
}

