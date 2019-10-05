package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalingSettings extends js.Object {
  /** The algorithm to use for autoscaling. */
  var algorithm: js.UndefOr[String] = js.undefined
  /** The maximum number of workers to cap scaling at. */
  var maxNumWorkers: js.UndefOr[Double] = js.undefined
}

object AutoscalingSettings {
  @scala.inline
  def apply(algorithm: String = null, maxNumWorkers: Int | Double = null): AutoscalingSettings = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (maxNumWorkers != null) __obj.updateDynamic("maxNumWorkers")(maxNumWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingSettings]
  }
}

