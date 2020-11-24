package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTargetRequest extends js.Object {
  
  /**
    * Whether to create the target in background or foreground (chrome-only,
    * false by default).
    */
  var background: js.UndefOr[Boolean] = js.native
  
  /**
    * The browser context to create the page in.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.native
  
  /**
    * Whether BeginFrames for this target will be controlled via DevTools (headless chrome only,
    * not supported on MacOS yet, false by default).
    */
  var enableBeginFrameControl: js.UndefOr[Boolean] = js.native
  
  /**
    * Frame height in DIP (headless chrome only).
    */
  var height: js.UndefOr[integer] = js.native
  
  /**
    * Whether to create a new Window or Tab (chrome-only, false by default).
    */
  var newWindow: js.UndefOr[Boolean] = js.native
  
  /**
    * The initial URL the page will be navigated to.
    */
  var url: String = js.native
  
  /**
    * Frame width in DIP (headless chrome only).
    */
  var width: js.UndefOr[integer] = js.native
}
object CreateTargetRequest {
  
  @scala.inline
  def apply(url: String): CreateTargetRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTargetRequest]
  }
  
  @scala.inline
  implicit class CreateTargetRequestOps[Self <: CreateTargetRequest] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = this.set("browserContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserContextId: Self = this.set("browserContextId", js.undefined)
    
    @scala.inline
    def setEnableBeginFrameControl(value: Boolean): Self = this.set("enableBeginFrameControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBeginFrameControl: Self = this.set("enableBeginFrameControl", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setNewWindow(value: Boolean): Self = this.set("newWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewWindow: Self = this.set("newWindow", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
