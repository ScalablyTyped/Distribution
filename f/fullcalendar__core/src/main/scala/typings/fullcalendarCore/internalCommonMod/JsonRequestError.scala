package typings.fullcalendarCore.internalCommonMod

import typings.std.Error
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonRequestError
  extends StObject
     with Error {
  
  var response: Response
}
object JsonRequestError {
  
  inline def apply(message: String, name: String, response: Response): JsonRequestError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonRequestError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonRequestError] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
