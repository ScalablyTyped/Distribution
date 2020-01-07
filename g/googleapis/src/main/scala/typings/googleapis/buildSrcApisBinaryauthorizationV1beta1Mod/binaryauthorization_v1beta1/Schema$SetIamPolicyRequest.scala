package typings.googleapis.buildSrcApisBinaryauthorizationV1beta1Mod.binaryauthorization_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `SetIamPolicy` method.
  */
@js.native
trait Schema$SetIamPolicyRequest extends js.Object {
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size
    * of the policy is limited to a few 10s of KB. An empty policy is a valid
    * policy but certain Cloud Platform services (such as Projects) might
    * reject them.
    */
  var policy: js.UndefOr[Schema$IamPolicy] = js.native
}

object Schema$SetIamPolicyRequest {
  @scala.inline
  def apply(policy: Schema$IamPolicy = null): Schema$SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetIamPolicyRequest]
  }
}

