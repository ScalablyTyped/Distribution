package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownshiftState[Item] extends StObject {
  
  var highlightedIndex: Double | Null
  
  var inputValue: String | Null
  
  var isOpen: Boolean
  
  var selectedItem: Item | Null
}
object DownshiftState {
  
  inline def apply[Item](isOpen: Boolean): DownshiftState[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], highlightedIndex = null, inputValue = null, selectedItem = null)
    __obj.asInstanceOf[DownshiftState[Item]]
  }
  
  extension [Self <: DownshiftState[?], Item](x: Self & DownshiftState[Item]) {
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setHighlightedIndexNull: Self = StObject.set(x, "highlightedIndex", null)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueNull: Self = StObject.set(x, "inputValue", null)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
  }
}
