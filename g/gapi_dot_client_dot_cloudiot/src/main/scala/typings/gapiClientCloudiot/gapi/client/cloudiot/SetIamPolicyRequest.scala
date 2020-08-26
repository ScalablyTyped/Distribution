package typings.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIamPolicyRequest extends js.Object {
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size of
    * the policy is limited to a few 10s of KB. An empty policy is a
    * valid policy but certain Cloud Platform services (such as Projects)
    * might reject them.
    */
  var policy: js.UndefOr[Policy] = js.native
  /**
    * OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only
    * the fields in the mask will be modified. If no mask is provided, the
    * following default mask is used:
    * paths: "bindings, etag"
    * This field is only used by Cloud IAM.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SetIamPolicyRequest {
  @scala.inline
  def apply(): SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetIamPolicyRequest]
  }
  @scala.inline
  implicit class SetIamPolicyRequestOps[Self <: SetIamPolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicy(value: Policy): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

