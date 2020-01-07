package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the ClearOrgPolicy method.
  */
@js.native
trait Schema$ClearOrgPolicyRequest extends js.Object {
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

object Schema$ClearOrgPolicyRequest {
  @scala.inline
  def apply(constraint: String = null, etag: String = null): Schema$ClearOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClearOrgPolicyRequest]
  }
}

