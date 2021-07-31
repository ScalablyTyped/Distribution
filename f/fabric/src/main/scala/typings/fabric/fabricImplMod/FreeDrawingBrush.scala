package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeDrawingBrush extends StObject {
  
  /**
    * Can be any regular color value.
    */
  var color: String
  
  /**
    * Brush width measured in pixels.
    */
  var width: Double
}
object FreeDrawingBrush {
  
  @scala.inline
  def apply(color: String, width: Double): FreeDrawingBrush = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeDrawingBrush]
  }
  
  @scala.inline
  implicit class FreeDrawingBrushMutableBuilder[Self <: FreeDrawingBrush] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
