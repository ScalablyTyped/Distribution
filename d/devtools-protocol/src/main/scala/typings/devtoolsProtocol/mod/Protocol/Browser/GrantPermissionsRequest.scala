package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantPermissionsRequest extends StObject {
  
  /**
    * BrowserContext to override permissions. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
  
  /**
    * Origin the permission applies to, all origins if not specified.
    */
  var origin: js.UndefOr[String] = js.undefined
  
  var permissions: js.Array[PermissionType]
}
object GrantPermissionsRequest {
  
  @scala.inline
  def apply(permissions: js.Array[PermissionType]): GrantPermissionsRequest = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantPermissionsRequest]
  }
  
  @scala.inline
  implicit class GrantPermissionsRequestMutableBuilder[Self <: GrantPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[PermissionType]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: PermissionType*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
