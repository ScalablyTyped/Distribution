package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFileManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemItemElement extends StObject {
  
  var component: js.UndefOr[dxFileManager] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var item: js.UndefOr[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object ItemItemElement {
  
  inline def apply(): ItemItemElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemItemElement]
  }
  
  extension [Self <: ItemItemElement](x: Self) {
    
    inline def setComponent(value: dxFileManager): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setItem(value: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
