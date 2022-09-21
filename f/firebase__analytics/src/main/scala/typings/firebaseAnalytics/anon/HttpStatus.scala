package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpStatus extends StObject {
  
  var httpStatus: Double
  
  var responseMessage: String
}
object HttpStatus {
  
  inline def apply(httpStatus: Double, responseMessage: String): HttpStatus = {
    val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any], responseMessage = responseMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatus]
  }
  
  extension [Self <: HttpStatus](x: Self) {
    
    inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    inline def setResponseMessage(value: String): Self = StObject.set(x, "responseMessage", value.asInstanceOf[js.Any])
  }
}
