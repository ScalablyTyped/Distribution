package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/StepInput/StepInput.StepInputProps> */
trait WeakValidationMapStepInpu extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var localizedText: js.UndefOr[Validator[js.UndefOr[Any | Null]]] = js.undefined
  
  var onChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* stepValue */ Double, Unit]) | Null]]] = js.undefined
  
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var validationState: js.UndefOr[Validator[js.UndefOr[Null | State]]] = js.undefined
  
  var value: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
}
object WeakValidationMapStepInpu {
  
  inline def apply(): WeakValidationMapStepInpu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapStepInpu]
  }
  
  extension [Self <: WeakValidationMapStepInpu](x: Self) {
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    inline def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLocalizedText(value: Validator[js.UndefOr[Any | Null]]): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
    
    inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
    
    inline def setOnChange(value: Validator[js.UndefOr[(js.Function1[/* stepValue */ Double, Unit]) | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadOnly(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setValidationState(value: Validator[js.UndefOr[Null | State]]): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
    
    inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    
    inline def setValue(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
