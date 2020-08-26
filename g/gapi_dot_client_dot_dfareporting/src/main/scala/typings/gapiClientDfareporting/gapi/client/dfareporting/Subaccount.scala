package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subaccount extends js.Object {
  /** ID of the account that contains this subaccount. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.native
  /** IDs of the available user role permissions for this subaccount. */
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.native
  /** ID of this subaccount. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#subaccount". */
  var kind: js.UndefOr[String] = js.native
  /** Name of this subaccount. This is a required field. Must be less than 128 characters long and be unique among subaccounts of the same account. */
  var name: js.UndefOr[String] = js.native
}

object Subaccount {
  @scala.inline
  def apply(): Subaccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subaccount]
  }
  @scala.inline
  implicit class SubaccountOps[Self <: Subaccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAvailablePermissionIdsVarargs(value: String*): Self = this.set("availablePermissionIds", js.Array(value :_*))
    @scala.inline
    def setAvailablePermissionIds(value: js.Array[String]): Self = this.set("availablePermissionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailablePermissionIds: Self = this.set("availablePermissionIds", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

