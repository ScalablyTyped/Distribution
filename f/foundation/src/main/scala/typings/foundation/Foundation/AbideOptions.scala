package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbideOptions extends StObject {
  
  var error_labels: js.UndefOr[Boolean] = js.native
  
  var focus_on_invalid: js.UndefOr[Boolean] = js.native
  
  var live_validate: js.UndefOr[Boolean] = js.native
  
  var patterns: js.UndefOr[AbidePatterns] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var validate_on_blur: js.UndefOr[Boolean] = js.native
  
  var validators: js.UndefOr[js.Object] = js.native
}
object AbideOptions {
  
  @scala.inline
  def apply(): AbideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbideOptions]
  }
  
  @scala.inline
  implicit class AbideOptionsMutableBuilder[Self <: AbideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError_labels(value: Boolean): Self = StObject.set(x, "error_labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_labelsUndefined: Self = StObject.set(x, "error_labels", js.undefined)
    
    @scala.inline
    def setFocus_on_invalid(value: Boolean): Self = StObject.set(x, "focus_on_invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus_on_invalidUndefined: Self = StObject.set(x, "focus_on_invalid", js.undefined)
    
    @scala.inline
    def setLive_validate(value: Boolean): Self = StObject.set(x, "live_validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLive_validateUndefined: Self = StObject.set(x, "live_validate", js.undefined)
    
    @scala.inline
    def setPatterns(value: AbidePatterns): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setValidate_on_blur(value: Boolean): Self = StObject.set(x, "validate_on_blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate_on_blurUndefined: Self = StObject.set(x, "validate_on_blur", js.undefined)
    
    @scala.inline
    def setValidators(value: js.Object): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
  }
}
