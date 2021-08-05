package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccordionOptions extends StObject {
  
  var allowAllClosed: js.UndefOr[Boolean] = js.undefined
  
  var multiExpand: js.UndefOr[Boolean] = js.undefined
  
  var slideSpeed: js.UndefOr[Double] = js.undefined
}
object IAccordionOptions {
  
  inline def apply(): IAccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionOptions]
  }
  
  extension [Self <: IAccordionOptions](x: Self) {
    
    inline def setAllowAllClosed(value: Boolean): Self = StObject.set(x, "allowAllClosed", value.asInstanceOf[js.Any])
    
    inline def setAllowAllClosedUndefined: Self = StObject.set(x, "allowAllClosed", js.undefined)
    
    inline def setMultiExpand(value: Boolean): Self = StObject.set(x, "multiExpand", value.asInstanceOf[js.Any])
    
    inline def setMultiExpandUndefined: Self = StObject.set(x, "multiExpand", js.undefined)
    
    inline def setSlideSpeed(value: Double): Self = StObject.set(x, "slideSpeed", value.asInstanceOf[js.Any])
    
    inline def setSlideSpeedUndefined: Self = StObject.set(x, "slideSpeed", js.undefined)
  }
}
