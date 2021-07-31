package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbideDefaults extends StObject {
  
  var formErrorClass: String
  
  var formErrorSelector: String
  
  var inputErrorClass: String
  
  var labelErrorClass: String
  
  var liveValidate: Boolean
  
  var patterns: IAbidePatterns
  
  var validateOn: String
  
  var validateOnBlur: Boolean
  
  var validators: js.Any
}
object AbideDefaults {
  
  @scala.inline
  def apply(
    formErrorClass: String,
    formErrorSelector: String,
    inputErrorClass: String,
    labelErrorClass: String,
    liveValidate: Boolean,
    patterns: IAbidePatterns,
    validateOn: String,
    validateOnBlur: Boolean,
    validators: js.Any
  ): AbideDefaults = {
    val __obj = js.Dynamic.literal(formErrorClass = formErrorClass.asInstanceOf[js.Any], formErrorSelector = formErrorSelector.asInstanceOf[js.Any], inputErrorClass = inputErrorClass.asInstanceOf[js.Any], labelErrorClass = labelErrorClass.asInstanceOf[js.Any], liveValidate = liveValidate.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], validateOn = validateOn.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbideDefaults]
  }
  
  @scala.inline
  implicit class AbideDefaultsMutableBuilder[Self <: AbideDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormErrorClass(value: String): Self = StObject.set(x, "formErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormErrorSelector(value: String): Self = StObject.set(x, "formErrorSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputErrorClass(value: String): Self = StObject.set(x, "inputErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelErrorClass(value: String): Self = StObject.set(x, "labelErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveValidate(value: Boolean): Self = StObject.set(x, "liveValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatterns(value: IAbidePatterns): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOn(value: String): Self = StObject.set(x, "validateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidators(value: js.Any): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
  }
}
