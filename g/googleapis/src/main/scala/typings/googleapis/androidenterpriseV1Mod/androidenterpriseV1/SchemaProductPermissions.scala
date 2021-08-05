package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the permissions required by a specific app and whether
  * they have been accepted by the enterprise.
  */
trait SchemaProductPermissions extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#productPermissions&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The permissions required by the app.
    */
  var permission: js.UndefOr[js.Array[SchemaProductPermission]] = js.undefined
  
  /**
    * The ID of the app that the permissions relate to, e.g.
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object SchemaProductPermissions {
  
  inline def apply(): SchemaProductPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPermissions]
  }
  
  extension [Self <: SchemaProductPermissions](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPermission(value: js.Array[SchemaProductPermission]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPermissionVarargs(value: SchemaProductPermission*): Self = StObject.set(x, "permission", js.Array(value :_*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
