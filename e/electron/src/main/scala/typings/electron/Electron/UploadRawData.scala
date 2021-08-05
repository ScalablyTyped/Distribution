package typings.electron.Electron

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadRawData extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/upload-raw-data
  /**
    * Data to be uploaded.
    */
  var bytes: Buffer
  
  /**
    * `rawData`.
    */
  var `type`: String
}
object UploadRawData {
  
  inline def apply(bytes: Buffer, `type`: String): UploadRawData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRawData]
  }
  
  extension [Self <: UploadRawData](x: Self) {
    
    inline def setBytes(value: Buffer): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
