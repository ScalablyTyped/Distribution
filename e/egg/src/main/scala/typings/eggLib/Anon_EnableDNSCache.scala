package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableDNSCache extends js.Object {
  var enableDNSCache: scala.Boolean
  var freeSocketKeepAliveTimeout: js.UndefOr[scala.Double] = js.undefined
  var freeSocketTimeout: scala.Double
  var keepAlive: scala.Boolean
  var maxFreeSockets: scala.Double
  var maxSockets: scala.Double
  var timeout: scala.Double
}

object Anon_EnableDNSCache {
  @scala.inline
  def apply(
    enableDNSCache: scala.Boolean,
    freeSocketTimeout: scala.Double,
    keepAlive: scala.Boolean,
    maxFreeSockets: scala.Double,
    maxSockets: scala.Double,
    timeout: scala.Double,
    freeSocketKeepAliveTimeout: scala.Int | scala.Double = null
  ): Anon_EnableDNSCache = {
    val __obj = js.Dynamic.literal(enableDNSCache = enableDNSCache, freeSocketTimeout = freeSocketTimeout, keepAlive = keepAlive, maxFreeSockets = maxFreeSockets, maxSockets = maxSockets, timeout = timeout)
    if (freeSocketKeepAliveTimeout != null) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnableDNSCache]
  }
}

