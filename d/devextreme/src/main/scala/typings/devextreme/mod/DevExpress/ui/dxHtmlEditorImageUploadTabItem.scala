package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.HtmlEditorImageUploadTab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorImageUploadTabItem extends StObject {
  
  /**
    * 
    */
  var name: js.UndefOr[HtmlEditorImageUploadTab] = js.undefined
}
object dxHtmlEditorImageUploadTabItem {
  
  inline def apply(): dxHtmlEditorImageUploadTabItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorImageUploadTabItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxHtmlEditorImageUploadTabItem] (val x: Self) extends AnyVal {
    
    inline def setName(value: HtmlEditorImageUploadTab): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
