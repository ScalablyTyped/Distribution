package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightRectRequest extends StObject {
  
  /**
    * The highlight fill color (default: transparent).
    */
  var color: js.UndefOr[RGBA] = js.undefined
  
  /**
    * Rectangle height
    */
  var height: integer
  
  /**
    * The highlight outline color (default: transparent).
    */
  var outlineColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * Rectangle width
    */
  var width: integer
  
  /**
    * X coordinate
    */
  var x: integer
  
  /**
    * Y coordinate
    */
  var y: integer
}
object HighlightRectRequest {
  
  inline def apply(height: integer, width: integer, x: integer, y: integer): HighlightRectRequest = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightRectRequest]
  }
  
  extension [Self <: HighlightRectRequest](x: Self) {
    
    inline def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOutlineColor(value: RGBA): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
