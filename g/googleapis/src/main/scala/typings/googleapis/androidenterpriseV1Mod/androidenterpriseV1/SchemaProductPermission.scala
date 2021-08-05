package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A product permissions resource represents the set of permissions required
  * by a specific app and whether or not they have been accepted by an
  * enterprise admin.  The API can be used to read the set of permissions, and
  * also to update the set to indicate that permissions have been accepted.
  */
trait SchemaProductPermission extends StObject {
  
  /**
    * An opaque string uniquely identifying the permission.
    */
  var permissionId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the permission has been accepted or not.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaProductPermission {
  
  inline def apply(): SchemaProductPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPermission]
  }
  
  extension [Self <: SchemaProductPermission](x: Self) {
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
