package typings.expressValidator.anon

import typings.expressValidator.expressValidatorStrings.grouped
import typings.expressValidator.srcBaseMod.AlternativeMessageFactory
import typings.expressValidator.srcBaseMod.ErrorMessage
import typings.expressValidator.srcBaseMod.FieldValidationError
import typings.expressValidator.srcMiddlewaresOneOfMod.OneOfErrorType
import typings.expressValidator.srcMiddlewaresOneOfMod.OneOfOptions
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorType
  extends StObject
     with OneOfOptions {
  
  var errorType: js.UndefOr[Exclude[OneOfErrorType, grouped]] = js.undefined
  
  /**
    * The error message to use in case none of the chains are valid.
    */
  var message: js.UndefOr[AlternativeMessageFactory | ErrorMessage] = js.undefined
}
object ErrorType {
  
  inline def apply(): ErrorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorType] (val x: Self) extends AnyVal {
    
    inline def setErrorType(value: Exclude[OneOfErrorType, grouped]): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setMessage(value: AlternativeMessageFactory | ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction2(value: (/* nestedErrors */ js.Array[FieldValidationError], /* opts */ Req) => Any): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMessageVarargs(value: Any*): Self = StObject.set(x, "message", js.Array(value*))
  }
}
