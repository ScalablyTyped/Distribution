package typings.googleCloudStorage.fileMod

import typings.googleCloudStorage.googleCloudStorageBooleans.`false`
import typings.googleCloudStorage.googleCloudStorageBooleans.`true`
import typings.googleCloudStorage.googleCloudStorageStrings.crc32c
import typings.googleCloudStorage.googleCloudStorageStrings.md5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReadStreamOptions extends StObject {
  
  var decompress: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
  
  var validation: js.UndefOr[md5 | crc32c | `false` | `true`] = js.undefined
}
object CreateReadStreamOptions {
  
  inline def apply(): CreateReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReadStreamOptions]
  }
  
  extension [Self <: CreateReadStreamOptions](x: Self) {
    
    inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
    
    inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    
    inline def setValidation(value: md5 | crc32c | `false` | `true`): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
