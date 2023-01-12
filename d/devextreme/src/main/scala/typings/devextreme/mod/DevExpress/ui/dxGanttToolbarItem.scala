package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxGantt.GanttPredefinedToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttToolbarItem
  extends StObject
     with dxToolbarItem {
  
  /**
    * Specifies the toolbar item&apos;s name.
    */
  var name: js.UndefOr[GanttPredefinedToolbarItem | String] = js.undefined
}
object dxGanttToolbarItem {
  
  inline def apply(): dxGanttToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttToolbarItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxGanttToolbarItem] (val x: Self) extends AnyVal {
    
    inline def setName(value: GanttPredefinedToolbarItem | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
