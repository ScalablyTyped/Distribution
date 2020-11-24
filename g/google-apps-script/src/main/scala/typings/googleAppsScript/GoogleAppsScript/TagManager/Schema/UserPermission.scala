package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPermission extends js.Object {
  
  var accountAccess: js.UndefOr[AccountAccess] = js.native
  
  var accountId: js.UndefOr[String] = js.native
  
  var containerAccess: js.UndefOr[js.Array[ContainerAccess]] = js.native
  
  var emailAddress: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object UserPermission {
  
  @scala.inline
  def apply(): UserPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPermission]
  }
  
  @scala.inline
  implicit class UserPermissionOps[Self <: UserPermission] (val x: Self) extends AnyVal {
    
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
    def setAccountAccess(value: AccountAccess): Self = this.set("accountAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAccess: Self = this.set("accountAccess", js.undefined)
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setContainerAccessVarargs(value: ContainerAccess*): Self = this.set("containerAccess", js.Array(value :_*))
    
    @scala.inline
    def setContainerAccess(value: js.Array[ContainerAccess]): Self = this.set("containerAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerAccess: Self = this.set("containerAccess", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
