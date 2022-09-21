package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxGantt.GanttPredefinedToolbarItem
import typings.devextreme.mod.DevExpress.ui.dxGantt.ToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttToolbar extends StObject {
  
  /**
    * Configures toolbar items&apos; settings.
    */
  var items: js.UndefOr[js.Array[ToolbarItem | GanttPredefinedToolbarItem]] = js.undefined
}
object dxGanttToolbar {
  
  inline def apply(): dxGanttToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttToolbar]
  }
  
  extension [Self <: dxGanttToolbar](x: Self) {
    
    inline def setItems(value: js.Array[ToolbarItem | GanttPredefinedToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (ToolbarItem | GanttPredefinedToolbarItem)*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
