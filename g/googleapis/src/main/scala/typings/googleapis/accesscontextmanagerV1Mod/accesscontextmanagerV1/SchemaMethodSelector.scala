package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMethodSelector extends StObject {
  
  /**
    * Value for `method` should be a valid method name for the corresponding `service_name` in ApiOperation. If `*` used as value for `method`, then ALL methods and permissions are allowed.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value for `permission` should be a valid Cloud IAM permission for the corresponding `service_name` in ApiOperation.
    */
  var permission: js.UndefOr[String | Null] = js.undefined
}
object SchemaMethodSelector {
  
  inline def apply(): SchemaMethodSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMethodSelector]
  }
  
  extension [Self <: SchemaMethodSelector](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
