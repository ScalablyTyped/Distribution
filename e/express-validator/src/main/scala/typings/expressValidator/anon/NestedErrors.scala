package typings.expressValidator.anon

import typings.expressValidator.expressValidatorStrings.alternative
import typings.expressValidator.srcBaseMod.FieldValidationError
import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcContextMod.AddErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedErrors
  extends StObject
     with AddErrorOptions {
  
  var message: js.UndefOr[Any] = js.undefined
  
  var nestedErrors: js.Array[FieldValidationError]
  
  var req: Request
  
  var `type`: alternative
}
object NestedErrors {
  
  inline def apply(nestedErrors: js.Array[FieldValidationError], req: Request): NestedErrors = {
    val __obj = js.Dynamic.literal(nestedErrors = nestedErrors.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("alternative")
    __obj.asInstanceOf[NestedErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NestedErrors] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNestedErrors(value: js.Array[FieldValidationError]): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
    
    inline def setNestedErrorsVarargs(value: FieldValidationError*): Self = StObject.set(x, "nestedErrors", js.Array(value*))
    
    inline def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setType(value: alternative): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
