package typings.googleCloudPubsub.iamMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SetIamPolicyRequest. */
trait ISetIamPolicyRequest extends js.Object {
  /** SetIamPolicyRequest policy */
  var policy: js.UndefOr[IPolicy | Null] = js.undefined
  /** SetIamPolicyRequest resource */
  var resource: js.UndefOr[String | Null] = js.undefined
}

object ISetIamPolicyRequest {
  @scala.inline
  def apply(
    policy: js.UndefOr[Null | IPolicy] = js.undefined,
    resource: js.UndefOr[Null | String] = js.undefined
  ): ISetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(policy)) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (!js.isUndefined(resource)) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetIamPolicyRequest]
  }
}

