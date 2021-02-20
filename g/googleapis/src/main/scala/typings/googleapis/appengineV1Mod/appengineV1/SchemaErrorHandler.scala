package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom static error page to be served when an error occurs.
  */
@js.native
trait SchemaErrorHandler extends StObject {
  
  /**
    * Error condition this handler applies to.
    */
  var errorCode: js.UndefOr[String] = js.native
  
  /**
    * MIME type of file. Defaults to text/html.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Static file content to be served for this error.
    */
  var staticFile: js.UndefOr[String] = js.native
}
object SchemaErrorHandler {
  
  @scala.inline
  def apply(): SchemaErrorHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorHandler]
  }
  
  @scala.inline
  implicit class SchemaErrorHandlerMutableBuilder[Self <: SchemaErrorHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setStaticFile(value: String): Self = StObject.set(x, "staticFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticFileUndefined: Self = StObject.set(x, "staticFile", js.undefined)
  }
}
