package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subaccount extends js.Object {
  /** ID of the account that contains this subaccount. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /** IDs of the available user role permissions for this subaccount. */
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.undefined
  /** ID of this subaccount. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#subaccount". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this subaccount. This is a required field. Must be less than 128 characters long and be unique among subaccounts of the same account. */
  var name: js.UndefOr[String] = js.undefined
}

object Subaccount {
  @scala.inline
  def apply(
    accountId: String = null,
    availablePermissionIds: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    name: String = null
  ): Subaccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (availablePermissionIds != null) __obj.updateDynamic("availablePermissionIds")(availablePermissionIds)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Subaccount]
  }
}

