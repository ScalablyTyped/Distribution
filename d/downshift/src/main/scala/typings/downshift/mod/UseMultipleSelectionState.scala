package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMultipleSelectionState[Item] extends StObject {
  
  var activeIndex: Double
  
  var selectedItems: js.Array[Item]
}
object UseMultipleSelectionState {
  
  @scala.inline
  def apply[Item](activeIndex: Double, selectedItems: js.Array[Item]): UseMultipleSelectionState[Item] = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionState[Item]]
  }
  
  @scala.inline
  implicit class UseMultipleSelectionStateMutableBuilder[Self <: UseMultipleSelectionState[?], Item] (val x: Self & UseMultipleSelectionState[Item]) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
  }
}
