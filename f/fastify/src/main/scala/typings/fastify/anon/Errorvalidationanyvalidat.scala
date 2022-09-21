package typings.fastify.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & {  validation :any,   validationContext :string} */
trait Errorvalidationanyvalidat extends StObject {
  
  /* standard es2022.error */
  var cause: js.UndefOr[Any] = js.undefined
  
  /* standard es5 */
  var message: String
  
  /* standard es5 */
  var name: String
  
  /* standard es5 */
  var stack: js.UndefOr[String] = js.undefined
  
  var validation: Any
  
  var validationContext: String
}
object Errorvalidationanyvalidat {
  
  inline def apply(message: String, name: String, validation: Any, validationContext: String): Errorvalidationanyvalidat = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], validationContext = validationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorvalidationanyvalidat]
  }
  
  extension [Self <: Errorvalidationanyvalidat](x: Self) {
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setValidation(value: Any): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationContext(value: String): Self = StObject.set(x, "validationContext", value.asInstanceOf[js.Any])
  }
}
