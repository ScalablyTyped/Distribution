package typings.expoFileSystem.buildFileSystemDottypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadOptionsMultipart extends StObject {
  
  /**
    * The name of the field which will hold uploaded file. Defaults to the file name without an extension.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
    * The MIME type of the provided file. If not provided, the module will try to guess it based on the extension.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Additional form properties. They will be located in the request body.
    */
  var parameters: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Upload type determines how the file will be sent to the server.
    * Value will be `FileSystemUploadType.MULTIPART`.
    */
  var uploadType: FileSystemUploadType
}
object UploadOptionsMultipart {
  
  inline def apply(uploadType: FileSystemUploadType): UploadOptionsMultipart = {
    val __obj = js.Dynamic.literal(uploadType = uploadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptionsMultipart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadOptionsMultipart] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setUploadType(value: FileSystemUploadType): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
  }
}
