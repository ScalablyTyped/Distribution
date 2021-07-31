package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ValidationResult. */
trait IValidationResult extends StObject {
  
  /** ValidationResult validationErrors */
  var validationErrors: js.UndefOr[js.Array[IValidationError] | Null] = js.undefined
}
object IValidationResult {
  
  @scala.inline
  def apply(): IValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValidationResult]
  }
  
  @scala.inline
  implicit class IValidationResultMutableBuilder[Self <: IValidationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidationErrors(value: js.Array[IValidationError]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorsNull: Self = StObject.set(x, "validationErrors", null)
    
    @scala.inline
    def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    @scala.inline
    def setValidationErrorsVarargs(value: IValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
  }
}
