package typings.foreverAgent.mod

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
    keepAliveMsecs: js.UndefOr[Double] = js.undefined,
    maxFreeSockets: js.UndefOr[Double] = js.undefined,
    maxSockets: js.UndefOr[Double] = js.undefined,
    minSockets: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): ForeverAgentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveMsecs)) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFreeSockets)) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSockets)) __obj.updateDynamic("minSockets")(minSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeverAgentOptions]
  }
}

