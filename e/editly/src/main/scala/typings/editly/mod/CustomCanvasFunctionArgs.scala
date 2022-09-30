package typings.editly.mod

import typings.fabric.mod.fabric.Canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomCanvasFunctionArgs extends StObject {
  
  var canvas: Canvas
  
  var height: Double
  
  var width: Double
}
object CustomCanvasFunctionArgs {
  
  inline def apply(canvas: Canvas, height: Double, width: Double): CustomCanvasFunctionArgs = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomCanvasFunctionArgs]
  }
  
  extension [Self <: CustomCanvasFunctionArgs](x: Self) {
    
    inline def setCanvas(value: Canvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
