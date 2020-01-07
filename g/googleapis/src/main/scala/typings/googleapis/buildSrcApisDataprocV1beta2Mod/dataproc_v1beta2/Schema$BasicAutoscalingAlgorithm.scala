package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic algorithm for autoscaling.
  */
@js.native
trait Schema$BasicAutoscalingAlgorithm extends js.Object {
  /**
    * Optional. Duration between scaling events. A scaling period starts after
    * the update operation from the previous event has completed.Bounds: 2m,
    * 1d. Default: 2m.
    */
  var cooldownPeriod: js.UndefOr[String] = js.native
  /**
    * Required. YARN autoscaling configuration.
    */
  var yarnConfig: js.UndefOr[Schema$BasicYarnAutoscalingConfig] = js.native
}

object Schema$BasicAutoscalingAlgorithm {
  @scala.inline
  def apply(cooldownPeriod: String = null, yarnConfig: Schema$BasicYarnAutoscalingConfig = null): Schema$BasicAutoscalingAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (cooldownPeriod != null) __obj.updateDynamic("cooldownPeriod")(cooldownPeriod.asInstanceOf[js.Any])
    if (yarnConfig != null) __obj.updateDynamic("yarnConfig")(yarnConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BasicAutoscalingAlgorithm]
  }
}

