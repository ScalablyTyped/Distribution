package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/dropdown.html#optional-javascript-configuration
trait DropdownOptions extends StObject {
  
  var active_class: js.UndefOr[String] = js.undefined
  
  var align: js.UndefOr[String] = js.undefined
  
  var closed: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var disabled_class: js.UndefOr[String] = js.undefined
  
  var hover_timeout: js.UndefOr[Double] = js.undefined
  
  var is_hover: js.UndefOr[Boolean] = js.undefined
  
  var mega_class: js.UndefOr[String] = js.undefined
  
  var opened: js.UndefOr[js.Function0[js.Any]] = js.undefined
}
object DropdownOptions {
  
  inline def apply(): DropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownOptions]
  }
  
  extension [Self <: DropdownOptions](x: Self) {
    
    inline def setActive_class(value: String): Self = StObject.set(x, "active_class", value.asInstanceOf[js.Any])
    
    inline def setActive_classUndefined: Self = StObject.set(x, "active_class", js.undefined)
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setClosed(value: () => js.Any): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setDisabled_class(value: String): Self = StObject.set(x, "disabled_class", value.asInstanceOf[js.Any])
    
    inline def setDisabled_classUndefined: Self = StObject.set(x, "disabled_class", js.undefined)
    
    inline def setHover_timeout(value: Double): Self = StObject.set(x, "hover_timeout", value.asInstanceOf[js.Any])
    
    inline def setHover_timeoutUndefined: Self = StObject.set(x, "hover_timeout", js.undefined)
    
    inline def setIs_hover(value: Boolean): Self = StObject.set(x, "is_hover", value.asInstanceOf[js.Any])
    
    inline def setIs_hoverUndefined: Self = StObject.set(x, "is_hover", js.undefined)
    
    inline def setMega_class(value: String): Self = StObject.set(x, "mega_class", value.asInstanceOf[js.Any])
    
    inline def setMega_classUndefined: Self = StObject.set(x, "mega_class", js.undefined)
    
    inline def setOpened(value: () => js.Any): Self = StObject.set(x, "opened", js.Any.fromFunction0(value))
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
  }
}
