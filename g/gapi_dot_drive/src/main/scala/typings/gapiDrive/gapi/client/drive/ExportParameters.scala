package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportParameters extends StObject {
  
  var fileId: String
  
  var mimeType: String
}
object ExportParameters {
  
  inline def apply(fileId: String, mimeType: String): ExportParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportParameters]
  }
  
  extension [Self <: ExportParameters](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
  }
}
