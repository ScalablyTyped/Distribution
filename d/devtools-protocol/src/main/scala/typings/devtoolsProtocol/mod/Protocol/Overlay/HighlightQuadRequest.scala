package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.Quad
import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightQuadRequest extends StObject {
  
  /**
    * The highlight fill color (default: transparent).
    */
  var color: js.UndefOr[RGBA] = js.native
  
  /**
    * The highlight outline color (default: transparent).
    */
  var outlineColor: js.UndefOr[RGBA] = js.native
  
  /**
    * Quad to highlight
    */
  var quad: Quad = js.native
}
object HighlightQuadRequest {
  
  @scala.inline
  def apply(quad: Quad): HighlightQuadRequest = {
    val __obj = js.Dynamic.literal(quad = quad.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightQuadRequest]
  }
  
  @scala.inline
  implicit class HighlightQuadRequestMutableBuilder[Self <: HighlightQuadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: RGBA): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setQuad(value: Quad): Self = StObject.set(x, "quad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuadVarargs(value: Double*): Self = StObject.set(x, "quad", js.Array(value :_*))
  }
}
