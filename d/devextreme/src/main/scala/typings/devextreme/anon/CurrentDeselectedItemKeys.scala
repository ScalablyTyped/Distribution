package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFileManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentDeselectedItemKeys extends StObject {
  
  var component: js.UndefOr[dxFileManager] = js.undefined
  
  var currentDeselectedItemKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var currentSelectedItemKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var selectedItemKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var selectedItems: js.UndefOr[js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]] = js.undefined
}
object CurrentDeselectedItemKeys {
  
  inline def apply(): CurrentDeselectedItemKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentDeselectedItemKeys]
  }
  
  extension [Self <: CurrentDeselectedItemKeys](x: Self) {
    
    inline def setComponent(value: dxFileManager): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setCurrentDeselectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "currentDeselectedItemKeys", value.asInstanceOf[js.Any])
    
    inline def setCurrentDeselectedItemKeysUndefined: Self = StObject.set(x, "currentDeselectedItemKeys", js.undefined)
    
    inline def setCurrentDeselectedItemKeysVarargs(value: String*): Self = StObject.set(x, "currentDeselectedItemKeys", js.Array(value :_*))
    
    inline def setCurrentSelectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "currentSelectedItemKeys", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelectedItemKeysUndefined: Self = StObject.set(x, "currentSelectedItemKeys", js.undefined)
    
    inline def setCurrentSelectedItemKeysVarargs(value: String*): Self = StObject.set(x, "currentSelectedItemKeys", js.Array(value :_*))
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSelectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "selectedItemKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeysUndefined: Self = StObject.set(x, "selectedItemKeys", js.undefined)
    
    inline def setSelectedItemKeysVarargs(value: String*): Self = StObject.set(x, "selectedItemKeys", js.Array(value :_*))
    
    inline def setSelectedItems(value: js.Array[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
  }
}
