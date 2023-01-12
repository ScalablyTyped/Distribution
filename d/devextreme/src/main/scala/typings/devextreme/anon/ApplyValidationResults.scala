package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyValidationResults extends StObject {
  
  /**
    * A function that the Validator UI component calls after validating a specified value.
    */
  var applyValidationResults: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function that returns a Boolean value specifying whether or not to bypass validation.
    */
  var bypass: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function that sets focus to a validated editor when the corresponding ValidationSummary item is focused.
    */
  var focus: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function that returns the value to be validated.
    */
  var getValue: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function that resets the validated values.
    */
  var reset: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Callbacks to be executed on the value validation.
    */
  var validationRequestsCallbacks: js.UndefOr[js.Array[js.Function]] = js.undefined
}
object ApplyValidationResults {
  
  inline def apply(): ApplyValidationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyValidationResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyValidationResults] (val x: Self) extends AnyVal {
    
    inline def setApplyValidationResults(value: js.Function): Self = StObject.set(x, "applyValidationResults", value.asInstanceOf[js.Any])
    
    inline def setApplyValidationResultsUndefined: Self = StObject.set(x, "applyValidationResults", js.undefined)
    
    inline def setBypass(value: js.Function): Self = StObject.set(x, "bypass", value.asInstanceOf[js.Any])
    
    inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
    
    inline def setFocus(value: js.Function): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setGetValue(value: js.Function): Self = StObject.set(x, "getValue", value.asInstanceOf[js.Any])
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setReset(value: js.Function): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setValidationRequestsCallbacks(value: js.Array[js.Function]): Self = StObject.set(x, "validationRequestsCallbacks", value.asInstanceOf[js.Any])
    
    inline def setValidationRequestsCallbacksUndefined: Self = StObject.set(x, "validationRequestsCallbacks", js.undefined)
    
    inline def setValidationRequestsCallbacksVarargs(value: js.Function*): Self = StObject.set(x, "validationRequestsCallbacks", js.Array(value*))
  }
}
