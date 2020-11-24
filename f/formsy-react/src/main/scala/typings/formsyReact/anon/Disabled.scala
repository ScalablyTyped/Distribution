package typings.formsyReact.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled extends js.Object {
  
  var disabled: Requireable[Boolean] = js.native
  
  var mapping: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onChange: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onInvalid: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onInvalidSubmit: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onReset: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onSubmit: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onValid: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onValidSubmit: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var preventDefaultSubmit: Requireable[Boolean] = js.native
  
  var preventExternalInvalidation: Requireable[Boolean] = js.native
  
  var validationErrors: Requireable[js.Object] = js.native
}
object Disabled {
  
  @scala.inline
  def apply(
    disabled: Requireable[Boolean],
    mapping: Requireable[js.Function1[/* repeated */ _, _]],
    onChange: Requireable[js.Function1[/* repeated */ _, _]],
    onInvalid: Requireable[js.Function1[/* repeated */ _, _]],
    onInvalidSubmit: Requireable[js.Function1[/* repeated */ _, _]],
    onReset: Requireable[js.Function1[/* repeated */ _, _]],
    onSubmit: Requireable[js.Function1[/* repeated */ _, _]],
    onValid: Requireable[js.Function1[/* repeated */ _, _]],
    onValidSubmit: Requireable[js.Function1[/* repeated */ _, _]],
    preventDefaultSubmit: Requireable[Boolean],
    preventExternalInvalidation: Requireable[Boolean],
    validationErrors: Requireable[js.Object]
  ): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onInvalid = onInvalid.asInstanceOf[js.Any], onInvalidSubmit = onInvalidSubmit.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], onValid = onValid.asInstanceOf[js.Any], onValidSubmit = onValidSubmit.asInstanceOf[js.Any], preventDefaultSubmit = preventDefaultSubmit.asInstanceOf[js.Any], preventExternalInvalidation = preventExternalInvalidation.asInstanceOf[js.Any], validationErrors = validationErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Requireable[Boolean]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapping(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInvalid(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInvalidSubmit(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onInvalidSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReset(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSubmit(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnValid(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnValidSubmit(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onValidSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultSubmit(value: Requireable[Boolean]): Self = this.set("preventDefaultSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventExternalInvalidation(value: Requireable[Boolean]): Self = this.set("preventExternalInvalidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrors(value: Requireable[js.Object]): Self = this.set("validationErrors", value.asInstanceOf[js.Any])
  }
}
