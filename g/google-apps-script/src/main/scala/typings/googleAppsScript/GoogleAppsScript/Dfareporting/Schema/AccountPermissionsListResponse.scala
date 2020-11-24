package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPermissionsListResponse extends js.Object {
  
  var accountPermissions: js.UndefOr[js.Array[AccountPermission]] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object AccountPermissionsListResponse {
  
  @scala.inline
  def apply(): AccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionsListResponse]
  }
  
  @scala.inline
  implicit class AccountPermissionsListResponseOps[Self <: AccountPermissionsListResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountPermissionsVarargs(value: AccountPermission*): Self = this.set("accountPermissions", js.Array(value :_*))
    
    @scala.inline
    def setAccountPermissions(value: js.Array[AccountPermission]): Self = this.set("accountPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountPermissions: Self = this.set("accountPermissions", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
