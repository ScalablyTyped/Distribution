package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectiveOrgPolicyRequest extends js.Object {
  /** The name of the `Constraint` to compute the effective `Policy`. */
  var constraint: js.UndefOr[java.lang.String] = js.undefined
}

object GetEffectiveOrgPolicyRequest {
  @scala.inline
  def apply(constraint: java.lang.String = null): GetEffectiveOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    __obj.asInstanceOf[GetEffectiveOrgPolicyRequest]
  }
}

