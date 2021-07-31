package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a Drive object&#39;s permissions that changed as
  * a result of a permissionChange type event.
  */
trait SchemaPermissionChange extends StObject {
  
  /**
    * Lists all Permission objects added.
    */
  var addedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.undefined
  
  /**
    * Lists all Permission objects removed.
    */
  var removedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.undefined
}
object SchemaPermissionChange {
  
  @scala.inline
  def apply(): SchemaPermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionChange]
  }
  
  @scala.inline
  implicit class SchemaPermissionChangeMutableBuilder[Self <: SchemaPermissionChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
    
    @scala.inline
    def setAddedPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "addedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRemovedPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
    
    @scala.inline
    def setRemovedPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "removedPermissions", js.Array(value :_*))
  }
}
