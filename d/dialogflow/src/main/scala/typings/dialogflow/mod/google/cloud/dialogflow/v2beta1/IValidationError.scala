package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.ValidationError.Severity
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
  var severity: js.UndefOr[
    Severity | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.ValidationError.Severity * / any */ String) | Null
  ] = js.undefined
}

object IValidationError {
  @scala.inline
  def apply(
    entries: js.UndefOr[Null | js.Array[String]] = js.undefined,
    errorMessage: js.UndefOr[Null | String] = js.undefined,
    severity: js.UndefOr[
      Null | Severity | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.ValidationError.Severity * / any */ String)
    ] = js.undefined
  ): IValidationError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entries)) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (!js.isUndefined(errorMessage)) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(severity)) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationError]
  }
}

