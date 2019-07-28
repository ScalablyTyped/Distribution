package typings.egg.eggMod

import org.scalablytyped.runtime.StringDictionary
import typings.urllib.urllibMod.RequestOptions2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpClientConfig extends HttpClientBaseConfig {
  /** Whether enable dns cache */
  var enableDNSCache: js.UndefOr[Boolean] = js.undefined
  /** Enable proxy request, default is false. */
  var enableProxy: js.UndefOr[Boolean] = js.undefined
  /** http.Agent */
  var httpAgent: js.UndefOr[HttpClientBaseConfig] = js.undefined
  /** https.Agent */
  var httpsAgent: js.UndefOr[HttpClientBaseConfig] = js.undefined
  /** proxy agent uri or options, default is null. */
  var proxy: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
  /** Default request args for httpclient */
  var request: js.UndefOr[RequestOptions2] = js.undefined
}

object HttpClientConfig {
  @scala.inline
  def apply(
    enableDNSCache: js.UndefOr[Boolean] = js.undefined,
    enableProxy: js.UndefOr[Boolean] = js.undefined,
    freeSocketKeepAliveTimeout: Int | Double = null,
    freeSocketTimeout: Int | Double = null,
    httpAgent: HttpClientBaseConfig = null,
    httpsAgent: HttpClientBaseConfig = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    maxFreeSockets: Int | Double = null,
    maxSockets: Int | Double = null,
    proxy: String | StringDictionary[js.Any] = null,
    request: RequestOptions2 = null,
    timeout: Int | Double = null
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

