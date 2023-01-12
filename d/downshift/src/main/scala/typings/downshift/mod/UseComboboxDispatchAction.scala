package typings.downshift.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseComboboxDispatchAction[Item] extends StObject {
  
  var altKey: js.UndefOr[Boolean] = js.undefined
  
  var getItemNodeFromIndex: js.UndefOr[js.Function1[/* index */ Double, HTMLElement]] = js.undefined
  
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var inputValue: js.UndefOr[String] = js.undefined
  
  var selectItem: js.UndefOr[Boolean] = js.undefined
  
  var selectedItem: js.UndefOr[Item | Null] = js.undefined
  
  var `type`: UseComboboxStateChangeTypes
}
object UseComboboxDispatchAction {
  
  inline def apply[Item](`type`: UseComboboxStateChangeTypes): UseComboboxDispatchAction[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxDispatchAction[Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseComboboxDispatchAction[?], Item] (val x: Self & UseComboboxDispatchAction[Item]) extends AnyVal {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    inline def setGetItemNodeFromIndex(value: /* index */ Double => HTMLElement): Self = StObject.set(x, "getItemNodeFromIndex", js.Any.fromFunction1(value))
    
    inline def setGetItemNodeFromIndexUndefined: Self = StObject.set(x, "getItemNodeFromIndex", js.undefined)
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setSelectItem(value: Boolean): Self = StObject.set(x, "selectItem", value.asInstanceOf[js.Any])
    
    inline def setSelectItemUndefined: Self = StObject.set(x, "selectItem", js.undefined)
    
    inline def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setType(value: UseComboboxStateChangeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
