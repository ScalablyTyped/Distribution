package typings.devtoolsProtocol.mod.Protocol.Browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetWindowBoundsRequest extends js.Object {
  
  /**
    * New window bounds. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined
    * with 'left', 'top', 'width' or 'height'. Leaves unspecified fields unchanged.
    */
  var bounds: Bounds = js.native
  
  /**
    * Browser window id.
    */
  var windowId: WindowID = js.native
}
object SetWindowBoundsRequest {
  
  @scala.inline
  def apply(bounds: Bounds, windowId: WindowID): SetWindowBoundsRequest = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWindowBoundsRequest]
  }
  
  @scala.inline
  implicit class SetWindowBoundsRequestOps[Self <: SetWindowBoundsRequest] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: WindowID): Self = this.set("windowId", value.asInstanceOf[js.Any])
  }
}
