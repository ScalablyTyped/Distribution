package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/tabs.html
trait TabOptions extends StObject {
  
  var active_class: js.UndefOr[String] = js.undefined
  
  var callback: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var deep_linking: js.UndefOr[Boolean] = js.undefined
  
  var is_hover: js.UndefOr[Boolean] = js.undefined
  
  var scroll_to_content: js.UndefOr[Boolean] = js.undefined
}
object TabOptions {
  
  @scala.inline
  def apply(): TabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabOptions]
  }
  
  @scala.inline
  implicit class TabOptionsMutableBuilder[Self <: TabOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive_class(value: String): Self = StObject.set(x, "active_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive_classUndefined: Self = StObject.set(x, "active_class", js.undefined)
    
    @scala.inline
    def setCallback(value: () => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setDeep_linking(value: Boolean): Self = StObject.set(x, "deep_linking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeep_linkingUndefined: Self = StObject.set(x, "deep_linking", js.undefined)
    
    @scala.inline
    def setIs_hover(value: Boolean): Self = StObject.set(x, "is_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hoverUndefined: Self = StObject.set(x, "is_hover", js.undefined)
    
    @scala.inline
    def setScroll_to_content(value: Boolean): Self = StObject.set(x, "scroll_to_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll_to_contentUndefined: Self = StObject.set(x, "scroll_to_content", js.undefined)
  }
}
