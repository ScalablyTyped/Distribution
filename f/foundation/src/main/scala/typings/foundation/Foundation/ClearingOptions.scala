package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/clearing.html#optional-javascript-configuration
trait ClearingOptions extends StObject {
  
  var close_selectors: js.UndefOr[String] = js.undefined
  
  var init: js.UndefOr[Boolean] = js.undefined
  
  var locked: js.UndefOr[Boolean] = js.undefined
  
  var open_selectors: js.UndefOr[String] = js.undefined
  
  var skip_selector: js.UndefOr[String] = js.undefined
  
  var templates: js.UndefOr[js.Object] = js.undefined
  
  var touch_label: js.UndefOr[String] = js.undefined
}
object ClearingOptions {
  
  @scala.inline
  def apply(): ClearingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearingOptions]
  }
  
  @scala.inline
  implicit class ClearingOptionsMutableBuilder[Self <: ClearingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose_selectors(value: String): Self = StObject.set(x, "close_selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose_selectorsUndefined: Self = StObject.set(x, "close_selectors", js.undefined)
    
    @scala.inline
    def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setOpen_selectors(value: String): Self = StObject.set(x, "open_selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_selectorsUndefined: Self = StObject.set(x, "open_selectors", js.undefined)
    
    @scala.inline
    def setSkip_selector(value: String): Self = StObject.set(x, "skip_selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip_selectorUndefined: Self = StObject.set(x, "skip_selector", js.undefined)
    
    @scala.inline
    def setTemplates(value: js.Object): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTouch_label(value: String): Self = StObject.set(x, "touch_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch_labelUndefined: Self = StObject.set(x, "touch_label", js.undefined)
  }
}
