package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMultipleSelectionDispatchAction[Item] extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var selectedItem: js.UndefOr[Item | Null] = js.native
  
  var selectedItems: js.UndefOr[js.Array[Item]] = js.native
  
  var `type`: UseMultipleSelectionStateChangeTypes = js.native
}
object UseMultipleSelectionDispatchAction {
  
  @scala.inline
  def apply[Item](`type`: UseMultipleSelectionStateChangeTypes): UseMultipleSelectionDispatchAction[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionDispatchAction[Item]]
  }
  
  @scala.inline
  implicit class UseMultipleSelectionDispatchActionMutableBuilder[Self <: UseMultipleSelectionDispatchAction[_], Item] (val x: Self with UseMultipleSelectionDispatchAction[Item]) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    @scala.inline
    def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setType(value: UseMultipleSelectionStateChangeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
