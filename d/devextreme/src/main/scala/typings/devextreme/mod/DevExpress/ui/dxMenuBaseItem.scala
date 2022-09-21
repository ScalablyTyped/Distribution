package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxMenu.MenuBasePlainItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxMenuBaseItem
  extends StObject
     with MenuBasePlainItem {
  
  /**
    * Specifies nested menu items.
    */
  var items: js.UndefOr[js.Array[dxMenuBaseItem]] = js.undefined
}
object dxMenuBaseItem {
  
  inline def apply(): dxMenuBaseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMenuBaseItem]
  }
  
  extension [Self <: dxMenuBaseItem](x: Self) {
    
    inline def setItems(value: js.Array[dxMenuBaseItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: dxMenuBaseItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
