package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.ValidationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxValidatorResult extends StObject {
  
  /**
    * A rule that failed to pass the check. Contains the first item from the brokenRules array.
    */
  var brokenRule: js.UndefOr[typings.devextreme.mod.DevExpress.common.ValidationRule] = js.undefined
  
  /**
    * An array of the validationRules that failed to pass the check.
    */
  var brokenRules: js.UndefOr[js.Array[typings.devextreme.mod.DevExpress.common.ValidationRule]] = js.undefined
  
  /**
    * A promise that is fulfilled when all async rules are validated.
    */
  var complete: js.UndefOr[js.Promise[dxValidatorResult]] = js.undefined
  
  /**
    * Indicates whether all the checked rules are satisfied.
    */
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of async rules whose promises are not fulfilled or rejected. Contains items only when the status is &apos;pending&apos;.
    */
  var pendingRules: js.UndefOr[js.Array[typings.devextreme.mod.DevExpress.common.AsyncRule]] = js.undefined
  
  /**
    * Indicates the validation status.
    */
  var status: js.UndefOr[ValidationStatus] = js.undefined
  
  /**
    * Validation rules specified for the Validator.
    */
  var validationRules: js.UndefOr[js.Array[typings.devextreme.mod.DevExpress.common.ValidationRule]] = js.undefined
  
  /**
    * The value being validated.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object dxValidatorResult {
  
  inline def apply(): dxValidatorResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidatorResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxValidatorResult] (val x: Self) extends AnyVal {
    
    inline def setBrokenRule(value: typings.devextreme.mod.DevExpress.common.ValidationRule): Self = StObject.set(x, "brokenRule", value.asInstanceOf[js.Any])
    
    inline def setBrokenRuleUndefined: Self = StObject.set(x, "brokenRule", js.undefined)
    
    inline def setBrokenRules(value: js.Array[typings.devextreme.mod.DevExpress.common.ValidationRule]): Self = StObject.set(x, "brokenRules", value.asInstanceOf[js.Any])
    
    inline def setBrokenRulesUndefined: Self = StObject.set(x, "brokenRules", js.undefined)
    
    inline def setBrokenRulesVarargs(value: typings.devextreme.mod.DevExpress.common.ValidationRule*): Self = StObject.set(x, "brokenRules", js.Array(value*))
    
    inline def setComplete(value: js.Promise[dxValidatorResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setPendingRules(value: js.Array[typings.devextreme.mod.DevExpress.common.AsyncRule]): Self = StObject.set(x, "pendingRules", value.asInstanceOf[js.Any])
    
    inline def setPendingRulesUndefined: Self = StObject.set(x, "pendingRules", js.undefined)
    
    inline def setPendingRulesVarargs(value: typings.devextreme.mod.DevExpress.common.AsyncRule*): Self = StObject.set(x, "pendingRules", js.Array(value*))
    
    inline def setStatus(value: ValidationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setValidationRules(value: js.Array[typings.devextreme.mod.DevExpress.common.ValidationRule]): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
    
    inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
    
    inline def setValidationRulesVarargs(value: typings.devextreme.mod.DevExpress.common.ValidationRule*): Self = StObject.set(x, "validationRules", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
