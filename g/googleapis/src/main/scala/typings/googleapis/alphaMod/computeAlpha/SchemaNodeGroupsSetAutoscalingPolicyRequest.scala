package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupsSetAutoscalingPolicyRequest extends js.Object {
  var autoscalingPolicy: js.UndefOr[SchemaNodeGroupAutoscalingPolicy] = js.native
}

object SchemaNodeGroupsSetAutoscalingPolicyRequest {
  @scala.inline
  def apply(autoscalingPolicy: SchemaNodeGroupAutoscalingPolicy = null): SchemaNodeGroupsSetAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeGroupsSetAutoscalingPolicyRequest]
  }
}

