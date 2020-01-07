package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to create a new role.
  */
@js.native
trait Schema$CreateRoleRequest extends js.Object {
  /**
    * The Role resource to create.
    */
  var role: js.UndefOr[Schema$Role] = js.native
  /**
    * The role id to use for this role.
    */
  var roleId: js.UndefOr[String] = js.native
}

object Schema$CreateRoleRequest {
  @scala.inline
  def apply(role: Schema$Role = null, roleId: String = null): Schema$CreateRoleRequest = {
    val __obj = js.Dynamic.literal()
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (roleId != null) __obj.updateDynamic("roleId")(roleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateRoleRequest]
  }
}

