package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A product permissions resource represents the set of permissions required
  * by a specific app and whether or not they have been accepted by an
  * enterprise admin.  The API can be used to read the set of permissions, and
  * also to update the set to indicate that permissions have been accepted.
  */
@js.native
trait SchemaProductPermission extends StObject {
  
  /**
    * An opaque string uniquely identifying the permission.
    */
  var permissionId: js.UndefOr[String] = js.native
  
  /**
    * Whether the permission has been accepted or not.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaProductPermission {
  
  @scala.inline
  def apply(): SchemaProductPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPermission]
  }
  
  @scala.inline
  implicit class SchemaProductPermissionMutableBuilder[Self <: SchemaProductPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
