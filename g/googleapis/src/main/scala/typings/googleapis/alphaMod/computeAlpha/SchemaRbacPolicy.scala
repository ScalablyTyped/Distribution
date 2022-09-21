package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRbacPolicy extends StObject {
  
  /**
    * Name of the RbacPolicy.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of permissions.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.undefined
  
  /**
    * The list of principals.
    */
  var principals: js.UndefOr[js.Array[SchemaPrincipal]] = js.undefined
}
object SchemaRbacPolicy {
  
  inline def apply(): SchemaRbacPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRbacPolicy]
  }
  
  extension [Self <: SchemaRbacPolicy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setPrincipals(value: js.Array[SchemaPrincipal]): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: SchemaPrincipal*): Self = StObject.set(x, "principals", js.Array(value*))
  }
}
