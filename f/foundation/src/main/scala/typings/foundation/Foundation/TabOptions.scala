package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/tabs.html
trait TabOptions extends StObject {
  
  var active_class: js.UndefOr[String] = js.undefined
  
  var callback: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var deep_linking: js.UndefOr[Boolean] = js.undefined
  
  var is_hover: js.UndefOr[Boolean] = js.undefined
  
  var scroll_to_content: js.UndefOr[Boolean] = js.undefined
}
object TabOptions {
  
  inline def apply(): TabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabOptions] (val x: Self) extends AnyVal {
    
    inline def setActive_class(value: String): Self = StObject.set(x, "active_class", value.asInstanceOf[js.Any])
    
    inline def setActive_classUndefined: Self = StObject.set(x, "active_class", js.undefined)
    
    inline def setCallback(value: () => Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDeep_linking(value: Boolean): Self = StObject.set(x, "deep_linking", value.asInstanceOf[js.Any])
    
    inline def setDeep_linkingUndefined: Self = StObject.set(x, "deep_linking", js.undefined)
    
    inline def setIs_hover(value: Boolean): Self = StObject.set(x, "is_hover", value.asInstanceOf[js.Any])
    
    inline def setIs_hoverUndefined: Self = StObject.set(x, "is_hover", js.undefined)
    
    inline def setScroll_to_content(value: Boolean): Self = StObject.set(x, "scroll_to_content", value.asInstanceOf[js.Any])
    
    inline def setScroll_to_contentUndefined: Self = StObject.set(x, "scroll_to_content", js.undefined)
  }
}
