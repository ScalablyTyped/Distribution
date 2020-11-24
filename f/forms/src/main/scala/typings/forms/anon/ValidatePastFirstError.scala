package typings.forms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatePastFirstError extends js.Object {
  
  /** If false, the first validation error will halt form validation, otherwise all fields will be validated. */
  var validatePastFirstError: js.UndefOr[Boolean] = js.native
}
object ValidatePastFirstError {
  
  @scala.inline
  def apply(): ValidatePastFirstError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatePastFirstError]
  }
  
  @scala.inline
  implicit class ValidatePastFirstErrorOps[Self <: ValidatePastFirstError] (val x: Self) extends AnyVal {
    
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
    def setValidatePastFirstError(value: Boolean): Self = this.set("validatePastFirstError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidatePastFirstError: Self = this.set("validatePastFirstError", js.undefined)
  }
}
