package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionDescriptor extends StObject {
  
  /**
    * For "clipboard" permission, may specify allowWithoutSanitization.
    */
  var allowWithoutSanitization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of permission.
    * See https://cs.chromium.org/chromium/src/third_party/blink/renderer/modules/permissions/permission_descriptor.idl for valid permission names.
    */
  var name: String
  
  /**
    * For "camera" permission, may specify panTiltZoom.
    */
  var panTiltZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For "midi" permission, may also specify sysex control.
    */
  var sysex: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For "push" permission, may specify userVisibleOnly.
    * Note that userVisibleOnly = true is the only currently supported type.
    */
  var userVisibleOnly: js.UndefOr[Boolean] = js.undefined
}
object PermissionDescriptor {
  
  inline def apply(name: String): PermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDescriptor]
  }
  
  extension [Self <: PermissionDescriptor](x: Self) {
    
    inline def setAllowWithoutSanitization(value: Boolean): Self = StObject.set(x, "allowWithoutSanitization", value.asInstanceOf[js.Any])
    
    inline def setAllowWithoutSanitizationUndefined: Self = StObject.set(x, "allowWithoutSanitization", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPanTiltZoom(value: Boolean): Self = StObject.set(x, "panTiltZoom", value.asInstanceOf[js.Any])
    
    inline def setPanTiltZoomUndefined: Self = StObject.set(x, "panTiltZoom", js.undefined)
    
    inline def setSysex(value: Boolean): Self = StObject.set(x, "sysex", value.asInstanceOf[js.Any])
    
    inline def setSysexUndefined: Self = StObject.set(x, "sysex", js.undefined)
    
    inline def setUserVisibleOnly(value: Boolean): Self = StObject.set(x, "userVisibleOnly", value.asInstanceOf[js.Any])
    
    inline def setUserVisibleOnlyUndefined: Self = StObject.set(x, "userVisibleOnly", js.undefined)
  }
}
