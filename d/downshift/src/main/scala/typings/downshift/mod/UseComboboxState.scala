package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseComboboxState[Item] extends StObject {
  
  var highlightedIndex: Double
  
  var inputValue: String
  
  var isOpen: Boolean
  
  var selectedItem: Item | Null
}
object UseComboboxState {
  
  @scala.inline
  def apply[Item](highlightedIndex: Double, inputValue: String, isOpen: Boolean): UseComboboxState[Item] = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectedItem = null)
    __obj.asInstanceOf[UseComboboxState[Item]]
  }
  
  @scala.inline
  implicit class UseComboboxStateMutableBuilder[Self <: UseComboboxState[?], Item] (val x: Self & UseComboboxState[Item]) extends AnyVal {
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
  }
}
