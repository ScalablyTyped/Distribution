package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrgPolicyRequest extends js.Object {
  /** Name of the `Constraint` to get the `Policy`. */
  var constraint: js.UndefOr[java.lang.String] = js.undefined
}

object GetOrgPolicyRequest {
  @scala.inline
  def apply(constraint: java.lang.String = null): GetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    __obj.asInstanceOf[GetOrgPolicyRequest]
  }
}

