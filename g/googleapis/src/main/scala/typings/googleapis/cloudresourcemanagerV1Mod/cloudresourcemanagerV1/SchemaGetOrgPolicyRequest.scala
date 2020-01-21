package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the GetOrgPolicy method.
  */
@js.native
trait SchemaGetOrgPolicyRequest extends js.Object {
  /**
    * Name of the `Constraint` to get the `Policy`.
    */
  var constraint: js.UndefOr[String] = js.native
}

object SchemaGetOrgPolicyRequest {
  @scala.inline
  def apply(constraint: String = null): SchemaGetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetOrgPolicyRequest]
  }
}

