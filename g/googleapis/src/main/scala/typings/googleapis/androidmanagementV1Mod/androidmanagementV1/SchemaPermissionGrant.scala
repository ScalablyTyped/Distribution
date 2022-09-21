package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPermissionGrant extends StObject {
  
  /**
    * The Android permission or group, e.g. android.permission.READ_CALENDAR or android.permission_group.CALENDAR.
    */
  var permission: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The policy for granting the permission.
    */
  var policy: js.UndefOr[String | Null] = js.undefined
}
object SchemaPermissionGrant {
  
  inline def apply(): SchemaPermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionGrant]
  }
  
  extension [Self <: SchemaPermissionGrant](x: Self) {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyNull: Self = StObject.set(x, "policy", null)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
