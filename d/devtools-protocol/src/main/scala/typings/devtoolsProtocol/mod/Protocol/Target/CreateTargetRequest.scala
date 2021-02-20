package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTargetRequest extends StObject {
  
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
  implicit class CreateTargetRequestMutableBuilder[Self <: CreateTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
    
    @scala.inline
    def setEnableBeginFrameControl(value: Boolean): Self = StObject.set(x, "enableBeginFrameControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBeginFrameControlUndefined: Self = StObject.set(x, "enableBeginFrameControl", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
