package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPermissionRequest extends StObject {
  
  /**
    * Context to override. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
  
  /**
    * Origin the permission applies to, all origins if not specified.
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /**
    * Descriptor of permission to override.
    */
  var permission: PermissionDescriptor
  
  /**
    * Setting of the permission.
    */
  var setting: PermissionSetting
}
object SetPermissionRequest {
  
  inline def apply(permission: PermissionDescriptor, setting: PermissionSetting): SetPermissionRequest = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPermissionRequest]
  }
  
  extension [Self <: SetPermissionRequest](x: Self) {
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPermission(value: PermissionDescriptor): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setSetting(value: PermissionSetting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
