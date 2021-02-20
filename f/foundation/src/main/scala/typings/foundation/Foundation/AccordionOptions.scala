package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/accordion.html#optional-javascript-configuration
@js.native
trait AccordionOptions extends StObject {
  
  var active_class: js.UndefOr[String] = js.native
  
  var callback: js.UndefOr[js.Function0[_]] = js.native
  
  var content_class: js.UndefOr[String] = js.native
  
  var multi_expand: js.UndefOr[Boolean] = js.native
  
  var toggleable: js.UndefOr[Boolean] = js.native
}
object AccordionOptions {
  
  @scala.inline
  def apply(): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionOptions]
  }
  
  @scala.inline
  implicit class AccordionOptionsMutableBuilder[Self <: AccordionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive_class(value: String): Self = StObject.set(x, "active_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive_classUndefined: Self = StObject.set(x, "active_class", js.undefined)
    
    @scala.inline
    def setCallback(value: () => _): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setContent_class(value: String): Self = StObject.set(x, "content_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_classUndefined: Self = StObject.set(x, "content_class", js.undefined)
    
    @scala.inline
    def setMulti_expand(value: Boolean): Self = StObject.set(x, "multi_expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulti_expandUndefined: Self = StObject.set(x, "multi_expand", js.undefined)
    
    @scala.inline
    def setToggleable(value: Boolean): Self = StObject.set(x, "toggleable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleableUndefined: Self = StObject.set(x, "toggleable", js.undefined)
  }
}
