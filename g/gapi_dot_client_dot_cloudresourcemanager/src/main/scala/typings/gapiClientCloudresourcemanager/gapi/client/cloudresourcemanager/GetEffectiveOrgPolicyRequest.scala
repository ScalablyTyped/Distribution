package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectiveOrgPolicyRequest extends js.Object {
  /** The name of the `Constraint` to compute the effective `Policy`. */
  var constraint: js.UndefOr[String] = js.undefined
}

object GetEffectiveOrgPolicyRequest {
  @scala.inline
  def apply(constraint: String = null): GetEffectiveOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEffectiveOrgPolicyRequest]
  }
}

