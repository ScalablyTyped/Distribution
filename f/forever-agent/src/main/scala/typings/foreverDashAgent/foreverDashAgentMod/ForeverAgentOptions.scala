package typings.foreverDashAgent.foreverDashAgentMod

import typings.node.httpMod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeverAgentOptions extends AgentOptions {
  var minSockets: js.UndefOr[Double] = js.undefined
}

object ForeverAgentOptions {
  @scala.inline
  def apply(
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveMsecs: Int | Double = null,
    maxFreeSockets: Int | Double = null,
    maxSockets: Int | Double = null,
    minSockets: Int | Double = null,
    timeout: Int | Double = null
  ): ForeverAgentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveMsecs != null) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.asInstanceOf[js.Any])
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (minSockets != null) __obj.updateDynamic("minSockets")(minSockets.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeverAgentOptions]
  }
}

