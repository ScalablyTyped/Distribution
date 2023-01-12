package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightFrameRequest extends StObject {
  
  /**
    * The content box highlight fill color (default: transparent).
    */
  var contentColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The content box highlight outline color (default: transparent).
    */
  var contentOutlineColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * Identifier of the frame to highlight.
    */
  var frameId: FrameId
}
object HighlightFrameRequest {
  
  inline def apply(frameId: FrameId): HighlightFrameRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightFrameRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighlightFrameRequest] (val x: Self) extends AnyVal {
    
    inline def setContentColor(value: RGBA): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
    
    inline def setContentColorUndefined: Self = StObject.set(x, "contentColor", js.undefined)
    
    inline def setContentOutlineColor(value: RGBA): Self = StObject.set(x, "contentOutlineColor", value.asInstanceOf[js.Any])
    
    inline def setContentOutlineColorUndefined: Self = StObject.set(x, "contentOutlineColor", js.undefined)
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
