package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecurityIsolationStatusRequest extends js.Object {
  
  /**
    * If no frameId is provided, the status of the target is provided.
    */
  var frameId: js.UndefOr[FrameId] = js.native
}
object GetSecurityIsolationStatusRequest {
  
  @scala.inline
  def apply(): GetSecurityIsolationStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityIsolationStatusRequest]
  }
  
  @scala.inline
  implicit class GetSecurityIsolationStatusRequestOps[Self <: GetSecurityIsolationStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
  }
}
