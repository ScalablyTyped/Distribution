package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountPermissionGroupsListResponse extends js.Object {
  /** Account permission group collection. */
  var accountPermissionGroups: js.UndefOr[js.Array[AccountPermissionGroup]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionGroupsListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object AccountPermissionGroupsListResponse {
  @scala.inline
  def apply(): AccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionGroupsListResponse]
  }
  @scala.inline
  implicit class AccountPermissionGroupsListResponseOps[Self <: AccountPermissionGroupsListResponse] (val x: Self) extends AnyVal {
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
    def setAccountPermissionGroupsVarargs(value: AccountPermissionGroup*): Self = this.set("accountPermissionGroups", js.Array(value :_*))
    @scala.inline
    def setAccountPermissionGroups(value: js.Array[AccountPermissionGroup]): Self = this.set("accountPermissionGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountPermissionGroups: Self = this.set("accountPermissionGroups", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

