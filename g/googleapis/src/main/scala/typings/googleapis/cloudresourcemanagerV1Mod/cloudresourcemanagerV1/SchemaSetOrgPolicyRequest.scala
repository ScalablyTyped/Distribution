package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the SetOrgPolicyRequest method.
  */
@js.native
trait SchemaSetOrgPolicyRequest extends js.Object {
  /**
    * `Policy` to set on the resource.
    */
  var policy: js.UndefOr[SchemaOrgPolicy] = js.native
}

object SchemaSetOrgPolicyRequest {
  @scala.inline
  def apply(policy: SchemaOrgPolicy = null): SchemaSetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetOrgPolicyRequest]
  }
}

