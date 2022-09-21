package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPermission extends StObject {
  
  /**
    * The name of the user or group the permission applies to.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID for this permission. Corresponds to the Drive API&#39;s permission ID returned as part of the Drive Permissions resource.
    */
  var permissionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the Google Drive permissions role. The role determines a user&#39;s ability to read, write, or comment on the file.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates how widely permissions are granted.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user&#39;s information if the type is USER.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Whether the permission requires a link to the file.
    */
  var withLink: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPermission {
  
  inline def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  extension [Self <: SchemaPermission](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdNull: Self = StObject.set(x, "permissionId", null)
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWithLink(value: Boolean): Self = StObject.set(x, "withLink", value.asInstanceOf[js.Any])
    
    inline def setWithLinkNull: Self = StObject.set(x, "withLink", null)
    
    inline def setWithLinkUndefined: Self = StObject.set(x, "withLink", js.undefined)
  }
}
