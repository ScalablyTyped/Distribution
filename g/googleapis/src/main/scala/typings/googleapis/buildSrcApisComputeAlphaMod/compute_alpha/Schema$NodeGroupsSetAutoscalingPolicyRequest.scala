package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NodeGroupsSetAutoscalingPolicyRequest extends js.Object {
  var autoscalingPolicy: js.UndefOr[Schema$NodeGroupAutoscalingPolicy] = js.native
}

object Schema$NodeGroupsSetAutoscalingPolicyRequest {
  @scala.inline
  def apply(autoscalingPolicy: Schema$NodeGroupAutoscalingPolicy = null): Schema$NodeGroupsSetAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeGroupsSetAutoscalingPolicyRequest]
  }
}

