package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A permission required by the app.
  */
trait SchemaApplicationPermission extends StObject {
  
  /**
    * A longer description of the permission, providing more detail on what it
    * affects. Localized.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the permission. Localized.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An opaque string uniquely identifying the permission. Not localized.
    */
  var permissionId: js.UndefOr[String] = js.undefined
}
object SchemaApplicationPermission {
  
  inline def apply(): SchemaApplicationPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationPermission]
  }
  
  extension [Self <: SchemaApplicationPermission](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
  }
}
