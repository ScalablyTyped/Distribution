package typings.googleVisualization.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color1 extends StObject {
  
  var color1: String
  
  var color2: String
  
  var useObjectBoundingBoxUnits: js.UndefOr[Boolean] = js.undefined
  
  var x1: String
  
  var x2: String
  
  var y1: String
  
  var y2: String
}
object Color1 {
  
  inline def apply(color1: String, color2: String, x1: String, x2: String, y1: String, y2: String): Color1 = {
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], color2 = color2.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color1] (val x: Self) extends AnyVal {
    
    inline def setColor1(value: String): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
    
    inline def setColor2(value: String): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
    
    inline def setUseObjectBoundingBoxUnits(value: Boolean): Self = StObject.set(x, "useObjectBoundingBoxUnits", value.asInstanceOf[js.Any])
    
    inline def setUseObjectBoundingBoxUnitsUndefined: Self = StObject.set(x, "useObjectBoundingBoxUnits", js.undefined)
    
    inline def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
