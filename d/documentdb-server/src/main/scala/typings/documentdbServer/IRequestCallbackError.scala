package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Will contain error information if an error occurs, undefined otherwise. */
trait IRequestCallbackError extends StObject {
  
  /** A string containing the error information. */
  var body: String
  
  /** The HTTP response code corresponding to the error. */
  var number: Double
}
object IRequestCallbackError {
  
  inline def apply(body: String, number: Double): IRequestCallbackError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestCallbackError]
  }
  
  extension [Self <: IRequestCallbackError](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
