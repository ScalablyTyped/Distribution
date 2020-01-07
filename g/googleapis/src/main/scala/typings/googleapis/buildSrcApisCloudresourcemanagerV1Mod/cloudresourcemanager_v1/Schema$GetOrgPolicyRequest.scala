package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the GetOrgPolicy method.
  */
@js.native
trait Schema$GetOrgPolicyRequest extends js.Object {
  /**
    * Name of the `Constraint` to get the `Policy`.
    */
  var constraint: js.UndefOr[String] = js.native
}

object Schema$GetOrgPolicyRequest {
  @scala.inline
  def apply(constraint: String = null): Schema$GetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetOrgPolicyRequest]
  }
}

