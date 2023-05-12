package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxAccordionItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies the icon to be displayed in the panel&apos;s title.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text displayed for the UI component item title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var titleTemplate: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
}
object dxAccordionItem {
  
  inline def apply(): dxAccordionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxAccordionItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxAccordionItem] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
    
    inline def setTitleTemplateFunction0(value: () => String | UserDefinedElement[Element]): Self = StObject.set(x, "titleTemplate", js.Any.fromFunction0(value))
    
    inline def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
