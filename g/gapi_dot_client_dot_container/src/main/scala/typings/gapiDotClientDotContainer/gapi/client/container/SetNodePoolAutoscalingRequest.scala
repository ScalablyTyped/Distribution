package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNodePoolAutoscalingRequest extends js.Object {
  /** Autoscaling configuration for the node pool. */
  var autoscaling: js.UndefOr[NodePoolAutoscaling] = js.undefined
}

object SetNodePoolAutoscalingRequest {
  @scala.inline
  def apply(autoscaling: NodePoolAutoscaling = null): SetNodePoolAutoscalingRequest = {
    val __obj = js.Dynamic.literal()
    if (autoscaling != null) __obj.updateDynamic("autoscaling")(autoscaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNodePoolAutoscalingRequest]
  }
}

