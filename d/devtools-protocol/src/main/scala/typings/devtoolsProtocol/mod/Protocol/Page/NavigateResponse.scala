package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateResponse extends js.Object {
  
  /**
    * User friendly error message, present if and only if navigation has failed.
    */
  var errorText: js.UndefOr[String] = js.native
  
  /**
    * Frame id that has navigated (or failed to navigate)
    */
  var frameId: FrameId = js.native
  
  /**
    * Loader identifier.
    */
  var loaderId: js.UndefOr[LoaderId] = js.native
}
object NavigateResponse {
  
  @scala.inline
  def apply(frameId: FrameId): NavigateResponse = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateResponse]
  }
  
  @scala.inline
  implicit class NavigateResponseOps[Self <: NavigateResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorText: Self = this.set("errorText", js.undefined)
    
    @scala.inline
    def setLoaderId(value: LoaderId): Self = this.set("loaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaderId: Self = this.set("loaderId", js.undefined)
  }
}
