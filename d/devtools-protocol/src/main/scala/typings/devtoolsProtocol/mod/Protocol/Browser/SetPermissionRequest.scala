package typings.devtoolsProtocol.mod.Protocol.Browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetPermissionRequest extends js.Object {
  /**
    * Context to override. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.native
  /**
    * Origin the permission applies to, all origins if not specified.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * Descriptor of permission to override.
    */
  var permission: PermissionDescriptor = js.native
  /**
    * Setting of the permission.
    */
  var setting: PermissionSetting = js.native
}

object SetPermissionRequest {
  @scala.inline
  def apply(permission: PermissionDescriptor, setting: PermissionSetting): SetPermissionRequest = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPermissionRequest]
  }
  @scala.inline
  implicit class SetPermissionRequestOps[Self <: SetPermissionRequest] (val x: Self) extends AnyVal {
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
    def setPermission(value: PermissionDescriptor): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetting(value: PermissionSetting): Self = this.set("setting", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = this.set("browserContextId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserContextId: Self = this.set("browserContextId", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

