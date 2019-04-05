package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRole extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var defaultUserRole: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parentUserRoleId: js.UndefOr[java.lang.String] = js.undefined
  var permissions: js.UndefOr[js.Array[UserRolePermission]] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
}

object UserRole {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    defaultUserRole: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    parentUserRoleId: java.lang.String = null,
    permissions: js.Array[UserRolePermission] = null,
    subaccountId: java.lang.String = null
  ): UserRole = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(defaultUserRole)) __obj.updateDynamic("defaultUserRole")(defaultUserRole)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentUserRoleId != null) __obj.updateDynamic("parentUserRoleId")(parentUserRoleId)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    __obj.asInstanceOf[UserRole]
  }
}

