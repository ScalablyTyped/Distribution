package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxFileManager.FileManagerPredefinedToolbarItem
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerToolbarItem
  extends StObject
     with dxToolbarItem {
  
  /**
    * Specifies the icon to be displayed on the toolbar item.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the toolbar item&apos;s name.
    */
  var name: js.UndefOr[FileManagerPredefinedToolbarItem | String] = js.undefined
  
  /**
    * 
    */
  @JSName("template")
  var template_dxFileManagerToolbarItem: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
}
object dxFileManagerToolbarItem {
  
  inline def apply(): dxFileManagerToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerToolbarItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxFileManagerToolbarItem] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: FileManagerPredefinedToolbarItem | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction0(value: () => String | UserDefinedElement[Element]): Self = StObject.set(x, "template", js.Any.fromFunction0(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
