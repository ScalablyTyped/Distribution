package typings
package flightplanLib.FlightplanInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SudoOptions extends CommandOptions {
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object SudoOptions {
  @scala.inline
  def apply(
    failsafe: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    user: java.lang.String = null
  ): SudoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failsafe)) __obj.updateDynamic("failsafe")(failsafe)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[SudoOptions]
  }
}

