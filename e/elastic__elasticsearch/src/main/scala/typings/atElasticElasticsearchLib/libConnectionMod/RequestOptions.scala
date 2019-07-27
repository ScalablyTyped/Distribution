package typings
package atElasticElasticsearchLib.libConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends nodeLib.httpMod.ClientRequestArgs {
  var asStream: js.UndefOr[scala.Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    _defaultAgent: nodeLib.httpMod.Agent = null,
    agent: nodeLib.httpMod.Agent | scala.Boolean = null,
    asStream: js.UndefOr[scala.Boolean] = js.undefined,
    auth: java.lang.String = null,
    createConnection: (/* options */ nodeLib.httpMod.ClientRequestArgs, /* oncreate */ js.Function2[/* err */ nodeLib.Error, /* socket */ nodeLib.netMod.Socket, scala.Unit]) => nodeLib.netMod.Socket = null,
    defaultPort: scala.Double | java.lang.String = null,
    family: scala.Int | scala.Double = null,
    headers: nodeLib.httpMod.OutgoingHttpHeaders = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    localAddress: java.lang.String = null,
    method: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Double | java.lang.String = null,
    protocol: java.lang.String = null,
    setHost: js.UndefOr[scala.Boolean] = js.undefined,
    socketPath: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(asStream)) __obj.updateDynamic("asStream")(asStream)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

