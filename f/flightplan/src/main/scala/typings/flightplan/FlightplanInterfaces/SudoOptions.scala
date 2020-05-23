package typings.flightplan.FlightplanInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SudoOptions extends CommandOptions {
  var user: js.UndefOr[String] = js.undefined
}

object SudoOptions {
  @scala.inline
  def apply(
    failsafe: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): SudoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failsafe)) __obj.updateDynamic("failsafe")(failsafe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SudoOptions]
  }
}

