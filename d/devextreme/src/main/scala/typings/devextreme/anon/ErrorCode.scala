package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFileManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCode extends StObject {
  
  var component: js.UndefOr[dxFileManager] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var errorCode: js.UndefOr[Double] = js.undefined
  
  var errorText: js.UndefOr[String] = js.undefined
  
  var fileSystemItem: js.UndefOr[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object ErrorCode {
  
  inline def apply(): ErrorCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorCode]
  }
  
  extension [Self <: ErrorCode](x: Self) {
    
    inline def setComponent(value: dxFileManager): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    inline def setFileSystemItem(value: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
