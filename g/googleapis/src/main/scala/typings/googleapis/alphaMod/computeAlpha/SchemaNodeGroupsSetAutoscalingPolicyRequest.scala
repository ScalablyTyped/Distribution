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
  def apply(): SchemaNodeGroupsSetAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsSetAutoscalingPolicyRequest]
  }
  @scala.inline
  implicit class SchemaNodeGroupsSetAutoscalingPolicyRequestOps[Self <: SchemaNodeGroupsSetAutoscalingPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoscalingPolicy(value: SchemaNodeGroupAutoscalingPolicy): Self = this.set("autoscalingPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoscalingPolicy: Self = this.set("autoscalingPolicy", js.undefined)
  }
  
}

