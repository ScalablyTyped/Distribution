package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnlyFirstError extends js.Object {
  var onlyFirstError: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_OnlyFirstError {
  @scala.inline
  def apply(onlyFirstError: js.UndefOr[scala.Boolean] = js.undefined): Anon_OnlyFirstError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyFirstError)) __obj.updateDynamic("onlyFirstError")(onlyFirstError)
    __obj.asInstanceOf[Anon_OnlyFirstError]
  }
}

