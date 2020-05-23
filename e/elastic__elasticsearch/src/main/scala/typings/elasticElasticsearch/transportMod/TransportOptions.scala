package typings.elasticElasticsearch.transportMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typings.elasticElasticsearch.poolMod.CloudConnectionPool
import typings.elasticElasticsearch.poolMod.ConnectionPool
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportOptions extends js.Object {
  var compression: js.UndefOr[gzip] = js.native
  var connectionPool: ConnectionPool | CloudConnectionPool = js.native
  var generateRequestId: js.UndefOr[generateRequestIdFn] = js.native
  var headers: js.UndefOr[Record[String, _]] = js.native
  var maxRetries: Double = js.native
  var name: js.UndefOr[String] = js.native
  var nodeFilter: js.UndefOr[nodeFilterFn] = js.native
  var nodeSelector: js.UndefOr[String | nodeSelectorFn] = js.native
  var opaqueIdPrefix: js.UndefOr[String] = js.native
  var requestTimeout: Double | String = js.native
  var serializer: typings.elasticElasticsearch.serializerMod.default = js.native
  var sniffEndpoint: String = js.native
  var sniffInterval: js.UndefOr[Double] = js.native
  var sniffOnConnectionFault: js.UndefOr[Boolean] = js.native
  var sniffOnStart: js.UndefOr[Boolean] = js.native
  var suggestCompression: js.UndefOr[Boolean] = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
}

