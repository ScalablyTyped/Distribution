package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearOrgPolicyRequest extends js.Object {
  /** Name of the `Constraint` of the `Policy` to clear. */
  var constraint: js.UndefOr[String] = js.undefined
  /**
    * The current version, for concurrency control. Not sending an `etag`
    * will cause the `Policy` to be cleared blindly.
    */
  var etag: js.UndefOr[String] = js.undefined
}

object ClearOrgPolicyRequest {
  @scala.inline
  def apply(constraint: String = null, etag: String = null): ClearOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearOrgPolicyRequest]
  }
}

