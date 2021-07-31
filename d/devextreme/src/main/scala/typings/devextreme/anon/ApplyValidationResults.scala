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
  
  @scala.inline
  def apply(): ApplyValidationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyValidationResults]
  }
  
  @scala.inline
  implicit class ApplyValidationResultsMutableBuilder[Self <: ApplyValidationResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyValidationResults(value: js.Function): Self = StObject.set(x, "applyValidationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyValidationResultsUndefined: Self = StObject.set(x, "applyValidationResults", js.undefined)
    
    @scala.inline
    def setBypass(value: js.Function): Self = StObject.set(x, "bypass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
    
    @scala.inline
    def setFocus(value: js.Function): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setGetValue(value: js.Function): Self = StObject.set(x, "getValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setReset(value: js.Function): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setValidationRequestsCallbacks(value: js.Array[js.Function]): Self = StObject.set(x, "validationRequestsCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationRequestsCallbacksUndefined: Self = StObject.set(x, "validationRequestsCallbacks", js.undefined)
    
    @scala.inline
    def setValidationRequestsCallbacksVarargs(value: js.Function*): Self = StObject.set(x, "validationRequestsCallbacks", js.Array(value :_*))
  }
}
