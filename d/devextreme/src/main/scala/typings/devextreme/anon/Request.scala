package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.fileManagement.UploadInfo
import typings.devextreme.mod.DevExpress.ui.dxFileUploader
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var component: js.UndefOr[dxFileUploader] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var file: js.UndefOr[typings.std.File] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var request: js.UndefOr[XMLHttpRequest] = js.undefined
  
  var uploadInfo: js.UndefOr[UploadInfo] = js.undefined
}
object Request {
  
  inline def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setComponent(value: dxFileUploader): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setFile(value: typings.std.File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setUploadInfo(value: UploadInfo): Self = StObject.set(x, "uploadInfo", value.asInstanceOf[js.Any])
    
    inline def setUploadInfoUndefined: Self = StObject.set(x, "uploadInfo", js.undefined)
  }
}
