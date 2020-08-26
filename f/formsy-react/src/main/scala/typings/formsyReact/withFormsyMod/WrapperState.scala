package typings.formsyReact.withFormsyMod

import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.interfacesMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperState[V]
  extends /* key */ StringDictionary[js.Any] {
  var formSubmitted: Boolean = js.native
  var isPristine: Boolean = js.native
  var isRequired: Boolean = js.native
  var isValid: Boolean = js.native
  var pristineValue: V = js.native
  var validationError: js.Array[ValidationError] = js.native
  var value: V = js.native
}

object WrapperState {
  @scala.inline
  def apply[V](
    formSubmitted: Boolean,
    isPristine: Boolean,
    isRequired: Boolean,
    isValid: Boolean,
    pristineValue: V,
    validationError: js.Array[ValidationError],
    value: V
  ): WrapperState[V] = {
    val __obj = js.Dynamic.literal(formSubmitted = formSubmitted.asInstanceOf[js.Any], isPristine = isPristine.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], pristineValue = pristineValue.asInstanceOf[js.Any], validationError = validationError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperState[V]]
  }
  @scala.inline
  implicit class WrapperStateOps[Self <: WrapperState[_], V] (val x: Self with WrapperState[V]) extends AnyVal {
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
    def setFormSubmitted(value: Boolean): Self = this.set("formSubmitted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPristine(value: Boolean): Self = this.set("isPristine", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPristineValue(value: V): Self = this.set("pristineValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationErrorVarargs(value: ValidationError*): Self = this.set("validationError", js.Array(value :_*))
    @scala.inline
    def setValidationError(value: js.Array[ValidationError]): Self = this.set("validationError", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

