package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxMenu.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxMenuItem
  extends StObject
     with dxMenuBaseItem {
  
  /**
    * Specifies nested menu items.
    */
  @JSName("items")
  var items_dxMenuItem: js.UndefOr[js.Array[Item]] = js.undefined
}
object dxMenuItem {
  
  inline def apply(): dxMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxMenuItem] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
