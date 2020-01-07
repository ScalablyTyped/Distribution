package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of auser role, which is used to manage user access.
  */
@js.native
trait Schema$UserRole extends js.Object {
  /**
    * Account ID of this user role. This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this is a default user role. Default user roles are created by
    * the system for the account/subaccount and cannot be modified or deleted.
    * Each default user role comes with a basic set of preassigned permissions.
    */
  var defaultUserRole: js.UndefOr[Boolean] = js.native
  /**
    * ID of this user role. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRole&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this user role. This is a required field. Must be less than 256
    * characters long. If this user role is under a subaccount, the name must
    * be unique among sites of the same subaccount. Otherwise, this user role
    * is a top-level user role, and the name must be unique among top-level
    * user roles of the same account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * ID of the user role that this user role is based on or copied from. This
    * is a required field.
    */
  var parentUserRoleId: js.UndefOr[String] = js.native
  /**
    * List of permissions associated with this user role.
    */
  var permissions: js.UndefOr[js.Array[Schema$UserRolePermission]] = js.native
  /**
    * Subaccount ID of this user role. This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object Schema$UserRole {
  @scala.inline
  def apply(
    accountId: String = null,
    defaultUserRole: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    name: String = null,
    parentUserRoleId: String = null,
    permissions: js.Array[Schema$UserRolePermission] = null,
    subaccountId: String = null
  ): Schema$UserRole = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultUserRole)) __obj.updateDynamic("defaultUserRole")(defaultUserRole.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentUserRoleId != null) __obj.updateDynamic("parentUserRoleId")(parentUserRoleId.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserRole]
  }
}

