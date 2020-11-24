package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a Drive object&#39;s permissions that changed as
  * a result of a permissionChange type event.
  */
@js.native
trait SchemaPermissionChange extends js.Object {
  
  /**
    * Lists all Permission objects added.
    */
  var addedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  
  /**
    * Lists all Permission objects removed.
    */
  var removedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
}
object SchemaPermissionChange {
  
  @scala.inline
  def apply(): SchemaPermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionChange]
  }
  
  @scala.inline
  implicit class SchemaPermissionChangeOps[Self <: SchemaPermissionChange] (val x: Self) extends AnyVal {
    
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
    def setAddedPermissionsVarargs(value: SchemaPermission*): Self = this.set("addedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setAddedPermissions(value: js.Array[SchemaPermission]): Self = this.set("addedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedPermissions: Self = this.set("addedPermissions", js.undefined)
    
    @scala.inline
    def setRemovedPermissionsVarargs(value: SchemaPermission*): Self = this.set("removedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRemovedPermissions(value: js.Array[SchemaPermission]): Self = this.set("removedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovedPermissions: Self = this.set("removedPermissions", js.undefined)
  }
}
