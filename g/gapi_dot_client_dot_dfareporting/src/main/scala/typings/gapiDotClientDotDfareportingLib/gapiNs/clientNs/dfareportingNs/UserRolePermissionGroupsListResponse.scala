package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionGroupsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermissionGroupsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** User role permission group collection. */
  var userRolePermissionGroups: js.UndefOr[js.Array[UserRolePermissionGroup]] = js.undefined
}

object UserRolePermissionGroupsListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, userRolePermissionGroups: js.Array[UserRolePermissionGroup] = null): UserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (userRolePermissionGroups != null) __obj.updateDynamic("userRolePermissionGroups")(userRolePermissionGroups)
    __obj.asInstanceOf[UserRolePermissionGroupsListResponse]
  }
}

