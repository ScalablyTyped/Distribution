package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplicationPermission extends StObject {
  
  /**
    * A longer description of the permission, providing more detail on what it affects. Localized.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the permission. Localized.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An opaque string uniquely identifying the permission. Not localized.
    */
  var permissionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplicationPermission {
  
  inline def apply(): SchemaApplicationPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationPermission]
  }
  
  extension [Self <: SchemaApplicationPermission](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdNull: Self = StObject.set(x, "permissionId", null)
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
  }
}
