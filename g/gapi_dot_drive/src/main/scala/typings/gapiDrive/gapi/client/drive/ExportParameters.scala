package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportParameters extends StObject {
  
  var fileId: String = js.native
  
  var mimeType: String = js.native
}
object ExportParameters {
  
  @scala.inline
  def apply(fileId: String, mimeType: String): ExportParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportParameters]
  }
  
  @scala.inline
  implicit class ExportParametersMutableBuilder[Self <: ExportParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
  }
}
