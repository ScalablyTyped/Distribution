package typings
package foreverDashAgentLib.foreverDashAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeverAgentOptions
  extends nodeLib.httpMod.AgentOptions {
  var minSockets: js.UndefOr[scala.Double] = js.undefined
}

object ForeverAgentOptions {
  @scala.inline
  def apply(
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepAliveMsecs: scala.Int | scala.Double = null,
    maxFreeSockets: scala.Int | scala.Double = null,
    maxSockets: scala.Int | scala.Double = null,
    minSockets: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): ForeverAgentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveMsecs != null) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.asInstanceOf[js.Any])
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (minSockets != null) __obj.updateDynamic("minSockets")(minSockets.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeverAgentOptions]
  }
}

