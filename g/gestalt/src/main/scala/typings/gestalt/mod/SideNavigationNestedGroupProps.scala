package typings.gestalt.mod

import typings.gestalt.anon.Number
import typings.gestalt.gestaltStrings.expandable
import typings.gestalt.gestaltStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationNestedGroupProps extends StObject {
  
  var children: Node
  
  var counter: js.UndefOr[Number] = js.undefined
  
  var display: js.UndefOr[expandable | static] = js.undefined
  
  var label: String
}
object SideNavigationNestedGroupProps {
  
  inline def apply(label: String): SideNavigationNestedGroupProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationNestedGroupProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SideNavigationNestedGroupProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCounter(value: Number): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDisplay(value: expandable | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
