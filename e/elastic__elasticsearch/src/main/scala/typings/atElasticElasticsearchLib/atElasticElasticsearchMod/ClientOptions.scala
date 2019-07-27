package typings
package atElasticElasticsearchLib.atElasticElasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var Connection: js.UndefOr[atElasticElasticsearchLib.Anon_Opts] = js.undefined
  var ConnectionPool: js.UndefOr[atElasticElasticsearchLib.Anon_OptsResurrectStrategies] = js.undefined
  var Serializer: js.UndefOr[
    org.scalablytyped.runtime.Instantiable0[atElasticElasticsearchLib.libSerializerMod.default]
  ] = js.undefined
  var Transport: js.UndefOr[atElasticElasticsearchLib.Anon_OptsSniffReasons] = js.undefined
  var agent: js.UndefOr[
    atElasticElasticsearchLib.libConnectionMod.AgentOptions | atElasticElasticsearchLib.libConnectionMod.agentFn
  ] = js.undefined
  var cloud: js.UndefOr[atElasticElasticsearchLib.Anon_Id] = js.undefined
  var compression: js.UndefOr[atElasticElasticsearchLib.atElasticElasticsearchLibStrings.gzip] = js.undefined
  var generateRequestId: js.UndefOr[atElasticElasticsearchLib.libTransportMod.generateRequestIdFn] = js.undefined
  var headers: js.UndefOr[anyObject] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var node: js.UndefOr[java.lang.String | (js.Array[NodeOptions | java.lang.String]) | NodeOptions] = js.undefined
  var nodeFilter: js.UndefOr[atElasticElasticsearchLib.libTransportMod.nodeFilterFn] = js.undefined
  var nodeSelector: js.UndefOr[atElasticElasticsearchLib.libTransportMod.nodeSelectorFn | java.lang.String] = js.undefined
  var nodes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var pingTimeout: js.UndefOr[scala.Double] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  var resurrectStrategy: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.ping | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.optimistic | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none
  ] = js.undefined
  var sniffEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var sniffInterval: js.UndefOr[scala.Double] = js.undefined
  var sniffOnConnectionFault: js.UndefOr[scala.Boolean] = js.undefined
  var sniffOnStart: js.UndefOr[scala.Boolean] = js.undefined
  var ssl: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  var suggestCompression: js.UndefOr[scala.Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    Connection: atElasticElasticsearchLib.Anon_Opts = null,
    ConnectionPool: atElasticElasticsearchLib.Anon_OptsResurrectStrategies = null,
    Serializer: org.scalablytyped.runtime.Instantiable0[atElasticElasticsearchLib.libSerializerMod.default] = null,
    Transport: atElasticElasticsearchLib.Anon_OptsSniffReasons = null,
    agent: atElasticElasticsearchLib.libConnectionMod.AgentOptions | atElasticElasticsearchLib.libConnectionMod.agentFn = null,
    cloud: atElasticElasticsearchLib.Anon_Id = null,
    compression: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.gzip = null,
    generateRequestId: atElasticElasticsearchLib.libTransportMod.generateRequestIdFn = null,
    headers: anyObject = null,
    maxRetries: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    node: java.lang.String | (js.Array[NodeOptions | java.lang.String]) | NodeOptions = null,
    nodeFilter: atElasticElasticsearchLib.libTransportMod.nodeFilterFn = null,
    nodeSelector: atElasticElasticsearchLib.libTransportMod.nodeSelectorFn | java.lang.String = null,
    nodes: java.lang.String | js.Array[java.lang.String] = null,
    pingTimeout: scala.Int | scala.Double = null,
    requestTimeout: scala.Int | scala.Double = null,
    resurrectStrategy: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.ping | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.optimistic | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none = null,
    sniffEndpoint: java.lang.String = null,
    sniffInterval: scala.Int | scala.Double = null,
    sniffOnConnectionFault: js.UndefOr[scala.Boolean] = js.undefined,
    sniffOnStart: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: nodeLib.tlsMod.ConnectionOptions = null,
    suggestCompression: js.UndefOr[scala.Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection)
    if (ConnectionPool != null) __obj.updateDynamic("ConnectionPool")(ConnectionPool)
    if (Serializer != null) __obj.updateDynamic("Serializer")(Serializer)
    if (Transport != null) __obj.updateDynamic("Transport")(Transport)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (cloud != null) __obj.updateDynamic("cloud")(cloud)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (generateRequestId != null) __obj.updateDynamic("generateRequestId")(generateRequestId)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (nodeFilter != null) __obj.updateDynamic("nodeFilter")(nodeFilter)
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

