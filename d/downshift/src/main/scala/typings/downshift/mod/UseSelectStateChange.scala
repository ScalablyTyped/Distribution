package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<downshift.downshift.UseSelectState<Item>> */
trait UseSelectStateChange[Item] extends StObject {
  
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  
  var inputValue: js.UndefOr[String] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var selectedItem: js.UndefOr[Item | Null] = js.undefined
  
  var `type`: UseSelectStateChangeTypes
}
object UseSelectStateChange {
  
  inline def apply[Item](`type`: UseSelectStateChangeTypes): UseSelectStateChange[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectStateChange[Item]]
  }
  
  extension [Self <: UseSelectStateChange[?], Item](x: Self & UseSelectStateChange[Item]) {
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setType(value: UseSelectStateChangeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
