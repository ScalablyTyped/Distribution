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
  def apply(policy: IPolicy = null, resource: String = null): ISetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetIamPolicyRequest]
  }
}

