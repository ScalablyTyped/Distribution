package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpClientConfig extends HttpClientBaseConfig {
  /** Whether enable dns cache */
  var enableDNSCache: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable proxy request, default is false. */
  var enableProxy: js.UndefOr[scala.Boolean] = js.undefined
  /** http.Agent */
  var httpAgent: js.UndefOr[HttpClientBaseConfig] = js.undefined
  /** https.Agent */
  var httpsAgent: js.UndefOr[HttpClientBaseConfig] = js.undefined
  /** proxy agent uri or options, default is null. */
  var proxy: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** Default request args for httpclient */
  var request: js.UndefOr[urllibLib.urllibMod.RequestOptions2] = js.undefined
}

object HttpClientConfig {
  @scala.inline
  def apply(
    enableDNSCache: js.UndefOr[scala.Boolean] = js.undefined,
    enableProxy: js.UndefOr[scala.Boolean] = js.undefined,
    freeSocketKeepAliveTimeout: scala.Int | scala.Double = null,
    freeSocketTimeout: scala.Int | scala.Double = null,
    httpAgent: HttpClientBaseConfig = null,
    httpsAgent: HttpClientBaseConfig = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    maxFreeSockets: scala.Int | scala.Double = null,
    maxSockets: scala.Int | scala.Double = null,
    proxy: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    request: urllibLib.urllibMod.RequestOptions2 = null,
    timeout: scala.Int | scala.Double = null
  ): HttpClientConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableDNSCache)) __obj.updateDynamic("enableDNSCache")(enableDNSCache)
    if (!js.isUndefined(enableProxy)) __obj.updateDynamic("enableProxy")(enableProxy)
    if (freeSocketKeepAliveTimeout != null) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.asInstanceOf[js.Any])
    if (freeSocketTimeout != null) __obj.updateDynamic("freeSocketTimeout")(freeSocketTimeout.asInstanceOf[js.Any])
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent)
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpClientConfig]
  }
}

