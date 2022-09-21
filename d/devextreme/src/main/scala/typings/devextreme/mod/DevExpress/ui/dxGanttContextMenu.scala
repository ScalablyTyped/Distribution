package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxGantt.ContextMenuItem
import typings.devextreme.mod.DevExpress.ui.dxGantt.GanttPredefinedContextMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttContextMenu extends StObject {
  
  /**
    * Specifies whether the context menu is enabled in the UI component.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures context menu item settings.
    */
  var items: js.UndefOr[js.Array[ContextMenuItem | GanttPredefinedContextMenuItem]] = js.undefined
}
object dxGanttContextMenu {
  
  inline def apply(): dxGanttContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttContextMenu]
  }
  
  extension [Self <: dxGanttContextMenu](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setItems(value: js.Array[ContextMenuItem | GanttPredefinedContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (ContextMenuItem | GanttPredefinedContextMenuItem)*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
