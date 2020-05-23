package typings.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.urllib.mod.RequestOptions2
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
    freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined,
    freeSocketTimeout: js.UndefOr[Double] = js.undefined,
    httpAgent: HttpClientBaseConfig = null,
    httpsAgent: HttpClientBaseConfig = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    maxFreeSockets: js.UndefOr[Double] = js.undefined,
    maxSockets: js.UndefOr[Double] = js.undefined,
    proxy: String | StringDictionary[js.Any] = null,
    request: RequestOptions2 = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): HttpClientConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableDNSCache)) __obj.updateDynamic("enableDNSCache")(enableDNSCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableProxy)) __obj.updateDynamic("enableProxy")(enableProxy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeSocketKeepAliveTimeout)) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeSocketTimeout)) __obj.updateDynamic("freeSocketTimeout")(freeSocketTimeout.get.asInstanceOf[js.Any])
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFreeSockets)) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpClientConfig]
  }
}

