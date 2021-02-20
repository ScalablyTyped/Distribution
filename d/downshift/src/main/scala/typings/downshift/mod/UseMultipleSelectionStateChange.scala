package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<downshift.downshift.UseMultipleSelectionState<Item>> */
@js.native
trait UseMultipleSelectionStateChange[Item] extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var selectedItems: js.UndefOr[js.Array[Item]] = js.native
  
  var `type`: UseMultipleSelectionStateChangeTypes = js.native
}
object UseMultipleSelectionStateChange {
  
  @scala.inline
  def apply[Item](`type`: UseMultipleSelectionStateChangeTypes): UseMultipleSelectionStateChange[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionStateChange[Item]]
  }
  
  @scala.inline
  implicit class UseMultipleSelectionStateChangeMutableBuilder[Self <: UseMultipleSelectionStateChange[_], Item] (val x: Self with UseMultipleSelectionStateChange[Item]) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
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
