package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.Quad
import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightQuadRequest extends StObject {
  
  /**
    * The highlight fill color (default: transparent).
    */
  var color: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The highlight outline color (default: transparent).
    */
  var outlineColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * Quad to highlight
    */
  var quad: Quad
}
object HighlightQuadRequest {
  
  inline def apply(quad: Quad): HighlightQuadRequest = {
    val __obj = js.Dynamic.literal(quad = quad.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightQuadRequest]
  }
  
  extension [Self <: HighlightQuadRequest](x: Self) {
    
    inline def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOutlineColor(value: RGBA): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setQuad(value: Quad): Self = StObject.set(x, "quad", value.asInstanceOf[js.Any])
    
    inline def setQuadVarargs(value: Double*): Self = StObject.set(x, "quad", js.Array(value :_*))
  }
}
