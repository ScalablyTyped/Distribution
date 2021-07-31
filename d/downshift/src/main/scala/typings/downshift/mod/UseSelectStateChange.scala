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
  
  @scala.inline
  def apply[Item](`type`: UseSelectStateChangeTypes): UseSelectStateChange[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectStateChange[Item]]
  }
  
  @scala.inline
  implicit class UseSelectStateChangeMutableBuilder[Self <: UseSelectStateChange[?], Item] (val x: Self & UseSelectStateChange[Item]) extends AnyVal {
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    @scala.inline
    def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    @scala.inline
    def setType(value: UseSelectStateChangeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
