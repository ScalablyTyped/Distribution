package typings.devtoolsProtocol.mod.Protocol.Browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetPermissionsRequest extends js.Object {
  
  /**
    * BrowserContext to reset permissions. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.native
}
object ResetPermissionsRequest {
  
  @scala.inline
  def apply(): ResetPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPermissionsRequest]
  }
  
  @scala.inline
  implicit class ResetPermissionsRequestOps[Self <: ResetPermissionsRequest] (val x: Self) extends AnyVal {
    
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
    def setBrowserContextId(value: BrowserContextID): Self = this.set("browserContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserContextId: Self = this.set("browserContextId", js.undefined)
  }
}
