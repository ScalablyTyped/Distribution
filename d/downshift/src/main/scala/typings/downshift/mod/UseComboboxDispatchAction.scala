package typings.downshift.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseComboboxDispatchAction[Item] extends StObject {
  
  var getItemNodeFromIndex: js.UndefOr[js.Function1[/* index */ Double, HTMLElement]] = js.native
  
  var highlightedIndex: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var inputValue: js.UndefOr[String] = js.native
  
  var selectItem: js.UndefOr[Boolean] = js.native
  
  var selectedItem: js.UndefOr[Item | Null] = js.native
  
  var shiftKey: js.UndefOr[Boolean] = js.native
  
  var `type`: UseComboboxStateChangeTypes = js.native
}
object UseComboboxDispatchAction {
  
  @scala.inline
  def apply[Item](`type`: UseComboboxStateChangeTypes): UseComboboxDispatchAction[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxDispatchAction[Item]]
  }
  
  @scala.inline
  implicit class UseComboboxDispatchActionMutableBuilder[Self <: UseComboboxDispatchAction[_], Item] (val x: Self with UseComboboxDispatchAction[Item]) extends AnyVal {
    
    @scala.inline
    def setGetItemNodeFromIndex(value: /* index */ Double => HTMLElement): Self = StObject.set(x, "getItemNodeFromIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemNodeFromIndexUndefined: Self = StObject.set(x, "getItemNodeFromIndex", js.undefined)
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    @scala.inline
    def setSelectItem(value: Boolean): Self = StObject.set(x, "selectItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectItemUndefined: Self = StObject.set(x, "selectItem", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    @scala.inline
    def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    
    @scala.inline
    def setType(value: UseComboboxStateChangeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
