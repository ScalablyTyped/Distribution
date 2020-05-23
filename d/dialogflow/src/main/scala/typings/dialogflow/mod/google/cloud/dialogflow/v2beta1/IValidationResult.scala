package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ValidationResult. */
trait IValidationResult extends js.Object {
  /** ValidationResult validationErrors */
  var validationErrors: js.UndefOr[js.Array[IValidationError] | Null] = js.undefined
}

object IValidationResult {
  @scala.inline
  def apply(validationErrors: js.UndefOr[Null | js.Array[IValidationError]] = js.undefined): IValidationResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validationErrors)) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationResult]
  }
}

