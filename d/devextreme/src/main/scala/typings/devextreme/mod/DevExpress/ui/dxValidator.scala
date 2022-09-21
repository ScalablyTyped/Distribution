package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import typings.devextreme.mod.DevExpress.common.ValidationStatus
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.ui.dxValidator.ValidationResult
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxValidator
  extends StObject
     with DOMComponent[dxValidatorOptions] {
  
  /**
    * Sets focus to the editor associated with the current Validator object.
    */
  def focus(): Unit = js.native
  
  /**
    * Resets the value and validation result of the editor associated with the current Validator object.
    */
  def reset(): Unit = js.native
  
  /**
    * Validates the value of the editor that is controlled by the current Validator object against the list of the specified validation rules.
    */
  def validate(): ValidationResult = js.native
}
object dxValidator {
  
  type DisposingEvent = EventInfo[dxValidator]
  
  type InitializedEvent = InitializedEventInfo[dxValidator]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxValidator]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxValidator, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxValidatorOptions
  
  trait ValidatedEvent extends StObject {
    
    var brokenRule: js.UndefOr[ValidationRule] = js.undefined
    
    var brokenRules: js.UndefOr[ValidationRule] = js.undefined
    
    var isValid: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[ValidationStatus] = js.undefined
    
    var validationRules: js.UndefOr[js.Array[ValidationRule]] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object ValidatedEvent {
    
    inline def apply(): ValidatedEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatedEvent]
    }
    
    extension [Self <: ValidatedEvent](x: Self) {
      
      inline def setBrokenRule(value: ValidationRule): Self = StObject.set(x, "brokenRule", value.asInstanceOf[js.Any])
      
      inline def setBrokenRuleUndefined: Self = StObject.set(x, "brokenRule", js.undefined)
      
      inline def setBrokenRules(value: ValidationRule): Self = StObject.set(x, "brokenRules", value.asInstanceOf[js.Any])
      
      inline def setBrokenRulesUndefined: Self = StObject.set(x, "brokenRules", js.undefined)
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStatus(value: ValidationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setValidationRules(value: js.Array[ValidationRule]): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setValidationRulesVarargs(value: ValidationRule*): Self = StObject.set(x, "validationRules", js.Array(value*))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ValidationResult = dxValidatorResult
}
