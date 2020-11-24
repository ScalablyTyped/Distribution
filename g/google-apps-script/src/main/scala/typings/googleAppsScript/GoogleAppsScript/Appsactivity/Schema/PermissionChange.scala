package typings.googleAppsScript.GoogleAppsScript.Appsactivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionChange extends js.Object {
  
  var addedPermissions: js.UndefOr[js.Array[Permission]] = js.native
  
  var removedPermissions: js.UndefOr[js.Array[Permission]] = js.native
}
object PermissionChange {
  
  @scala.inline
  def apply(): PermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionChange]
  }
  
  @scala.inline
  implicit class PermissionChangeOps[Self <: PermissionChange] (val x: Self) extends AnyVal {
    
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
    def setAddedPermissionsVarargs(value: Permission*): Self = this.set("addedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setAddedPermissions(value: js.Array[Permission]): Self = this.set("addedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedPermissions: Self = this.set("addedPermissions", js.undefined)
    
    @scala.inline
    def setRemovedPermissionsVarargs(value: Permission*): Self = this.set("removedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRemovedPermissions(value: js.Array[Permission]): Self = this.set("removedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovedPermissions: Self = this.set("removedPermissions", js.undefined)
  }
}
