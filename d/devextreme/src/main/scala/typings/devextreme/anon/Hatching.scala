package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hatching extends StObject {
  
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var hatching: js.UndefOr[Step] = js.undefined
}
object Hatching {
  
  inline def apply(): Hatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hatching]
  }
  
  extension [Self <: Hatching](x: Self) {
    
    inline def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHatching(value: Step): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
  }
}
