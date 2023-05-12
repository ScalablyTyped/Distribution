package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.anon.ItemDropdownOption
import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownItemProps extends StObject {
  
  var badge: js.UndefOr[BadgeObject] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var dataTestId: js.UndefOr[String] = js.undefined
  
  var onSelect: AbstractEventHandler[FocusEvent[HTMLInputElement, Element], ItemDropdownOption]
  
  var option: DropdownOption
  
  var selected: js.UndefOr[DropdownOption | js.Array[DropdownOption]] = js.undefined
}
object DropdownItemProps {
  
  inline def apply(
    onSelect: /* arg */ ItemDropdownOption & (Event[FocusEvent[HTMLInputElement, Element]]) => Unit,
    option: DropdownOption
  ): DropdownItemProps = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect), option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownItemProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropdownItemProps] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: BadgeObject): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataTestId(value: String): Self = StObject.set(x, "dataTestId", value.asInstanceOf[js.Any])
    
    inline def setDataTestIdUndefined: Self = StObject.set(x, "dataTestId", js.undefined)
    
    inline def setOnSelect(value: /* arg */ ItemDropdownOption & (Event[FocusEvent[HTMLInputElement, Element]]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOption(value: DropdownOption): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: DropdownOption | js.Array[DropdownOption]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: DropdownOption*): Self = StObject.set(x, "selected", js.Array(value*))
  }
}
