package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.ValidationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxValidationGroupResult extends StObject {
  
  /**
    * An array of the validation rules that failed.
    */
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  
  /**
    * A promise that is fulfilled when all async rules are validated.
    */
  var complete: js.UndefOr[js.Promise[dxValidationGroupResult]] = js.undefined
  
  /**
    * Indicates whether all the rules checked for the group are satisfied.
    */
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the validation status.
    */
  var status: js.UndefOr[ValidationStatus] = js.undefined
  
  /**
    * Validator UI components included in the validated group.
    */
  var validators: js.UndefOr[js.Array[Any]] = js.undefined
}
object dxValidationGroupResult {
  
  inline def apply(): dxValidationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidationGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxValidationGroupResult] (val x: Self) extends AnyVal {
    
    inline def setBrokenRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = StObject.set(x, "brokenRules", value.asInstanceOf[js.Any])
    
    inline def setBrokenRulesUndefined: Self = StObject.set(x, "brokenRules", js.undefined)
    
    inline def setBrokenRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = StObject.set(x, "brokenRules", js.Array(value*))
    
    inline def setComplete(value: js.Promise[dxValidationGroupResult]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setStatus(value: ValidationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setValidators(value: js.Array[Any]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: Any*): Self = StObject.set(x, "validators", js.Array(value*))
  }
}
