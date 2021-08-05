package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiError extends StObject {
  
  var statusBody: js.Object
  
  var statusCode: Double
  
  var statusMessage: String
}
object ApiError {
  
  inline def apply(statusBody: js.Object, statusCode: Double, statusMessage: String): ApiError = {
    val __obj = js.Dynamic.literal(statusBody = statusBody.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
  
  extension [Self <: ApiError](x: Self) {
    
    inline def setStatusBody(value: js.Object): Self = StObject.set(x, "statusBody", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
