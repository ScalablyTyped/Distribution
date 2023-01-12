package typings.gestalt.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownSectionProps extends StObject {
  
  var children: ReactElement | js.Array[ReactElement]
  
  var label: String
}
object DropdownSectionProps {
  
  inline def apply(children: ReactElement | js.Array[ReactElement], label: String): DropdownSectionProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownSectionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropdownSectionProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
