package typings.devtoolsProtocol.mod.Protocol.Browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionDescriptor extends js.Object {
  
  /**
    * For "clipboard" permission, may specify allowWithoutSanitization.
    */
  var allowWithoutSanitization: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of permission.
    * See https://cs.chromium.org/chromium/src/third_party/blink/renderer/modules/permissions/permission_descriptor.idl for valid permission names.
    */
  var name: String = js.native
  
  /**
    * For "camera" permission, may specify panTiltZoom.
    */
  var panTiltZoom: js.UndefOr[Boolean] = js.native
  
  /**
    * For "midi" permission, may also specify sysex control.
    */
  var sysex: js.UndefOr[Boolean] = js.native
  
  /**
    * For "push" permission, may specify userVisibleOnly.
    * Note that userVisibleOnly = true is the only currently supported type.
    */
  var userVisibleOnly: js.UndefOr[Boolean] = js.native
}
object PermissionDescriptor {
  
  @scala.inline
  def apply(name: String): PermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDescriptor]
  }
  
  @scala.inline
  implicit class PermissionDescriptorOps[Self <: PermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowWithoutSanitization(value: Boolean): Self = this.set("allowWithoutSanitization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowWithoutSanitization: Self = this.set("allowWithoutSanitization", js.undefined)
    
    @scala.inline
    def setPanTiltZoom(value: Boolean): Self = this.set("panTiltZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanTiltZoom: Self = this.set("panTiltZoom", js.undefined)
    
    @scala.inline
    def setSysex(value: Boolean): Self = this.set("sysex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSysex: Self = this.set("sysex", js.undefined)
    
    @scala.inline
    def setUserVisibleOnly(value: Boolean): Self = this.set("userVisibleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleOnly: Self = this.set("userVisibleOnly", js.undefined)
  }
}
