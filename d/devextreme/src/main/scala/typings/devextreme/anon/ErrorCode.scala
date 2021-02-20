package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFileManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorCode extends StObject {
  
  var component: js.UndefOr[dxFileManager] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var errorCode: js.UndefOr[Double] = js.native
  
  var errorText: js.UndefOr[String] = js.native
  
  var fileSystemItem: js.UndefOr[typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object ErrorCode {
  
  @scala.inline
  def apply(): ErrorCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorCode]
  }
  
  @scala.inline
  implicit class ErrorCodeMutableBuilder[Self <: ErrorCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxFileManager): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    @scala.inline
    def setFileSystemItem(value: typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
