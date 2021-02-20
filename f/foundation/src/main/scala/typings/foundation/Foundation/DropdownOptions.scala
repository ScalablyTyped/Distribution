package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/dropdown.html#optional-javascript-configuration
@js.native
trait DropdownOptions extends StObject {
  
  var active_class: js.UndefOr[String] = js.native
  
  var align: js.UndefOr[String] = js.native
  
  var closed: js.UndefOr[js.Function0[_]] = js.native
  
  var disabled_class: js.UndefOr[String] = js.native
  
  var hover_timeout: js.UndefOr[Double] = js.native
  
  var is_hover: js.UndefOr[Boolean] = js.native
  
  var mega_class: js.UndefOr[String] = js.native
  
  var opened: js.UndefOr[js.Function0[_]] = js.native
}
object DropdownOptions {
  
  @scala.inline
  def apply(): DropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownOptions]
  }
  
  @scala.inline
  implicit class DropdownOptionsMutableBuilder[Self <: DropdownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive_class(value: String): Self = StObject.set(x, "active_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive_classUndefined: Self = StObject.set(x, "active_class", js.undefined)
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setClosed(value: () => _): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setDisabled_class(value: String): Self = StObject.set(x, "disabled_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled_classUndefined: Self = StObject.set(x, "disabled_class", js.undefined)
    
    @scala.inline
    def setHover_timeout(value: Double): Self = StObject.set(x, "hover_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHover_timeoutUndefined: Self = StObject.set(x, "hover_timeout", js.undefined)
    
    @scala.inline
    def setIs_hover(value: Boolean): Self = StObject.set(x, "is_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hoverUndefined: Self = StObject.set(x, "is_hover", js.undefined)
    
    @scala.inline
    def setMega_class(value: String): Self = StObject.set(x, "mega_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMega_classUndefined: Self = StObject.set(x, "mega_class", js.undefined)
    
    @scala.inline
    def setOpened(value: () => _): Self = StObject.set(x, "opened", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
  }
}
