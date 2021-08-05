package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDropdownOptions extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var hOffset: js.UndefOr[Double] = js.undefined
  
  var hover: js.UndefOr[Boolean] = js.undefined
  
  var hoverDelay: js.UndefOr[Double] = js.undefined
  
  var hoverPane: js.UndefOr[Boolean] = js.undefined
  
  var positionClass: js.UndefOr[String] = js.undefined
  
  var trapFocus: js.UndefOr[Boolean] = js.undefined
  
  var vOffset: js.UndefOr[Double] = js.undefined
}
object IDropdownOptions {
  
  inline def apply(): IDropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownOptions]
  }
  
  extension [Self <: IDropdownOptions](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setHOffset(value: Double): Self = StObject.set(x, "hOffset", value.asInstanceOf[js.Any])
    
    inline def setHOffsetUndefined: Self = StObject.set(x, "hOffset", js.undefined)
    
    inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
    
    inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
    
    inline def setHoverPane(value: Boolean): Self = StObject.set(x, "hoverPane", value.asInstanceOf[js.Any])
    
    inline def setHoverPaneUndefined: Self = StObject.set(x, "hoverPane", js.undefined)
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setPositionClass(value: String): Self = StObject.set(x, "positionClass", value.asInstanceOf[js.Any])
    
    inline def setPositionClassUndefined: Self = StObject.set(x, "positionClass", js.undefined)
    
    inline def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
    
    inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    
    inline def setVOffset(value: Double): Self = StObject.set(x, "vOffset", value.asInstanceOf[js.Any])
    
    inline def setVOffsetUndefined: Self = StObject.set(x, "vOffset", js.undefined)
  }
}
