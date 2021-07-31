package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccordionMenuOptions extends StObject {
  
  var multiOpen: js.UndefOr[Boolean] = js.undefined
  
  var slideSpeed: js.UndefOr[Double] = js.undefined
}
object IAccordionMenuOptions {
  
  @scala.inline
  def apply(): IAccordionMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionMenuOptions]
  }
  
  @scala.inline
  implicit class IAccordionMenuOptionsMutableBuilder[Self <: IAccordionMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiOpen(value: Boolean): Self = StObject.set(x, "multiOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiOpenUndefined: Self = StObject.set(x, "multiOpen", js.undefined)
    
    @scala.inline
    def setSlideSpeed(value: Double): Self = StObject.set(x, "slideSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideSpeedUndefined: Self = StObject.set(x, "slideSpeed", js.undefined)
  }
}
