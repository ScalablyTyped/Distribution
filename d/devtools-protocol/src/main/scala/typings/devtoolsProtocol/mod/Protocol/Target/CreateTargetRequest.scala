package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTargetRequest extends StObject {
  
  /**
    * Whether to create the target in background or foreground (chrome-only,
    * false by default).
    */
  var background: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The browser context to create the page in.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
  
  /**
    * Whether BeginFrames for this target will be controlled via DevTools (headless chrome only,
    * not supported on MacOS yet, false by default).
    */
  var enableBeginFrameControl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Frame height in DIP (headless chrome only).
    */
  var height: js.UndefOr[integer] = js.undefined
  
  /**
    * Whether to create a new Window or Tab (chrome-only, false by default).
    */
  var newWindow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The initial URL the page will be navigated to. An empty string indicates about:blank.
    */
  var url: String
  
  /**
    * Frame width in DIP (headless chrome only).
    */
  var width: js.UndefOr[integer] = js.undefined
}
object CreateTargetRequest {
  
  inline def apply(url: String): CreateTargetRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTargetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTargetRequest] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
    
    inline def setEnableBeginFrameControl(value: Boolean): Self = StObject.set(x, "enableBeginFrameControl", value.asInstanceOf[js.Any])
    
    inline def setEnableBeginFrameControlUndefined: Self = StObject.set(x, "enableBeginFrameControl", js.undefined)
    
    inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
    
    inline def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
