package typings.atElasticElasticsearch.libTransportMod

import typings.atElasticElasticsearch.atElasticElasticsearchNumbers.`false`
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.gzip
import typings.atElasticElasticsearch.libPoolMod.CloudConnectionPool
import typings.atElasticElasticsearch.libPoolMod.ConnectionPool
import typings.std.Error
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
  @JSName("emit")
  var emit_Original: emitFn with noopFn = js.native
  var maxRetries: Double = js.native
  var opaqueIdPrefix: String | Null = js.native
  var requestTimeout: Double = js.native
  var serializer: typings.atElasticElasticsearch.libSerializerMod.default = js.native
  var sniffEndpoint: String = js.native
  var sniffInterval: Double = js.native
  var sniffOnConnectionFault: Boolean = js.native
  var suggestCompression: Boolean = js.native
  def emit(args: js.Any*): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def getConnection(opts: TransportGetConnectionOptions): typings.atElasticElasticsearch.libConnectionMod.default | Null = js.native
  def request(params: TransportRequestParams): TransportRequestCallback = js.native
  def request(params: TransportRequestParams, options: TransportRequestOptions): TransportRequestCallback = js.native
  def request(
    params: TransportRequestParams,
    options: TransportRequestOptions,
    callback: js.Function2[/* err */ Error | Null, /* result */ ApiResponse[_, _], Unit]
  ): TransportRequestCallback = js.native
  @JSName("request")
  def request_Promise(params: TransportRequestParams): js.Promise[ApiResponse[_, _]] = js.native
  @JSName("request")
  def request_Promise(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def sniff(): Unit = js.native
  def sniff(opts: TransportSniffOptions): Unit = js.native
  def sniff(opts: TransportSniffOptions, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

