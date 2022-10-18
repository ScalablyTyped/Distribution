package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ValidationResult. */
trait IValidationResult extends StObject {
  
  /** ValidationResult validationErrors */
  var validationErrors: js.UndefOr[js.Array[IValidationError] | Null] = js.undefined
}
object IValidationResult {
  
  inline def apply(): IValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValidationResult]
  }
  
  extension [Self <: IValidationResult](x: Self) {
    
    inline def setValidationErrors(value: js.Array[IValidationError]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsNull: Self = StObject.set(x, "validationErrors", null)
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: IValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value*))
  }
}
