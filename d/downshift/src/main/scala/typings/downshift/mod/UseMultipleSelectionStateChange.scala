package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<downshift.downshift.UseMultipleSelectionState<Item>> */
trait UseMultipleSelectionStateChange[Item] extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  var selectedItems: js.UndefOr[js.Array[Item]] = js.undefined
  
  var `type`: UseMultipleSelectionStateChangeTypes
}
object UseMultipleSelectionStateChange {
  
  inline def apply[Item](`type`: UseMultipleSelectionStateChangeTypes): UseMultipleSelectionStateChange[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionStateChange[Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseMultipleSelectionStateChange[?], Item] (val x: Self & UseMultipleSelectionStateChange[Item]) extends AnyVal {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setType(value: UseMultipleSelectionStateChangeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
