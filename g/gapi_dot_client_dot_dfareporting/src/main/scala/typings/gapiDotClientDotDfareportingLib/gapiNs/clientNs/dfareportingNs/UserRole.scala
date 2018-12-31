package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRole extends js.Object {
  /** Account ID of this user role. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this is a default user role. Default user roles are created by the system for the account/subaccount and cannot be modified or deleted. Each
    * default user role comes with a basic set of preassigned permissions.
    */
  var defaultUserRole: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of this user role. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRole". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of this user role. This is a required field. Must be less than 256 characters long. If this user role is under a subaccount, the name must be
    * unique among sites of the same subaccount. Otherwise, this user role is a top-level user role, and the name must be unique among top-level user roles
    * of the same account.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the user role that this user role is based on or copied from. This is a required field. */
  var parentUserRoleId: js.UndefOr[java.lang.String] = js.undefined
  /** List of permissions associated with this user role. */
  var permissions: js.UndefOr[js.Array[UserRolePermission]] = js.undefined
  /** Subaccount ID of this user role. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
}

