package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `SetIamPolicy` method.
  */
@js.native
trait Schema$GoogleIamV1__SetIamPolicyRequest extends js.Object {
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size
    * of the policy is limited to a few 10s of KB. An empty policy is a valid
    * policy but certain Cloud Platform services (such as Projects) might
    * reject them.
    */
  var policy: js.UndefOr[Schema$GoogleIamV1__Policy] = js.native
}

object Schema$GoogleIamV1__SetIamPolicyRequest {
  @scala.inline
  def apply(policy: Schema$GoogleIamV1__Policy = null): Schema$GoogleIamV1__SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleIamV1__SetIamPolicyRequest]
  }
}

