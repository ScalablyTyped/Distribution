package typings.forms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatePastFirstError extends js.Object {
  /** If false, the first validation error will halt form validation, otherwise all fields will be validated. */
  var validatePastFirstError: js.UndefOr[Boolean] = js.undefined
}

object ValidatePastFirstError {
  @scala.inline
  def apply(validatePastFirstError: js.UndefOr[Boolean] = js.undefined): ValidatePastFirstError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validatePastFirstError)) __obj.updateDynamic("validatePastFirstError")(validatePastFirstError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePastFirstError]
  }
}

