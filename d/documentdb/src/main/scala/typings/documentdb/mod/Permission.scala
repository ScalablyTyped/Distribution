package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission
  extends StObject
     with UniqueId {
  
  /** The mode of the permission */
  var permissionMode: PermissionMode
  
  /** The link of the resource that the permission will be applied to. */
  var resource: String
}
object Permission {
  
  @scala.inline
  def apply(id: String, permissionMode: PermissionMode, resource: String): Permission = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], permissionMode = permissionMode.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit class PermissionMutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionMode(value: PermissionMode): Self = StObject.set(x, "permissionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
