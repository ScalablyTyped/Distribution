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
  
  @scala.inline
  def apply(): IDropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownOptions]
  }
  
  @scala.inline
  implicit class IDropdownOptionsMutableBuilder[Self <: IDropdownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    @scala.inline
    def setHOffset(value: Double): Self = StObject.set(x, "hOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHOffsetUndefined: Self = StObject.set(x, "hOffset", js.undefined)
    
    @scala.inline
    def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
    
    @scala.inline
    def setHoverPane(value: Boolean): Self = StObject.set(x, "hoverPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverPaneUndefined: Self = StObject.set(x, "hoverPane", js.undefined)
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setPositionClass(value: String): Self = StObject.set(x, "positionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionClassUndefined: Self = StObject.set(x, "positionClass", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    
    @scala.inline
    def setVOffset(value: Double): Self = StObject.set(x, "vOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVOffsetUndefined: Self = StObject.set(x, "vOffset", js.undefined)
  }
}
