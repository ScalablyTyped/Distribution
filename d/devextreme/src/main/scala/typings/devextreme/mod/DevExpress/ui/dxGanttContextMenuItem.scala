package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxGantt.GanttPredefinedContextMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttContextMenuItem
  extends StObject
     with dxContextMenuItem {
  
  /**
    * Specifies the context menu item name.
    */
  var name: js.UndefOr[GanttPredefinedContextMenuItem | String] = js.undefined
}
object dxGanttContextMenuItem {
  
  inline def apply(): dxGanttContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttContextMenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxGanttContextMenuItem] (val x: Self) extends AnyVal {
    
    inline def setName(value: GanttPredefinedContextMenuItem | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
