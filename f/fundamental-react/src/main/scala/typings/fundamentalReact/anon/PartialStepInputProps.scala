package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/StepInput/StepInput.StepInputProps> */
@js.native
trait PartialStepInputProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var disableStyles: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var localizedText: js.UndefOr[js.Any] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var validationState: js.UndefOr[State] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object PartialStepInputProps {
  
  @scala.inline
  def apply(): PartialStepInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStepInputProps]
  }
  
  @scala.inline
  implicit class PartialStepInputPropsMutableBuilder[Self <: PartialStepInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLocalizedText(value: js.Any): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
