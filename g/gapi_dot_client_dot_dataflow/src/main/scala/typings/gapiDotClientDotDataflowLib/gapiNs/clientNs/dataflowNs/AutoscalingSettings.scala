package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingSettings extends js.Object {
  /** The algorithm to use for autoscaling. */
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of workers to cap scaling at. */
  var maxNumWorkers: js.UndefOr[scala.Double] = js.undefined
}

object AutoscalingSettings {
  @scala.inline
  def apply(algorithm: java.lang.String = null, maxNumWorkers: scala.Int | scala.Double = null): AutoscalingSettings = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (maxNumWorkers != null) __obj.updateDynamic("maxNumWorkers")(maxNumWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingSettings]
  }
}

