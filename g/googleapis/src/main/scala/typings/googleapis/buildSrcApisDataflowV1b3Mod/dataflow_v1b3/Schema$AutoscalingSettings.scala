package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for WorkerPool autoscaling.
  */
@js.native
trait Schema$AutoscalingSettings extends js.Object {
  /**
    * The algorithm to use for autoscaling.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * The maximum number of workers to cap scaling at.
    */
  var maxNumWorkers: js.UndefOr[Double] = js.native
}

object Schema$AutoscalingSettings {
  @scala.inline
  def apply(algorithm: String = null, maxNumWorkers: Int | Double = null): Schema$AutoscalingSettings = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (maxNumWorkers != null) __obj.updateDynamic("maxNumWorkers")(maxNumWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoscalingSettings]
  }
}

