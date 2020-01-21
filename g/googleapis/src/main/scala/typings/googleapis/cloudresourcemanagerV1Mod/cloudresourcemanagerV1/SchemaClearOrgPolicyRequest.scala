package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the ClearOrgPolicy method.
  */
@js.native
trait SchemaClearOrgPolicyRequest extends js.Object {
  /**
    * Name of the `Constraint` of the `Policy` to clear.
    */
  var constraint: js.UndefOr[String] = js.native
  /**
    * The current version, for concurrency control. Not sending an `etag` will
    * cause the `Policy` to be cleared blindly.
    */
  var etag: js.UndefOr[String] = js.native
}

object SchemaClearOrgPolicyRequest {
  @scala.inline
  def apply(constraint: String = null, etag: String = null): SchemaClearOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClearOrgPolicyRequest]
  }
}

