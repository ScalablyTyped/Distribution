package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbideDefaults extends StObject {
  
  var a11yAttributes: Boolean
  
  var a11yErrorLevel: String
  
  var formErrorClass: String
  
  var formErrorSelector: String
  
  var inputErrorClass: String
  
  var labelErrorClass: String
  
  var liveValidate: Boolean
  
  var patterns: IAbidePatterns
  
  var validateOn: String | Null
  
  var validateOnBlur: Boolean
  
  var validators: Any
}
object AbideDefaults {
  
  inline def apply(
    a11yAttributes: Boolean,
    a11yErrorLevel: String,
    formErrorClass: String,
    formErrorSelector: String,
    inputErrorClass: String,
    labelErrorClass: String,
    liveValidate: Boolean,
    patterns: IAbidePatterns,
    validateOnBlur: Boolean,
    validators: Any
  ): AbideDefaults = {
    val __obj = js.Dynamic.literal(a11yAttributes = a11yAttributes.asInstanceOf[js.Any], a11yErrorLevel = a11yErrorLevel.asInstanceOf[js.Any], formErrorClass = formErrorClass.asInstanceOf[js.Any], formErrorSelector = formErrorSelector.asInstanceOf[js.Any], inputErrorClass = inputErrorClass.asInstanceOf[js.Any], labelErrorClass = labelErrorClass.asInstanceOf[js.Any], liveValidate = liveValidate.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], validateOn = null)
    __obj.asInstanceOf[AbideDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbideDefaults] (val x: Self) extends AnyVal {
    
    inline def setA11yAttributes(value: Boolean): Self = StObject.set(x, "a11yAttributes", value.asInstanceOf[js.Any])
    
    inline def setA11yErrorLevel(value: String): Self = StObject.set(x, "a11yErrorLevel", value.asInstanceOf[js.Any])
    
    inline def setFormErrorClass(value: String): Self = StObject.set(x, "formErrorClass", value.asInstanceOf[js.Any])
    
    inline def setFormErrorSelector(value: String): Self = StObject.set(x, "formErrorSelector", value.asInstanceOf[js.Any])
    
    inline def setInputErrorClass(value: String): Self = StObject.set(x, "inputErrorClass", value.asInstanceOf[js.Any])
    
    inline def setLabelErrorClass(value: String): Self = StObject.set(x, "labelErrorClass", value.asInstanceOf[js.Any])
    
    inline def setLiveValidate(value: Boolean): Self = StObject.set(x, "liveValidate", value.asInstanceOf[js.Any])
    
    inline def setPatterns(value: IAbidePatterns): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setValidateOn(value: String): Self = StObject.set(x, "validateOn", value.asInstanceOf[js.Any])
    
    inline def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
    
    inline def setValidateOnNull: Self = StObject.set(x, "validateOn", null)
    
    inline def setValidators(value: Any): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
  }
}
