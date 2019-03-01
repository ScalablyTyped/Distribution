package typings
package flightplanLib.FlightplanInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  var failsafe: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object CommandOptions {
  @scala.inline
  def apply(
    failsafe: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): CommandOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failsafe)) __obj.updateDynamic("failsafe")(failsafe)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[CommandOptions]
  }
}

