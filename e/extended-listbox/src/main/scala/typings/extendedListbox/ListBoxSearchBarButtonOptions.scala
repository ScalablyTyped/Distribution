package typings.extendedListbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxSearchBarButtonOptions extends StObject {
  
  /** css class for the i-tag of the button */
  var icon: js.UndefOr[String] = js.undefined
  
  /** callback for button click */
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** determines if the button is visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ListBoxSearchBarButtonOptions {
  
  inline def apply(): ListBoxSearchBarButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxSearchBarButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBoxSearchBarButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
