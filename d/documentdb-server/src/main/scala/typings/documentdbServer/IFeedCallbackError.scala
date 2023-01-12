package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Will contain error information if an error occurs, undefined otherwise. */
trait IFeedCallbackError extends StObject {
  
  /** A string containing the error information. */
  var body: String
  
  /** The HTTP response code corresponding to the error. */
  var number: Double
}
object IFeedCallbackError {
  
  inline def apply(body: String, number: Double): IFeedCallbackError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFeedCallbackError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFeedCallbackError] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
