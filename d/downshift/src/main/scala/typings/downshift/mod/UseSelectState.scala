package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseSelectState[Item] extends StObject {
  
  var highlightedIndex: Double
  
  var inputValue: String
  
  var isOpen: Boolean
  
  var selectedItem: Item | Null
}
object UseSelectState {
  
  inline def apply[Item](highlightedIndex: Double, inputValue: String, isOpen: Boolean): UseSelectState[Item] = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectedItem = null)
    __obj.asInstanceOf[UseSelectState[Item]]
  }
  
  extension [Self <: UseSelectState[?], Item](x: Self & UseSelectState[Item]) {
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
  }
}
