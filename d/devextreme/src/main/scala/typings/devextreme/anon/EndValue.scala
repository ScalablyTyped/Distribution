package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndValue extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var endValue: js.UndefOr[Double] = js.undefined
  
  var startValue: js.UndefOr[Double] = js.undefined
}
object EndValue {
  
  inline def apply(): EndValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndValue]
  }
  
  extension [Self <: EndValue](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
