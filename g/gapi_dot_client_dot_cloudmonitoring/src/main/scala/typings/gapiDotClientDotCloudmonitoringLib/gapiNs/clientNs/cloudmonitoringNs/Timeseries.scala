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

