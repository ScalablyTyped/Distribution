package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An API Error returned by the Instant Games SDK
  */
trait APIError extends StObject {
  
  /**
    * The relevant error code
    */
  var code: ErrorCodeType
  
  /**
    * A message describing the error
    */
  var message: String
}
object APIError {
  
  inline def apply(code: ErrorCodeType, message: String): APIError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: APIError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: ErrorCodeType): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
