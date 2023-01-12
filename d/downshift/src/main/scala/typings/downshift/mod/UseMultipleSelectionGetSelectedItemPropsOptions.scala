package typings.downshift.mod

import typings.react.mod.HTMLProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMultipleSelectionGetSelectedItemPropsOptions[Item]
  extends StObject
     with HTMLProps[HTMLElement]
     with GetPropsWithRefKey {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var selectedItem: Item
}
object UseMultipleSelectionGetSelectedItemPropsOptions {
  
  inline def apply[Item](selectedItem: Item): UseMultipleSelectionGetSelectedItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal(selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionGetSelectedItemPropsOptions[Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseMultipleSelectionGetSelectedItemPropsOptions[?], Item] (val x: Self & UseMultipleSelectionGetSelectedItemPropsOptions[Item]) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
  }
}
