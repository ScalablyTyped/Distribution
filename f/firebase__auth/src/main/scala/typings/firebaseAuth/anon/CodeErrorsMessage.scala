package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeErrorsMessage extends StObject {
  
  var code: Double
  
  var errors: js.UndefOr[js.Array[DomainMessageReason]] = js.undefined
  
  var message: String
}
object CodeErrorsMessage {
  
  inline def apply(code: Double, message: String): CodeErrorsMessage = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeErrorsMessage]
  }
  
  extension [Self <: CodeErrorsMessage](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[DomainMessageReason]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: DomainMessageReason*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
