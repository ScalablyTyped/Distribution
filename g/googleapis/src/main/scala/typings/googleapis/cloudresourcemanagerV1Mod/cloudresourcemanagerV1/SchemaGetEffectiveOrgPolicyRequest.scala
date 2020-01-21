package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request sent to the GetEffectiveOrgPolicy method.
  */
@js.native
trait SchemaGetEffectiveOrgPolicyRequest extends js.Object {
  /**
    * The name of the `Constraint` to compute the effective `Policy`.
    */
  var constraint: js.UndefOr[String] = js.native
}

object SchemaGetEffectiveOrgPolicyRequest {
  @scala.inline
  def apply(constraint: String = null): SchemaGetEffectiveOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetEffectiveOrgPolicyRequest]
  }
}

