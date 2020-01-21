package typings.dotenvParseVariables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assignToProcessEnv: js.UndefOr[Boolean] = js.undefined
  var overrideProcessEnv: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    assignToProcessEnv: js.UndefOr[Boolean] = js.undefined,
    overrideProcessEnv: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assignToProcessEnv)) __obj.updateDynamic("assignToProcessEnv")(assignToProcessEnv.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideProcessEnv)) __obj.updateDynamic("overrideProcessEnv")(overrideProcessEnv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

