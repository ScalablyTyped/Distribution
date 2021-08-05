package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationResult extends StObject {
  
  var error: js.UndefOr[ValidationError] = js.undefined
  
  var errors: js.UndefOr[ValidationError] = js.undefined
  
  var value: js.Any
  
  var warning: js.UndefOr[ValidationError] = js.undefined
}
object ValidationResult {
  
  inline def apply(value: js.Any): ValidationResult = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
  
  extension [Self <: ValidationResult](x: Self) {
    
    inline def setError(value: ValidationError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrors(value: ValidationError): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: ValidationError): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
