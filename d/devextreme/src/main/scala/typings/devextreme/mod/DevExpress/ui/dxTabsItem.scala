package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTabsItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies a badge text for the tab.
    */
  var badge: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the icon to be displayed on the tab.
    */
  var icon: js.UndefOr[String] = js.undefined
}
object dxTabsItem {
  
  inline def apply(): dxTabsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabsItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxTabsItem] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
