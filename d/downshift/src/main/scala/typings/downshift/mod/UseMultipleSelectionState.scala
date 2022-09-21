package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMultipleSelectionState[Item] extends StObject {
  
  var activeIndex: Double
  
  var selectedItems: js.Array[Item]
}
object UseMultipleSelectionState {
  
  inline def apply[Item](activeIndex: Double, selectedItems: js.Array[Item]): UseMultipleSelectionState[Item] = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionState[Item]]
  }
  
  extension [Self <: UseMultipleSelectionState[?], Item](x: Self & UseMultipleSelectionState[Item]) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
