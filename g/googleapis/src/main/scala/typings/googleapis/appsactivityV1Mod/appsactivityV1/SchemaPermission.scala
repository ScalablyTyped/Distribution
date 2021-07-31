package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the permissions and type of access allowed with
  * regards to a Google Drive object. This is a subset of the fields contained
  * in a corresponding Drive Permissions object.
  */
trait SchemaPermission extends StObject {
  
  /**
    * The name of the user or group the permission applies to.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for this permission. Corresponds to the Drive API&#39;s permission
    * ID returned as part of the Drive Permissions resource.
    */
  var permissionId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the Google Drive permissions role. The role determines a
    * user&#39;s ability to read, write, or comment on the file.
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates how widely permissions are granted.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s information if the type is USER.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Whether the permission requires a link to the file.
    */
  var withLink: js.UndefOr[Boolean] = js.undefined
}
object SchemaPermission {
  
  @scala.inline
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  @scala.inline
  implicit class SchemaPermissionMutableBuilder[Self <: SchemaPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setWithLink(value: Boolean): Self = StObject.set(x, "withLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithLinkUndefined: Self = StObject.set(x, "withLink", js.undefined)
  }
}
