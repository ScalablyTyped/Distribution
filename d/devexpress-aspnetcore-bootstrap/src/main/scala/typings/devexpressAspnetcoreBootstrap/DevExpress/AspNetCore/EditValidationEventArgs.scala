package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditValidationEventArgs extends EventArgs {
  var errorText: String = js.native
  var isValid: Boolean = js.native
  var value: String = js.native
}

object EditValidationEventArgs {
  @scala.inline
  def apply(errorText: String, isValid: Boolean, sender: Control, value: String): EditValidationEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditValidationEventArgs]
  }
  @scala.inline
  implicit class EditValidationEventArgsOps[Self <: EditValidationEventArgs] (val x: Self) extends AnyVal {
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
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

