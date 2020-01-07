package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the SetOrgPolicyRequest method.
  */
@js.native
trait Schema$SetOrgPolicyRequest extends js.Object {
  /**
    * `Policy` to set on the resource.
    */
  var policy: js.UndefOr[Schema$OrgPolicy] = js.native
}

object Schema$SetOrgPolicyRequest {
  @scala.inline
  def apply(policy: Schema$OrgPolicy = null): Schema$SetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetOrgPolicyRequest]
  }
}

