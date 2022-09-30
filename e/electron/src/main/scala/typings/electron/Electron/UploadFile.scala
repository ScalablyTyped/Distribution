package typings.electron.Electron

import typings.electron.electronStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFile extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/upload-file
  /**
    * Path of file to be uploaded.
    */
  var filePath: String
  
  /**
    * Number of bytes to read from `offset`. Defaults to `0`.
    */
  var length: Double
  
  /**
    * Last Modification time in number of seconds since the UNIX epoch.
    */
  var modificationTime: Double
  
  /**
    * Defaults to `0`.
    */
  var offset: Double
  
  /**
    * `file`.
    */
  var `type`: file
}
object UploadFile {
  
  inline def apply(filePath: String, length: Double, modificationTime: Double, offset: Double): UploadFile = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("file")
    __obj.asInstanceOf[UploadFile]
  }
  
  extension [Self <: UploadFile](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setModificationTime(value: Double): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
