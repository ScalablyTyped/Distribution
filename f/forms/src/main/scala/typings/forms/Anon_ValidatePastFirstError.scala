package typings.forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValidatePastFirstError extends js.Object {
  /** If false, the first validation error will halt form validation, otherwise all fields will be validated. */
  var validatePastFirstError: js.UndefOr[Boolean] = js.undefined
}

object Anon_ValidatePastFirstError {
  @scala.inline
  def apply(validatePastFirstError: js.UndefOr[Boolean] = js.undefined): Anon_ValidatePastFirstError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validatePastFirstError)) __obj.updateDynamic("validatePastFirstError")(validatePastFirstError)
    __obj.asInstanceOf[Anon_ValidatePastFirstError]
  }
}

