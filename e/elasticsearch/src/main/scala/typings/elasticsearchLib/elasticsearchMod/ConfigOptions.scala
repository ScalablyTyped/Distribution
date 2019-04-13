package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  var connectionClass: js.UndefOr[
    java.lang.String | (org.scalablytyped.runtime.Instantiable2[/* host */ js.Any, /* config */ js.Any, elasticsearchLib.srcLibConnectorsHttpMod.^])
  ] = js.undefined
  var createNodeAgent: js.UndefOr[js.Any] = js.undefined
  var deadTimeout: js.UndefOr[scala.Double] = js.undefined
  var defer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var host: js.UndefOr[js.Any] = js.undefined
  var hosts: js.UndefOr[js.Any] = js.undefined
  var httpAuth: js.UndefOr[java.lang.String] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var maxSockets: js.UndefOr[scala.Double] = js.undefined
  var nodesToHostCallback: js.UndefOr[js.Any] = js.undefined
  var pingTimeout: js.UndefOr[scala.Double] = js.undefined
  var plugins: js.UndefOr[js.Any] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  var selector: js.UndefOr[js.Any] = js.undefined
  var sniffInterval: js.UndefOr[scala.Double] = js.undefined
  var sniffOnConnectionFault: js.UndefOr[scala.Boolean] = js.undefined
  var sniffOnStart: js.UndefOr[scala.Boolean] = js.undefined
  var sniffedNodesProtocol: js.UndefOr[java.lang.String] = js.undefined
  var ssl: js.UndefOr[js.Object] = js.undefined
  var suggestCompression: js.UndefOr[scala.Boolean] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    apiVersion: java.lang.String = null,
    connectionClass: java.lang.String | (org.scalablytyped.runtime.Instantiable2[/* host */ js.Any, /* config */ js.Any, elasticsearchLib.srcLibConnectorsHttpMod.^]) = null,
    createNodeAgent: js.Any = null,
    deadTimeout: scala.Int | scala.Double = null,
    defer: () => scala.Unit = null,
    host: js.Any = null,
    hosts: js.Any = null,
    httpAuth: java.lang.String = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    log: js.Any = null,
    maxRetries: scala.Int | scala.Double = null,
    maxSockets: scala.Int | scala.Double = null,
    nodesToHostCallback: js.Any = null,
    pingTimeout: scala.Int | scala.Double = null,
    plugins: js.Any = null,
    requestTimeout: scala.Int | scala.Double = null,
    selector: js.Any = null,
    sniffInterval: scala.Int | scala.Double = null,
    sniffOnConnectionFault: js.UndefOr[scala.Boolean] = js.undefined,
    sniffOnStart: js.UndefOr[scala.Boolean] = js.undefined,
    sniffedNodesProtocol: java.lang.String = null,
    ssl: js.Object = null,
    suggestCompression: js.UndefOr[scala.Boolean] = js.undefined
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

