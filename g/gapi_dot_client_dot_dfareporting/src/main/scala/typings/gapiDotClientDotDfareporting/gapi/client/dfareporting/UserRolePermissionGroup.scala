package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionGroup extends js.Object {
  /** ID of this user role permission. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermissionGroup". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this user role permission group. */
  var name: js.UndefOr[String] = js.undefined
}

object UserRolePermissionGroup {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): UserRolePermissionGroup = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UserRolePermissionGroup]
  }
}

