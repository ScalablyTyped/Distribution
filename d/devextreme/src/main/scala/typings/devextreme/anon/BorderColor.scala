package typings.devextreme.anon

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColor extends StObject {
  
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  
  var hatching: js.UndefOr[Step] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object BorderColor {
  
  inline def apply(): BorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColor]
  }
  
  extension [Self <: BorderColor](x: Self) {
    
    inline def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: dash | dot | longDash | solid): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setHatching(value: Step): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
