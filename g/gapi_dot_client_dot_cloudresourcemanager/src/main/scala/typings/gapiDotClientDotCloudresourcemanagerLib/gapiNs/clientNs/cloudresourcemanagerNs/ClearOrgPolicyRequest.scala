package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearOrgPolicyRequest extends js.Object {
  /** Name of the `Constraint` of the `Policy` to clear. */
  var constraint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current version, for concurrency control. Not sending an `etag`
    * will cause the `Policy` to be cleared blindly.
    */
  var etag: js.UndefOr[java.lang.String] = js.undefined
}

object ClearOrgPolicyRequest {
  @scala.inline
  def apply(constraint: java.lang.String = null, etag: java.lang.String = null): ClearOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    __obj.asInstanceOf[ClearOrgPolicyRequest]
  }
}

