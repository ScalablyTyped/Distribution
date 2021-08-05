package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom static error page to be served when an error occurs.
  */
trait SchemaErrorHandler extends StObject {
  
  /**
    * Error condition this handler applies to.
    */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /**
    * MIME type of file. Defaults to text/html.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Static file content to be served for this error.
    */
  var staticFile: js.UndefOr[String] = js.undefined
}
object SchemaErrorHandler {
  
  inline def apply(): SchemaErrorHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorHandler]
  }
  
  extension [Self <: SchemaErrorHandler](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setStaticFile(value: String): Self = StObject.set(x, "staticFile", value.asInstanceOf[js.Any])
    
    inline def setStaticFileUndefined: Self = StObject.set(x, "staticFile", js.undefined)
  }
}
