package typings.atElasticElasticsearch.libTransportMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.gzip
import typings.atElasticElasticsearch.libPoolMod.CloudConnectionPool
import typings.atElasticElasticsearch.libPoolMod.ConnectionPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportOptions extends js.Object {
  var compression: js.UndefOr[gzip] = js.native
  var connectionPool: ConnectionPool | CloudConnectionPool = js.native
  @JSName("emit")
  var emit_Original: emitFn with noopFn = js.native
  var generateRequestId: js.UndefOr[generateRequestIdFn] = js.native
  var headers: js.UndefOr[anyObject] = js.native
  var maxRetries: Double = js.native
  var name: String = js.native
  var nodeFilter: js.UndefOr[nodeFilterFn] = js.native
  var nodeSelector: js.UndefOr[String | nodeSelectorFn] = js.native
  var requestTimeout: Double | String = js.native
  var serializer: typings.atElasticElasticsearch.libSerializerMod.default = js.native
  var sniffEndpoint: String = js.native
  var sniffInterval: Double = js.native
  var sniffOnConnectionFault: Boolean = js.native
  var sniffOnStart: Boolean = js.native
  var suggestCompression: Boolean = js.native
  def emit(args: js.Any*): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
}

