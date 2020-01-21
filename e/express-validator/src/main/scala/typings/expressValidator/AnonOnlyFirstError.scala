package typings.expressValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnlyFirstError extends js.Object {
  var onlyFirstError: js.UndefOr[Boolean] = js.undefined
}

object AnonOnlyFirstError {
  @scala.inline
  def apply(onlyFirstError: js.UndefOr[Boolean] = js.undefined): AnonOnlyFirstError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyFirstError)) __obj.updateDynamic("onlyFirstError")(onlyFirstError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnlyFirstError]
  }
}

