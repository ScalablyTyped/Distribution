package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateResponse extends StObject {
  
  /**
    * User friendly error message, present if and only if navigation has failed.
    */
  var errorText: js.UndefOr[String] = js.undefined
  
  /**
    * Frame id that has navigated (or failed to navigate)
    */
  var frameId: FrameId
  
  /**
    * Loader identifier. This is omitted in case of same-document navigation,
    * as the previously committed loaderId would not change.
    */
  var loaderId: js.UndefOr[LoaderId] = js.undefined
}
object NavigateResponse {
  
  inline def apply(frameId: FrameId): NavigateResponse = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateResponse]
  }
  
  extension [Self <: NavigateResponse](x: Self) {
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setLoaderIdUndefined: Self = StObject.set(x, "loaderId", js.undefined)
  }
}
