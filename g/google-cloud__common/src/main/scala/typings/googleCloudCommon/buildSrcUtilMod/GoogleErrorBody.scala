package typings.googleCloudCommon.buildSrcUtilMod

import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleErrorBody extends StObject {
  
  var code: Double
  
  var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var response: Response[Any]
}
object GoogleErrorBody {
  
  inline def apply(code: Double, response: Response[Any]): GoogleErrorBody = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleErrorBody]
  }
  
  extension [Self <: GoogleErrorBody](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[GoogleInnerError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GoogleInnerError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResponse(value: Response[Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
