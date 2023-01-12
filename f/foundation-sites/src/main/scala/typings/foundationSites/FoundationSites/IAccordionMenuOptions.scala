package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccordionMenuOptions extends StObject {
  
  var multiOpen: js.UndefOr[Boolean] = js.undefined
  
  var parentLink: js.UndefOr[Boolean] = js.undefined
  
  var slideSpeed: js.UndefOr[Double] = js.undefined
  
  var submenuToggle: js.UndefOr[Boolean] = js.undefined
  
  var submenuToggleText: js.UndefOr[String] = js.undefined
}
object IAccordionMenuOptions {
  
  inline def apply(): IAccordionMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionMenuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAccordionMenuOptions] (val x: Self) extends AnyVal {
    
    inline def setMultiOpen(value: Boolean): Self = StObject.set(x, "multiOpen", value.asInstanceOf[js.Any])
    
    inline def setMultiOpenUndefined: Self = StObject.set(x, "multiOpen", js.undefined)
    
    inline def setParentLink(value: Boolean): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setSlideSpeed(value: Double): Self = StObject.set(x, "slideSpeed", value.asInstanceOf[js.Any])
    
    inline def setSlideSpeedUndefined: Self = StObject.set(x, "slideSpeed", js.undefined)
    
    inline def setSubmenuToggle(value: Boolean): Self = StObject.set(x, "submenuToggle", value.asInstanceOf[js.Any])
    
    inline def setSubmenuToggleText(value: String): Self = StObject.set(x, "submenuToggleText", value.asInstanceOf[js.Any])
    
    inline def setSubmenuToggleTextUndefined: Self = StObject.set(x, "submenuToggleText", js.undefined)
    
    inline def setSubmenuToggleUndefined: Self = StObject.set(x, "submenuToggle", js.undefined)
  }
}
