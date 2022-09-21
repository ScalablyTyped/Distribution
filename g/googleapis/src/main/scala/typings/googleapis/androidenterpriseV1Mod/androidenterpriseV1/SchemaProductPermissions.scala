package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductPermissions extends StObject {
  
  /**
    * The permissions required by the app.
    */
  var permission: js.UndefOr[js.Array[SchemaProductPermission]] = js.undefined
  
  /**
    * The ID of the app that the permissions relate to, e.g. "app:com.google.android.gm".
    */
  var productId: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductPermissions {
  
  inline def apply(): SchemaProductPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPermissions]
  }
  
  extension [Self <: SchemaProductPermissions](x: Self) {
    
    inline def setPermission(value: js.Array[SchemaProductPermission]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPermissionVarargs(value: SchemaProductPermission*): Self = StObject.set(x, "permission", js.Array(value*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
