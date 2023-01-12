package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/accordion.html#optional-javascript-configuration
trait AccordionOptions extends StObject {
  
  var active_class: js.UndefOr[String] = js.undefined
  
  var callback: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var content_class: js.UndefOr[String] = js.undefined
  
  var multi_expand: js.UndefOr[Boolean] = js.undefined
  
  var toggleable: js.UndefOr[Boolean] = js.undefined
}
object AccordionOptions {
  
  inline def apply(): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccordionOptions] (val x: Self) extends AnyVal {
    
    inline def setActive_class(value: String): Self = StObject.set(x, "active_class", value.asInstanceOf[js.Any])
    
    inline def setActive_classUndefined: Self = StObject.set(x, "active_class", js.undefined)
    
    inline def setCallback(value: () => Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setContent_class(value: String): Self = StObject.set(x, "content_class", value.asInstanceOf[js.Any])
    
    inline def setContent_classUndefined: Self = StObject.set(x, "content_class", js.undefined)
    
    inline def setMulti_expand(value: Boolean): Self = StObject.set(x, "multi_expand", value.asInstanceOf[js.Any])
    
    inline def setMulti_expandUndefined: Self = StObject.set(x, "multi_expand", js.undefined)
    
    inline def setToggleable(value: Boolean): Self = StObject.set(x, "toggleable", value.asInstanceOf[js.Any])
    
    inline def setToggleableUndefined: Self = StObject.set(x, "toggleable", js.undefined)
  }
}
