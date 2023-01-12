package typings.gestalt.mod

import typings.gestalt.anon.ActiveIndex
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentedControlProps extends StObject {
  
  var items: js.Array[ReactNode]
  
  def onChange(args: ActiveIndex): Unit
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var selectedItemIndex: Double
}
object SegmentedControlProps {
  
  inline def apply(items: js.Array[ReactNode], onChange: ActiveIndex => Unit, selectedItemIndex: Double): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentedControlProps] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ReactNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ReactNode*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnChange(value: ActiveIndex => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
  }
}
