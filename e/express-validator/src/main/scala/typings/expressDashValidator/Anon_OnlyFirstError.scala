package typings.expressDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnlyFirstError extends js.Object {
  var onlyFirstError: js.UndefOr[Boolean] = js.undefined
}

object Anon_OnlyFirstError {
  @scala.inline
  def apply(onlyFirstError: js.UndefOr[Boolean] = js.undefined): Anon_OnlyFirstError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyFirstError)) __obj.updateDynamic("onlyFirstError")(onlyFirstError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnlyFirstError]
  }
}

