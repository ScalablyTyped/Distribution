package typings.forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValidatePastFirstError extends js.Object {
  /** If false, the first validation error will halt form validation, otherwise all fields will be validated. */
  var validatePastFirstError: js.UndefOr[Boolean] = js.undefined
}

object AnonValidatePastFirstError {
  @scala.inline
  def apply(validatePastFirstError: js.UndefOr[Boolean] = js.undefined): AnonValidatePastFirstError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validatePastFirstError)) __obj.updateDynamic("validatePastFirstError")(validatePastFirstError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValidatePastFirstError]
  }
}

