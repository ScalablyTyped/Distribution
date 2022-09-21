package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaErrorHandler extends StObject {
  
  /**
    * Error condition this handler applies to.
    */
  var errorCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * MIME type of file. Defaults to text/html.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Static file content to be served for this error.
    */
  var staticFile: js.UndefOr[String | Null] = js.undefined
}
object SchemaErrorHandler {
  
  inline def apply(): SchemaErrorHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorHandler]
  }
  
  extension [Self <: SchemaErrorHandler](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setStaticFile(value: String): Self = StObject.set(x, "staticFile", value.asInstanceOf[js.Any])
    
    inline def setStaticFileNull: Self = StObject.set(x, "staticFile", null)
    
    inline def setStaticFileUndefined: Self = StObject.set(x, "staticFile", js.undefined)
  }
}
