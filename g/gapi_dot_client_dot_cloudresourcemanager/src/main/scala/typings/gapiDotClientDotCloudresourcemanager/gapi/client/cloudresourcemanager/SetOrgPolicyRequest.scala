package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOrgPolicyRequest extends js.Object {
  /** `Policy` to set on the resource. */
  var policy: js.UndefOr[OrgPolicy] = js.undefined
}

object SetOrgPolicyRequest {
  @scala.inline
  def apply(policy: OrgPolicy = null): SetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy)
    __obj.asInstanceOf[SetOrgPolicyRequest]
  }
}

