package typings.googleCloudStorage.buildSrcFileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWriteStreamOptions
  extends StObject
     with CreateResumableUploadOptions {
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var gzip: js.UndefOr[String | Boolean] = js.undefined
  
  var resumable: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var validation: js.UndefOr[String | Boolean] = js.undefined
}
object CreateWriteStreamOptions {
  
  inline def apply(): CreateWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWriteStreamOptions]
  }
  
  extension [Self <: CreateWriteStreamOptions](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setGzip(value: String | Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    inline def setResumable(value: Boolean): Self = StObject.set(x, "resumable", value.asInstanceOf[js.Any])
    
    inline def setResumableUndefined: Self = StObject.set(x, "resumable", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setValidation(value: String | Boolean): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
