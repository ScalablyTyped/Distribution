package typings.elasticElasticsearch.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveMsecs: js.UndefOr[Double] = js.undefined
  var maxFreeSockets: js.UndefOr[Double] = js.undefined
  var maxSockets: js.UndefOr[Double] = js.undefined
}

object AgentOptions {
  @scala.inline
  def apply(
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveMsecs: js.UndefOr[Double] = js.undefined,
    maxFreeSockets: js.UndefOr[Double] = js.undefined,
    maxSockets: js.UndefOr[Double] = js.undefined
  ): AgentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveMsecs)) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFreeSockets)) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOptions]
  }
}

