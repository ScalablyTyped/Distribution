package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProcessingError extends js.Object {
  /**
    * Error code indicating the nature of the error.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Description of the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * In case the item fields are invalid, this field contains the details
    * about the validation errors.
    */
  var fieldViolations: js.UndefOr[js.Array[Schema$FieldViolation]] = js.native
}

object Schema$ProcessingError {
  @scala.inline
  def apply(
    code: String = null,
    errorMessage: String = null,
    fieldViolations: js.Array[Schema$FieldViolation] = null
  ): Schema$ProcessingError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (fieldViolations != null) __obj.updateDynamic("fieldViolations")(fieldViolations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProcessingError]
  }
}

