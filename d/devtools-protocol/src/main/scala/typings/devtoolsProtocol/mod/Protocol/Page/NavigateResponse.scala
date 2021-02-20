package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateResponse extends StObject {
  
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
  implicit class NavigateResponseMutableBuilder[Self <: NavigateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderIdUndefined: Self = StObject.set(x, "loaderId", js.undefined)
  }
}
