package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `SetIamPolicy` method.
  */
@js.native
trait SchemaSetIamPolicyRequest extends js.Object {
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size
    * of the policy is limited to a few 10s of KB. An empty policy is a valid
    * policy but certain Cloud Platform services (such as Projects) might
    * reject them.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
  /**
    * OPTIONAL: A FieldMask specifying which fields of the policy to modify.
    * Only the fields in the mask will be modified. If no mask is provided, the
    * following default mask is used: paths: &quot;bindings, etag&quot; This
    * field is only used by Cloud IAM.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaSetIamPolicyRequest {
  @scala.inline
  def apply(policy: SchemaPolicy = null, updateMask: String = null): SchemaSetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetIamPolicyRequest]
  }
}

