package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  def apply(validationErrors: js.Array[IValidationError] = null): IValidationResult = {
    val __obj = js.Dynamic.literal()
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors)
    __obj.asInstanceOf[IValidationResult]
  }
}

