package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  var hatching: js.UndefOr[Step] = js.undefined
}
object Border {
  
  inline def apply(): Border = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setHatching(value: Step): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
  }
}
