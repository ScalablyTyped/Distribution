package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRole extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var defaultUserRole: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentUserRoleId: js.UndefOr[String] = js.undefined
  var permissions: js.UndefOr[js.Array[UserRolePermission]] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
}

object UserRole {
  @scala.inline
  def apply(
    accountId: String = null,
    defaultUserRole: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    name: String = null,
    parentUserRoleId: String = null,
    permissions: js.Array[UserRolePermission] = null,
    subaccountId: String = null
  ): UserRole = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultUserRole)) __obj.updateDynamic("defaultUserRole")(defaultUserRole.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentUserRoleId != null) __obj.updateDynamic("parentUserRoleId")(parentUserRoleId.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRole]
  }
}

