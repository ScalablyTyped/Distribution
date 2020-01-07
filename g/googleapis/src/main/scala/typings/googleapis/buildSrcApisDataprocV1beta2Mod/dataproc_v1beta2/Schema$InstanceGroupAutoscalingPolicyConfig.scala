package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the size bounds of an instance group, including its
  * proportional size to other groups.
  */
@js.native
trait Schema$InstanceGroupAutoscalingPolicyConfig extends js.Object {
  /**
    * Optional. Maximum number of instances for this group. Required for
    * primary workers. Note that by default, clusters will not use secondary
    * workers. Required for secondary workers if the minimum secondary
    * instances is set.Primary workers - Bounds: [min_instances, ). Required.
    * Secondary workers - Bounds: [min_instances, ). Default: 0.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * Optional. Minimum number of instances for this group.Primary workers -
    * Bounds: 2, max_instances. Default: 2. Secondary workers - Bounds: 0,
    * max_instances. Default: 0.
    */
  var minInstances: js.UndefOr[Double] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object Schema$InstanceGroupAutoscalingPolicyConfig {
  @scala.inline
  def apply(maxInstances: Int | Double = null, minInstances: Int | Double = null, weight: Int | Double = null): Schema$InstanceGroupAutoscalingPolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (minInstances != null) __obj.updateDynamic("minInstances")(minInstances.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupAutoscalingPolicyConfig]
  }
}

