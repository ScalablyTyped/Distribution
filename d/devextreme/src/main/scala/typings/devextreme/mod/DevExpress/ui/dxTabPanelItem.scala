package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTabPanelItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies a badge text for the tab.
    */
  var badge: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the icon to be displayed in the tab&apos;s title.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a template that should be used to render the tab for this item only.
    */
  var tabTemplate: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
  
  /**
    * Specifies the item title text displayed on a corresponding tab.
    */
  var title: js.UndefOr[String] = js.undefined
}
object dxTabPanelItem {
  
  inline def apply(): dxTabPanelItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabPanelItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxTabPanelItem] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setTabTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "tabTemplate", value.asInstanceOf[js.Any])
    
    inline def setTabTemplateFunction0(value: () => String | UserDefinedElement[Element]): Self = StObject.set(x, "tabTemplate", js.Any.fromFunction0(value))
    
    inline def setTabTemplateUndefined: Self = StObject.set(x, "tabTemplate", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
