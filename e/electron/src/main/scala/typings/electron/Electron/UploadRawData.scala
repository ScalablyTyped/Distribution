package typings.electron.Electron

import typings.node.bufferMod.global.Buffer
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
  var `type`: "rawData"
}
object UploadRawData {
  
  inline def apply(bytes: Buffer): UploadRawData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rawData")
    __obj.asInstanceOf[UploadRawData]
  }
  
  extension [Self <: UploadRawData](x: Self) {
    
    inline def setBytes(value: Buffer): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setType(value: "rawData"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
