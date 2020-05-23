package typings.elasticElasticsearch.transportMod

import typings.elasticElasticsearch.elasticElasticsearchBooleans.`false`
import typings.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typings.elasticElasticsearch.poolMod.CloudConnectionPool
import typings.elasticElasticsearch.poolMod.ConnectionPool
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  var _isSniffing: Boolean = js.native
  var _nextSniff: Double = js.native
  var _sniffEnabled: Boolean = js.native
  var compression: gzip | `false` = js.native
  var connectionPool: ConnectionPool | CloudConnectionPool = js.native
  var maxRetries: Double = js.native
  var opaqueIdPrefix: String | Null = js.native
  var requestTimeout: Double = js.native
  var serializer: typings.elasticElasticsearch.serializerMod.default = js.native
  var sniffEndpoint: String = js.native
  var sniffInterval: Double = js.native
  var sniffOnConnectionFault: Boolean = js.native
  var suggestCompression: Boolean = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def getConnection(opts: TransportGetConnectionOptions): typings.elasticElasticsearch.connectionMod.default | Null = js.native
  def request(params: TransportRequestParams): js.Promise[ApiResponse[Record[String, _], _]] = js.native
  def request(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[ApiResponse[Record[String, _], _]] = js.native
  def request(
    params: TransportRequestParams,
    options: TransportRequestOptions,
    callback: js.Function2[/* err */ ApiError, /* result */ ApiResponse[Record[String, _], _], Unit]
  ): TransportRequestCallback = js.native
  @JSName("request")
  def request_TransportRequestCallback(params: TransportRequestParams): TransportRequestCallback = js.native
  @JSName("request")
  def request_TransportRequestCallback(params: TransportRequestParams, options: TransportRequestOptions): TransportRequestCallback = js.native
  def sniff(): Unit = js.native
  def sniff(opts: TransportSniffOptions): Unit = js.native
  def sniff(opts: TransportSniffOptions, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

