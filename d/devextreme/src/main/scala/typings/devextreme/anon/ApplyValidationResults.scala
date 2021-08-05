package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyValidationResults extends StObject {
  
  var applyValidationResults: js.UndefOr[js.Function] = js.undefined
  
  var bypass: js.UndefOr[js.Function] = js.undefined
  
  var focus: js.UndefOr[js.Function] = js.undefined
  
  var getValue: js.UndefOr[js.Function] = js.undefined
  
  var reset: js.UndefOr[js.Function] = js.undefined
  
  var validationRequestsCallbacks: js.UndefOr[js.Array[js.Function]] = js.undefined
}
object ApplyValidationResults {
  
  inline def apply(): ApplyValidationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyValidationResults]
  }
  
  extension [Self <: ApplyValidationResults](x: Self) {
    
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
    
    inline def setValidationRequestsCallbacksVarargs(value: js.Function*): Self = StObject.set(x, "validationRequestsCallbacks", js.Array(value :_*))
  }
}
