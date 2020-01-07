package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Role Permission Group List Response
  */
@js.native
trait Schema$UserRolePermissionGroupsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User role permission group collection.
    */
  var userRolePermissionGroups: js.UndefOr[js.Array[Schema$UserRolePermissionGroup]] = js.native
}

object Schema$UserRolePermissionGroupsListResponse {
  @scala.inline
  def apply(kind: String = null, userRolePermissionGroups: js.Array[Schema$UserRolePermissionGroup] = null): Schema$UserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (userRolePermissionGroups != null) __obj.updateDynamic("userRolePermissionGroups")(userRolePermissionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserRolePermissionGroupsListResponse]
  }
}

