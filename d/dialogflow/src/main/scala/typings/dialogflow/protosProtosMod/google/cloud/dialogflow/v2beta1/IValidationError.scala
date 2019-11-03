package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.ValidationError.Severity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ValidationError. */
trait IValidationError extends js.Object {
  /** ValidationError entries */
  var entries: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ValidationError errorMessage */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  /** ValidationError severity */
  var severity: js.UndefOr[Severity | Null] = js.undefined
}

object IValidationError {
  @scala.inline
  def apply(entries: js.Array[String] = null, errorMessage: String = null, severity: Severity = null): IValidationError = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    __obj.asInstanceOf[IValidationError]
  }
}

