package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightFrameRequest extends StObject {
  
  /**
    * The content box highlight fill color (default: transparent).
    */
  var contentColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The content box highlight outline color (default: transparent).
    */
  var contentOutlineColor: js.UndefOr[RGBA] = js.native
  
  /**
    * Identifier of the frame to highlight.
    */
  var frameId: FrameId = js.native
}
object HighlightFrameRequest {
  
  @scala.inline
  def apply(frameId: FrameId): HighlightFrameRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightFrameRequest]
  }
  
  @scala.inline
  implicit class HighlightFrameRequestMutableBuilder[Self <: HighlightFrameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentColor(value: RGBA): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentColorUndefined: Self = StObject.set(x, "contentColor", js.undefined)
    
    @scala.inline
    def setContentOutlineColor(value: RGBA): Self = StObject.set(x, "contentOutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOutlineColorUndefined: Self = StObject.set(x, "contentOutlineColor", js.undefined)
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
