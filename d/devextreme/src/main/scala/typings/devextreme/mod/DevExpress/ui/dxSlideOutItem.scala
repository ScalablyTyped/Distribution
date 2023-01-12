package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSlideOutItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies a template that should be used to render a menu item.
    */
  var menuTemplate: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
}
object dxSlideOutItem {
  
  inline def apply(): dxSlideOutItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxSlideOutItem] (val x: Self) extends AnyVal {
    
    inline def setMenuTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "menuTemplate", value.asInstanceOf[js.Any])
    
    inline def setMenuTemplateFunction0(value: () => String | UserDefinedElement[Element]): Self = StObject.set(x, "menuTemplate", js.Any.fromFunction0(value))
    
    inline def setMenuTemplateUndefined: Self = StObject.set(x, "menuTemplate", js.undefined)
  }
}
