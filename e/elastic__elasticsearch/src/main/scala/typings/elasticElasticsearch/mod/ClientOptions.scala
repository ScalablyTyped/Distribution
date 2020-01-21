package typings.elasticElasticsearch.mod

import org.scalablytyped.runtime.Instantiable0
import typings.elasticElasticsearch.AnonId
import typings.elasticElasticsearch.AnonOpts
import typings.elasticElasticsearch.AnonOptsResurrectStrategies
import typings.elasticElasticsearch.AnonOptsSniffReasons
import typings.elasticElasticsearch.connectionMod.AgentOptions
import typings.elasticElasticsearch.connectionMod.agentFn
import typings.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.optimistic
import typings.elasticElasticsearch.elasticElasticsearchStrings.ping
import typings.elasticElasticsearch.poolMod.ApiKeyAuth
import typings.elasticElasticsearch.poolMod.BasicAuth
import typings.elasticElasticsearch.serializerMod.default
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestParams
import typings.elasticElasticsearch.transportMod.generateRequestIdFn
import typings.elasticElasticsearch.transportMod.nodeFilterFn
import typings.elasticElasticsearch.transportMod.nodeSelectorFn
import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var Connection: js.UndefOr[AnonOpts] = js.undefined
  var ConnectionPool: js.UndefOr[AnonOptsResurrectStrategies] = js.undefined
  var Serializer: js.UndefOr[Instantiable0[default]] = js.undefined
  var Transport: js.UndefOr[AnonOptsSniffReasons] = js.undefined
  var agent: js.UndefOr[AgentOptions | agentFn] = js.undefined
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.undefined
  var cloud: js.UndefOr[AnonId] = js.undefined
  var compression: js.UndefOr[gzip] = js.undefined
  var generateRequestId: js.UndefOr[generateRequestIdFn] = js.undefined
  var headers: js.UndefOr[anyObject] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var node: js.UndefOr[String | (js.Array[NodeOptions | String]) | NodeOptions] = js.undefined
  var nodeFilter: js.UndefOr[nodeFilterFn] = js.undefined
  var nodeSelector: js.UndefOr[nodeSelectorFn | String] = js.undefined
  var nodes: js.UndefOr[String | js.Array[String]] = js.undefined
  var opaqueIdPrefix: js.UndefOr[String] = js.undefined
  var pingTimeout: js.UndefOr[Double] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var resurrectStrategy: js.UndefOr[ping | optimistic | none] = js.undefined
  var sniffEndpoint: js.UndefOr[String] = js.undefined
  var sniffInterval: js.UndefOr[Double | Boolean] = js.undefined
  var sniffOnConnectionFault: js.UndefOr[Boolean] = js.undefined
  var sniffOnStart: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[ConnectionOptions] = js.undefined
  var suggestCompression: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    Connection: AnonOpts = null,
    ConnectionPool: AnonOptsResurrectStrategies = null,
    Serializer: Instantiable0[default] = null,
    Transport: AnonOptsSniffReasons = null,
    agent: AgentOptions | agentFn = null,
    auth: BasicAuth | ApiKeyAuth = null,
    cloud: AnonId = null,
    compression: gzip = null,
    generateRequestId: (/* params */ TransportRequestParams, /* options */ TransportRequestOptions) => js.Any = null,
    headers: anyObject = null,
    maxRetries: Int | Double = null,
    name: String = null,
    node: String | (js.Array[NodeOptions | String]) | NodeOptions = null,
    nodeFilter: /* connection */ typings.elasticElasticsearch.connectionMod.default => Boolean = null,
    nodeSelector: nodeSelectorFn | String = null,
    nodes: String | js.Array[String] = null,
    opaqueIdPrefix: String = null,
    pingTimeout: Int | Double = null,
    requestTimeout: Int | Double = null,
    resurrectStrategy: ping | optimistic | none = null,
    sniffEndpoint: String = null,
    sniffInterval: Double | Boolean = null,
    sniffOnConnectionFault: js.UndefOr[Boolean] = js.undefined,
    sniffOnStart: js.UndefOr[Boolean] = js.undefined,
    ssl: ConnectionOptions = null,
    suggestCompression: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection.asInstanceOf[js.Any])
    if (ConnectionPool != null) __obj.updateDynamic("ConnectionPool")(ConnectionPool.asInstanceOf[js.Any])
    if (Serializer != null) __obj.updateDynamic("Serializer")(Serializer.asInstanceOf[js.Any])
    if (Transport != null) __obj.updateDynamic("Transport")(Transport.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (cloud != null) __obj.updateDynamic("cloud")(cloud.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (generateRequestId != null) __obj.updateDynamic("generateRequestId")(js.Any.fromFunction2(generateRequestId))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (nodeFilter != null) __obj.updateDynamic("nodeFilter")(js.Any.fromFunction1(nodeFilter))
    if (nodeSelector != null) __obj.updateDynamic("nodeSelector")(nodeSelector.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (opaqueIdPrefix != null) __obj.updateDynamic("opaqueIdPrefix")(opaqueIdPrefix.asInstanceOf[js.Any])
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (resurrectStrategy != null) __obj.updateDynamic("resurrectStrategy")(resurrectStrategy.asInstanceOf[js.Any])
    if (sniffEndpoint != null) __obj.updateDynamic("sniffEndpoint")(sniffEndpoint.asInstanceOf[js.Any])
    if (sniffInterval != null) __obj.updateDynamic("sniffInterval")(sniffInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(sniffOnConnectionFault)) __obj.updateDynamic("sniffOnConnectionFault")(sniffOnConnectionFault.asInstanceOf[js.Any])
    if (!js.isUndefined(sniffOnStart)) __obj.updateDynamic("sniffOnStart")(sniffOnStart.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestCompression)) __obj.updateDynamic("suggestCompression")(suggestCompression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

