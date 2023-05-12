package typings.expressValidator.anon

import typings.expressValidator.expressValidatorStrings.grouped
import typings.expressValidator.srcBaseMod.ErrorMessage
import typings.expressValidator.srcBaseMod.FieldValidationError
import typings.expressValidator.srcBaseMod.GroupedAlternativeMessageFactory
import typings.expressValidator.srcMiddlewaresOneOfMod.OneOfOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorTypeMessage
  extends StObject
     with OneOfOptions {
  
  var errorType: js.UndefOr[grouped] = js.undefined
  
  /**
    * The error message to use in case none of the chain groups are valid.
    */
  var message: js.UndefOr[GroupedAlternativeMessageFactory | ErrorMessage] = js.undefined
}
object ErrorTypeMessage {
  
  inline def apply(): ErrorTypeMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorTypeMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorTypeMessage] (val x: Self) extends AnyVal {
    
    inline def setErrorType(value: grouped): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setMessage(value: GroupedAlternativeMessageFactory | ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction2(value: (/* nestedErrors */ js.Array[js.Array[FieldValidationError]], /* opts */ Req) => Any): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMessageVarargs(value: Any*): Self = StObject.set(x, "message", js.Array(value*))
  }
}
