package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverStyle extends StObject {
  
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  var hoverStyle: js.UndefOr[Border] = js.undefined
  
  var selectionStyle: js.UndefOr[Border] = js.undefined
}
object HoverStyle {
  
  inline def apply(): HoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverStyle]
  }
  
  extension [Self <: HoverStyle](x: Self) {
    
    inline def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setHoverStyle(value: Border): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setSelectionStyle(value: Border): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
  }
}
