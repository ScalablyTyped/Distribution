package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.ContextMenuItem
import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.HtmlEditorPredefinedContextMenuItem
import typings.devextreme.mod.DevExpress.ui.dxMenu.MenuBasePlainItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorTableContextMenuItem
  extends StObject
     with MenuBasePlainItem {
  
  /**
    * Configures nested context menu items.
    */
  var items: js.UndefOr[js.Array[ContextMenuItem | HtmlEditorPredefinedContextMenuItem]] = js.undefined
  
  /**
    * A name used to identify the context menu item.
    */
  var name: js.UndefOr[HtmlEditorPredefinedContextMenuItem] = js.undefined
}
object dxHtmlEditorTableContextMenuItem {
  
  inline def apply(): dxHtmlEditorTableContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorTableContextMenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxHtmlEditorTableContextMenuItem] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ContextMenuItem | HtmlEditorPredefinedContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (ContextMenuItem | HtmlEditorPredefinedContextMenuItem)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: HtmlEditorPredefinedContextMenuItem): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
