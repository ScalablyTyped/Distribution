package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<downshift.downshift.DownshiftState<Item>> */
trait StateChangeOptions[Item] extends StObject {
  
  var highlightedIndex: js.UndefOr[Double | Null] = js.undefined
  
  var inputValue: js.UndefOr[String | Null] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var selectedItem: js.UndefOr[Item | Null] = js.undefined
  
  var `type`: StateChangeTypes
}
object StateChangeOptions {
  
  @scala.inline
  def apply[Item](`type`: StateChangeTypes): StateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeOptions[Item]]
  }
  
  @scala.inline
  implicit class StateChangeOptionsMutableBuilder[Self <: StateChangeOptions[?], Item] (val x: Self & StateChangeOptions[Item]) extends AnyVal {
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedIndexNull: Self = StObject.set(x, "highlightedIndex", null)
    
    @scala.inline
    def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueNull: Self = StObject.set(x, "inputValue", null)
    
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
    def setType(value: StateChangeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
