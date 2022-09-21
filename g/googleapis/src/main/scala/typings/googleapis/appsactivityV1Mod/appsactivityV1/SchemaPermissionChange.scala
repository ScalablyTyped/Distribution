package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  inline def apply(): SchemaPermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionChange]
  }
  
  extension [Self <: SchemaPermissionChange](x: Self) {
    
    inline def setAddedPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
    
    inline def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
    
    inline def setAddedPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "addedPermissions", js.Array(value*))
    
    inline def setRemovedPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
    
    inline def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
    
    inline def setRemovedPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "removedPermissions", js.Array(value*))
  }
}
