package typings.devextreme.anon

import typings.devextreme.devextremeStrings.itemView
import typings.devextreme.devextremeStrings.navPane
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxFileManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemItem extends StObject {
  
  var component: js.UndefOr[dxFileManager] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var fileSystemItem: js.UndefOr[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem] = js.undefined
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
  
  var itemIndex: js.UndefOr[Double] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var viewArea: js.UndefOr[navPane | itemView] = js.undefined
}
object FileSystemItem {
  
  inline def apply(): FileSystemItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemItem]
  }
  
  extension [Self <: FileSystemItem](x: Self) {
    
    inline def setComponent(value: dxFileManager): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setFileSystemItem(value: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
    
    inline def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    inline def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setViewArea(value: navPane | itemView): Self = StObject.set(x, "viewArea", value.asInstanceOf[js.Any])
    
    inline def setViewAreaUndefined: Self = StObject.set(x, "viewArea", js.undefined)
  }
}
