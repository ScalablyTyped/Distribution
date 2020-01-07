package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Role Permission List Response
  */
@js.native
trait Schema$UserRolePermissionsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User role permission collection.
    */
  var userRolePermissions: js.UndefOr[js.Array[Schema$UserRolePermission]] = js.native
}

object Schema$UserRolePermissionsListResponse {
  @scala.inline
  def apply(kind: String = null, userRolePermissions: js.Array[Schema$UserRolePermission] = null): Schema$UserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (userRolePermissions != null) __obj.updateDynamic("userRolePermissions")(userRolePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserRolePermissionsListResponse]
  }
}

