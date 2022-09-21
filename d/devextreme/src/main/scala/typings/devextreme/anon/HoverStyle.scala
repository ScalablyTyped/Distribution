package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverStyle extends StObject {
  
  /**
    * Configures a funnel item&apos;s border.
    */
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  /**
    * Configures a funnel item&apos;s appearance when a user presses the item or hovers the mouse pointer over it.
    */
  var hoverStyle: js.UndefOr[Hatching] = js.undefined
  
  /**
    * Configures a funnel item&apos;s appearance when a user selects it.
    */
  var selectionStyle: js.UndefOr[Hatching] = js.undefined
}
object HoverStyle {
  
  inline def apply(): HoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverStyle]
  }
  
  extension [Self <: HoverStyle](x: Self) {
    
    inline def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setHoverStyle(value: Hatching): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setSelectionStyle(value: Hatching): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
  }
}
