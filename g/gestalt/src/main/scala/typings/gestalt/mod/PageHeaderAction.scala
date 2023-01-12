package typings.gestalt.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHeaderAction extends StObject {
  
  var component: js.UndefOr[ReactElement] = js.undefined
  
  var dropdownItems: js.UndefOr[js.Array[ReactElement]] = js.undefined
}
object PageHeaderAction {
  
  inline def apply(): PageHeaderAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHeaderAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageHeaderAction] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDropdownItems(value: js.Array[ReactElement]): Self = StObject.set(x, "dropdownItems", value.asInstanceOf[js.Any])
    
    inline def setDropdownItemsUndefined: Self = StObject.set(x, "dropdownItems", js.undefined)
    
    inline def setDropdownItemsVarargs(value: ReactElement*): Self = StObject.set(x, "dropdownItems", js.Array(value*))
  }
}
