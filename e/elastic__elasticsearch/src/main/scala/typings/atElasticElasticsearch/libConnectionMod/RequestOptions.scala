package typings.atElasticElasticsearch.libConnectionMod

import typings.node.Error
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends ClientRequestArgs {
  var asStream: js.UndefOr[Boolean] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var querystring: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    _defaultAgent: Agent = null,
    agent: Agent | Boolean = null,
    asStream: js.UndefOr[Boolean] = js.undefined,
    auth: String = null,
    body: js.Any = null,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket = null,
    defaultPort: Double | String = null,
    family: Int | Double = null,
    headers: OutgoingHttpHeaders = null,
    host: String = null,
    hostname: String = null,
    localAddress: String = null,
    method: String = null,
    path: String = null,
    port: Double | String = null,
    protocol: String = null,
    querystring: String = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    socketPath: String = null,
    timeout: Int | Double = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(asStream)) __obj.updateDynamic("asStream")(asStream)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (body != null) __obj.updateDynamic("body")(body)
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
    if (querystring != null) __obj.updateDynamic("querystring")(querystring)
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

