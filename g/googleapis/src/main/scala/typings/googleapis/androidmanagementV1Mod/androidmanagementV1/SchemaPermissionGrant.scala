package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for an Android permission and its grant state.
  */
@js.native
trait SchemaPermissionGrant extends StObject {
  
  /**
    * The Android permission or group, e.g. android.permission.READ_CALENDAR or
    * android.permission_group.CALENDAR.
    */
  var permission: js.UndefOr[String] = js.native
  
  /**
    * The policy for granting the permission.
    */
  var policy: js.UndefOr[String] = js.native
}
object SchemaPermissionGrant {
  
  @scala.inline
  def apply(): SchemaPermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionGrant]
  }
  
  @scala.inline
  implicit class SchemaPermissionGrantMutableBuilder[Self <: SchemaPermissionGrant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
