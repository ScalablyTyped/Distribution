package typings.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlyFirstError extends js.Object {
  var onlyFirstError: js.UndefOr[Boolean] = js.undefined
}

object OnlyFirstError {
  @scala.inline
  def apply(onlyFirstError: js.UndefOr[Boolean] = js.undefined): OnlyFirstError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyFirstError)) __obj.updateDynamic("onlyFirstError")(onlyFirstError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyFirstError]
  }
}

