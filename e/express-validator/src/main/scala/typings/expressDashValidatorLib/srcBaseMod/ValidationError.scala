package typings
package expressDashValidatorLib.srcBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var location: js.UndefOr[Location] = js.undefined
  var msg: js.UndefOr[js.Any] = js.undefined
  var nestedErrors: js.UndefOr[js.Array[ValidationError]] = js.undefined
  var param: js.UndefOr[java.lang.String | expressDashValidatorLib.expressDashValidatorLibStrings._error] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ValidationError {
  @scala.inline
  def apply(
    location: js.UndefOr[scala.Nothing] = js.undefined,
    msg: js.Any = null,
    nestedErrors: js.Array[ValidationError] = null,
    param: expressDashValidatorLib.expressDashValidatorLibStrings._error = null,
    value: js.Any = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (nestedErrors != null) __obj.updateDynamic("nestedErrors")(nestedErrors)
    if (param != null) __obj.updateDynamic("param")(param)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ValidationError]
  }
}

