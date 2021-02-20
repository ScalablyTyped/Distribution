package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWriteStreamOptions extends CreateResumableUploadOptions {
  
  var contentType: js.UndefOr[String] = js.native
  
  var gzip: js.UndefOr[String | Boolean] = js.native
  
  var resumable: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var validation: js.UndefOr[String | Boolean] = js.native
}
object CreateWriteStreamOptions {
  
  @scala.inline
  def apply(): CreateWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWriteStreamOptions]
  }
  
  @scala.inline
  implicit class CreateWriteStreamOptionsMutableBuilder[Self <: CreateWriteStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setGzip(value: String | Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    @scala.inline
    def setResumable(value: Boolean): Self = StObject.set(x, "resumable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumableUndefined: Self = StObject.set(x, "resumable", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setValidation(value: String | Boolean): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
