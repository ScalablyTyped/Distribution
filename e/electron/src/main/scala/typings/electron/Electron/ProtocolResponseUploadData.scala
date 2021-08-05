package typings.electron.Electron

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolResponseUploadData extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/protocol-response-upload-data
  /**
    * MIME type of the content.
    */
  var contentType: String
  
  /**
    * Content to be sent.
    */
  var data: String | Buffer
}
object ProtocolResponseUploadData {
  
  inline def apply(contentType: String, data: String | Buffer): ProtocolResponseUploadData = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolResponseUploadData]
  }
  
  extension [Self <: ProtocolResponseUploadData](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
