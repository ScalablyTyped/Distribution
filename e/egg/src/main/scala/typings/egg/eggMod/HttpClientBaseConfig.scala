package typings.egg.eggMod

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
    freeSocketKeepAliveTimeout: Int | Double = null,
    freeSocketTimeout: Int | Double = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    maxFreeSockets: Int | Double = null,
    maxSockets: Int | Double = null,
    timeout: Int | Double = null
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

