package typings
package flightplanLib.FlightplanInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetOptions extends js.Object {
  var agent: java.lang.String
  var failsafe: js.UndefOr[scala.Boolean] = js.undefined
  var host: java.lang.String
  var username: java.lang.String
}

object TargetOptions {
  @scala.inline
  def apply(
    agent: java.lang.String,
    host: java.lang.String,
    username: java.lang.String,
    failsafe: js.UndefOr[scala.Boolean] = js.undefined
  ): TargetOptions = {
    val __obj = js.Dynamic.literal(agent = agent, host = host, username = username)
    if (!js.isUndefined(failsafe)) __obj.updateDynamic("failsafe")(failsafe)
    __obj.asInstanceOf[TargetOptions]
  }
}

