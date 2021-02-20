package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightRectRequest extends StObject {
  
  /**
    * The highlight fill color (default: transparent).
    */
  var color: js.UndefOr[RGBA] = js.native
  
  /**
    * Rectangle height
    */
  var height: integer = js.native
  
  /**
    * The highlight outline color (default: transparent).
    */
  var outlineColor: js.UndefOr[RGBA] = js.native
  
  /**
    * Rectangle width
    */
  var width: integer = js.native
  
  /**
    * X coordinate
    */
  var x: integer = js.native
  
  /**
    * Y coordinate
    */
  var y: integer = js.native
}
object HighlightRectRequest {
  
  @scala.inline
  def apply(height: integer, width: integer, x: integer, y: integer): HighlightRectRequest = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightRectRequest]
  }
  
  @scala.inline
  implicit class HighlightRectRequestMutableBuilder[Self <: HighlightRectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColor(value: RGBA): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
