package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpClientBaseConfig extends js.Object {
  /** Free socket after keepalive timeout */
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
  /** Free socket after request timeout */
  var freeSocketTimeout: js.UndefOr[Double] = js.undefined
  /** Whether use http keepalive */
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of sockets that will be left open in the free state */
  var maxFreeSockets: js.UndefOr[Double] = js.undefined
  /** Determines how many concurrent sockets the agent can have open per origin */
  var maxSockets: js.UndefOr[Double] = js.undefined
  /** Request timeout */
  var timeout: js.UndefOr[Double] = js.undefined
}

object HttpClientBaseConfig {
  @scala.inline
  def apply(
    freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined,
    freeSocketTimeout: js.UndefOr[Double] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    maxFreeSockets: js.UndefOr[Double] = js.undefined,
    maxSockets: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): HttpClientBaseConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(freeSocketKeepAliveTimeout)) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeSocketTimeout)) __obj.updateDynamic("freeSocketTimeout")(freeSocketTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFreeSockets)) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpClientBaseConfig]
  }
}

