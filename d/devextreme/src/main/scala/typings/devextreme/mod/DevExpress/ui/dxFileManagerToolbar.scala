package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxFileManager.FileManagerPredefinedToolbarItem
import typings.devextreme.mod.DevExpress.ui.dxFileManager.ToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerToolbar extends StObject {
  
  /**
    * Configures settings of the toolbar items that are visible when users select files.
    */
  var fileSelectionItems: js.UndefOr[js.Array[ToolbarItem | FileManagerPredefinedToolbarItem]] = js.undefined
  
  /**
    * Configures toolbar items&apos; settings.
    */
  var items: js.UndefOr[js.Array[ToolbarItem | FileManagerPredefinedToolbarItem]] = js.undefined
}
object dxFileManagerToolbar {
  
  inline def apply(): dxFileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerToolbar]
  }
  
  extension [Self <: dxFileManagerToolbar](x: Self) {
    
    inline def setFileSelectionItems(value: js.Array[ToolbarItem | FileManagerPredefinedToolbarItem]): Self = StObject.set(x, "fileSelectionItems", value.asInstanceOf[js.Any])
    
    inline def setFileSelectionItemsUndefined: Self = StObject.set(x, "fileSelectionItems", js.undefined)
    
    inline def setFileSelectionItemsVarargs(value: (ToolbarItem | FileManagerPredefinedToolbarItem)*): Self = StObject.set(x, "fileSelectionItems", js.Array(value*))
    
    inline def setItems(value: js.Array[ToolbarItem | FileManagerPredefinedToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (ToolbarItem | FileManagerPredefinedToolbarItem)*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
