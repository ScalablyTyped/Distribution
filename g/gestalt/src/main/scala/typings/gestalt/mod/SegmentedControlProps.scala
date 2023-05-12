package typings.gestalt.mod

import typings.gestalt.anon.ActiveIndex
import typings.gestalt.anon.Event
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentedControlProps extends StObject {
  
  var items: js.Array[Node]
  
  var onChange: AbstractEventHandler[MouseEvent[HTMLButtonElement, NativeMouseEvent], ActiveIndex]
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var selectedItemIndex: Double
}
object SegmentedControlProps {
  
  inline def apply(
    items: js.Array[Node],
    onChange: /* arg */ ActiveIndex & (Event[MouseEvent[HTMLButtonElement, NativeMouseEvent]]) => Unit,
    selectedItemIndex: Double
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentedControlProps] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Node]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Node*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnChange(value: /* arg */ ActiveIndex & (Event[MouseEvent[HTMLButtonElement, NativeMouseEvent]]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
  }
}
