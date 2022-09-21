package typings.devextreme.mod.DevExpress.ui

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
}
object dxAccordionItem {
  
  inline def apply(): dxAccordionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxAccordionItem]
  }
  
  extension [Self <: dxAccordionItem](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
