package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpClientBaseConfig extends js.Object {
  /** Free socket after keepalive timeout */
  var freeSocketKeepAliveTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Free socket after request timeout */
  var freeSocketTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Whether use http keepalive */
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  /** The maximum number of sockets that will be left open in the free state */
  var maxFreeSockets: js.UndefOr[scala.Double] = js.undefined
  /** Determines how many concurrent sockets the agent can have open per origin */
  var maxSockets: js.UndefOr[scala.Double] = js.undefined
  /** Request timeout */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object HttpClientBaseConfig {
  @scala.inline
  def apply(
    freeSocketKeepAliveTimeout: scala.Int | scala.Double = null,
    freeSocketTimeout: scala.Int | scala.Double = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    maxFreeSockets: scala.Int | scala.Double = null,
    maxSockets: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): HttpClientBaseConfig = {
    val __obj = js.Dynamic.literal()
    if (freeSocketKeepAliveTimeout != null) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.asInstanceOf[js.Any])
    if (freeSocketTimeout != null) __obj.updateDynamic("freeSocketTimeout")(freeSocketTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpClientBaseConfig]
  }
}

