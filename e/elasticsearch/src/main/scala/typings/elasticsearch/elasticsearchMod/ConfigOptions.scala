package typings.elasticsearch.elasticsearchMod

import org.scalablytyped.runtime.Instantiable2
import typings.elasticsearch.srcLibConnectorsHttpMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var apiVersion: js.UndefOr[String] = js.undefined
  var connectionClass: js.UndefOr[String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^])] = js.undefined
  var createNodeAgent: js.UndefOr[js.Any] = js.undefined
  var deadTimeout: js.UndefOr[Double] = js.undefined
  var defer: js.UndefOr[js.Function0[Unit]] = js.undefined
  var host: js.UndefOr[js.Any] = js.undefined
  var hosts: js.UndefOr[js.Any] = js.undefined
  var httpAuth: js.UndefOr[String] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var maxSockets: js.UndefOr[Double] = js.undefined
  var nodesToHostCallback: js.UndefOr[js.Any] = js.undefined
  var pingTimeout: js.UndefOr[Double] = js.undefined
  var plugins: js.UndefOr[js.Any] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var selector: js.UndefOr[js.Any] = js.undefined
  var sniffInterval: js.UndefOr[Double] = js.undefined
  var sniffOnConnectionFault: js.UndefOr[Boolean] = js.undefined
  var sniffOnStart: js.UndefOr[Boolean] = js.undefined
  var sniffedNodesProtocol: js.UndefOr[String] = js.undefined
  var ssl: js.UndefOr[js.Object] = js.undefined
  var suggestCompression: js.UndefOr[Boolean] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    apiVersion: String = null,
    connectionClass: String | (Instantiable2[/* host */ js.Any, /* config */ js.Any, ^]) = null,
    createNodeAgent: js.Any = null,
    deadTimeout: Int | Double = null,
    defer: () => Unit = null,
    host: js.Any = null,
    hosts: js.Any = null,
    httpAuth: String = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    log: js.Any = null,
    maxRetries: Int | Double = null,
    maxSockets: Int | Double = null,
    nodesToHostCallback: js.Any = null,
    pingTimeout: Int | Double = null,
    plugins: js.Any = null,
    requestTimeout: Int | Double = null,
    selector: js.Any = null,
    sniffInterval: Int | Double = null,
    sniffOnConnectionFault: js.UndefOr[Boolean] = js.undefined,
    sniffOnStart: js.UndefOr[Boolean] = js.undefined,
    sniffedNodesProtocol: String = null,
    ssl: js.Object = null,
    suggestCompression: js.UndefOr[Boolean] = js.undefined
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (connectionClass != null) __obj.updateDynamic("connectionClass")(connectionClass.asInstanceOf[js.Any])
    if (createNodeAgent != null) __obj.updateDynamic("createNodeAgent")(createNodeAgent)
    if (deadTimeout != null) __obj.updateDynamic("deadTimeout")(deadTimeout.asInstanceOf[js.Any])
    if (defer != null) __obj.updateDynamic("defer")(js.Any.fromFunction0(defer))
    if (host != null) __obj.updateDynamic("host")(host)
    if (hosts != null) __obj.updateDynamic("hosts")(hosts)
    if (httpAuth != null) __obj.updateDynamic("httpAuth")(httpAuth)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (log != null) __obj.updateDynamic("log")(log)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (nodesToHostCallback != null) __obj.updateDynamic("nodesToHostCallback")(nodesToHostCallback)
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (sniffInterval != null) __obj.updateDynamic("sniffInterval")(sniffInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(sniffOnConnectionFault)) __obj.updateDynamic("sniffOnConnectionFault")(sniffOnConnectionFault)
    if (!js.isUndefined(sniffOnStart)) __obj.updateDynamic("sniffOnStart")(sniffOnStart)
    if (sniffedNodesProtocol != null) __obj.updateDynamic("sniffedNodesProtocol")(sniffedNodesProtocol)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(suggestCompression)) __obj.updateDynamic("suggestCompression")(suggestCompression)
    __obj.asInstanceOf[ConfigOptions]
  }
}

