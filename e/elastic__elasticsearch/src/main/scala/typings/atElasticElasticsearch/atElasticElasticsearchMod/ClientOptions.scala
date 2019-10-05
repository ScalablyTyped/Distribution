package typings.atElasticElasticsearch.atElasticElasticsearchMod

import org.scalablytyped.runtime.Instantiable0
import typings.atElasticElasticsearch.Anon_Id
import typings.atElasticElasticsearch.Anon_Opts
import typings.atElasticElasticsearch.Anon_OptsResurrectStrategies
import typings.atElasticElasticsearch.Anon_OptsSniffReasons
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.gzip
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.none
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.optimistic
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.ping
import typings.atElasticElasticsearch.libConnectionMod.AgentOptions
import typings.atElasticElasticsearch.libConnectionMod.agentFn
import typings.atElasticElasticsearch.libPoolMod.ApiKeyAuth
import typings.atElasticElasticsearch.libPoolMod.BasicAuth
import typings.atElasticElasticsearch.libSerializerMod.default
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import typings.atElasticElasticsearch.libTransportMod.TransportRequestParams
import typings.atElasticElasticsearch.libTransportMod.generateRequestIdFn
import typings.atElasticElasticsearch.libTransportMod.nodeFilterFn
import typings.atElasticElasticsearch.libTransportMod.nodeSelectorFn
import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var Connection: js.UndefOr[Anon_Opts] = js.undefined
  var ConnectionPool: js.UndefOr[Anon_OptsResurrectStrategies] = js.undefined
  var Serializer: js.UndefOr[Instantiable0[default]] = js.undefined
  var Transport: js.UndefOr[Anon_OptsSniffReasons] = js.undefined
  var agent: js.UndefOr[AgentOptions | agentFn] = js.undefined
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.undefined
  var cloud: js.UndefOr[Anon_Id] = js.undefined
  var compression: js.UndefOr[gzip] = js.undefined
  var generateRequestId: js.UndefOr[generateRequestIdFn] = js.undefined
  var headers: js.UndefOr[anyObject] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var node: js.UndefOr[String | (js.Array[NodeOptions | String]) | NodeOptions] = js.undefined
  var nodeFilter: js.UndefOr[nodeFilterFn] = js.undefined
  var nodeSelector: js.UndefOr[nodeSelectorFn | String] = js.undefined
  var nodes: js.UndefOr[String | js.Array[String]] = js.undefined
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
    Connection: Anon_Opts = null,
    ConnectionPool: Anon_OptsResurrectStrategies = null,
    Serializer: Instantiable0[default] = null,
    Transport: Anon_OptsSniffReasons = null,
    agent: AgentOptions | agentFn = null,
    auth: BasicAuth | ApiKeyAuth = null,
    cloud: Anon_Id = null,
    compression: gzip = null,
    generateRequestId: (/* params */ TransportRequestParams, /* options */ TransportRequestOptions) => js.Any = null,
    headers: anyObject = null,
    maxRetries: Int | Double = null,
    name: String = null,
    node: String | (js.Array[NodeOptions | String]) | NodeOptions = null,
    nodeFilter: /* connection */ typings.atElasticElasticsearch.libConnectionMod.default => Boolean = null,
    nodeSelector: nodeSelectorFn | String = null,
    nodes: String | js.Array[String] = null,
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
    if (Connection != null) __obj.updateDynamic("Connection")(Connection)
    if (ConnectionPool != null) __obj.updateDynamic("ConnectionPool")(ConnectionPool)
    if (Serializer != null) __obj.updateDynamic("Serializer")(Serializer)
    if (Transport != null) __obj.updateDynamic("Transport")(Transport)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (cloud != null) __obj.updateDynamic("cloud")(cloud)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (generateRequestId != null) __obj.updateDynamic("generateRequestId")(js.Any.fromFunction2(generateRequestId))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (nodeFilter != null) __obj.updateDynamic("nodeFilter")(js.Any.fromFunction1(nodeFilter))
    if (nodeSelector != null) __obj.updateDynamic("nodeSelector")(nodeSelector.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (resurrectStrategy != null) __obj.updateDynamic("resurrectStrategy")(resurrectStrategy.asInstanceOf[js.Any])
    if (sniffEndpoint != null) __obj.updateDynamic("sniffEndpoint")(sniffEndpoint)
    if (sniffInterval != null) __obj.updateDynamic("sniffInterval")(sniffInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(sniffOnConnectionFault)) __obj.updateDynamic("sniffOnConnectionFault")(sniffOnConnectionFault)
    if (!js.isUndefined(sniffOnStart)) __obj.updateDynamic("sniffOnStart")(sniffOnStart)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(suggestCompression)) __obj.updateDynamic("suggestCompression")(suggestCompression)
    __obj.asInstanceOf[ClientOptions]
  }
}

