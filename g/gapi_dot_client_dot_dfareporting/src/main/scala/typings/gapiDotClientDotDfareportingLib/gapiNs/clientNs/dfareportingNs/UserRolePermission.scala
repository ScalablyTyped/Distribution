package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermission extends js.Object {
  /** Levels of availability for a user role permission. */
  var availability: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this user role permission. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermission". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this user role permission. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the permission group that this user role permission belongs to. */
  var permissionGroupId: js.UndefOr[java.lang.String] = js.undefined
}

object UserRolePermission {
  @scala.inline
  def apply(
    availability: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    permissionGroupId: java.lang.String = null
  ): UserRolePermission = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionGroupId != null) __obj.updateDynamic("permissionGroupId")(permissionGroupId)
    __obj.asInstanceOf[UserRolePermission]
  }
}

