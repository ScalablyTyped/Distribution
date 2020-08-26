package typings.formsyReact.anon

import typings.formsyReact.interfacesMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsRequired extends js.Object {
  var isRequired: Boolean = js.native
  var isValid: Boolean = js.native
  var validationError: js.Array[ValidationError] = js.native
}

object IsRequired {
  @scala.inline
  def apply(isRequired: Boolean, isValid: Boolean, validationError: js.Array[ValidationError]): IsRequired = {
    val __obj = js.Dynamic.literal(isRequired = isRequired.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], validationError = validationError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRequired]
  }
  @scala.inline
  implicit class IsRequiredOps[Self <: IsRequired] (val x: Self) extends AnyVal {
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
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationErrorVarargs(value: ValidationError*): Self = this.set("validationError", js.Array(value :_*))
    @scala.inline
    def setValidationError(value: js.Array[ValidationError]): Self = this.set("validationError", value.asInstanceOf[js.Any])
  }
  
}

