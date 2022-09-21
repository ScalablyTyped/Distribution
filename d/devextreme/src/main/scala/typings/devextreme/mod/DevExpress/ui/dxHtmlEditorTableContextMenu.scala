package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.ContextMenuItem
import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.HtmlEditorPredefinedContextMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorTableContextMenu extends StObject {
  
  /**
    * Specifies whether to enable the table context menu.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures context menu items.
    */
  var items: js.UndefOr[js.Array[ContextMenuItem | HtmlEditorPredefinedContextMenuItem]] = js.undefined
}
object dxHtmlEditorTableContextMenu {
  
  inline def apply(): dxHtmlEditorTableContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorTableContextMenu]
  }
  
  extension [Self <: dxHtmlEditorTableContextMenu](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setItems(value: js.Array[ContextMenuItem | HtmlEditorPredefinedContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (ContextMenuItem | HtmlEditorPredefinedContextMenuItem)*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
