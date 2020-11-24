package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/StepInput/StepInput.StepInputProps> */
@js.native
trait WeakValidationMapStepInpu extends js.Object {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var localizedText: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var validationState: js.UndefOr[Validator[js.UndefOr[Null | State]]] = js.native
  
  var value: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
}
object WeakValidationMapStepInpu {
  
  @scala.inline
  def apply(): WeakValidationMapStepInpu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapStepInpu]
  }
  
  @scala.inline
  implicit class WeakValidationMapStepInpuOps[Self <: WeakValidationMapStepInpu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLocalizedText(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("localizedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizedText: Self = this.set("localizedText", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setValidationState(value: Validator[js.UndefOr[Null | State]]): Self = this.set("validationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
    
    @scala.inline
    def setValue(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
