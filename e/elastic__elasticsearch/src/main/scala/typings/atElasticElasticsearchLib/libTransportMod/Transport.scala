package typings
package atElasticElasticsearchLib.libTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  var _isSniffing: scala.Boolean = js.native
  var _nextSniff: scala.Double = js.native
  var _sniffEnabled: scala.Boolean = js.native
  var compression: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.gzip | atElasticElasticsearchLib.atElasticElasticsearchLibNumbers.`false` = js.native
  var connectionPool: atElasticElasticsearchLib.libConnectionPoolMod.default = js.native
  @JSName("emit")
  var emit_Original: emitFn with noopFn = js.native
  var maxRetries: scala.Double = js.native
  var requestTimeout: scala.Double = js.native
  var serializer: atElasticElasticsearchLib.libSerializerMod.default = js.native
  var sniffEndpoint: java.lang.String = js.native
  var sniffInterval: scala.Double = js.native
  var sniffOnConnectionFault: scala.Boolean = js.native
  var suggestCompression: scala.Boolean = js.native
  def emit(args: js.Any*): scala.Unit = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  def getConnection(opts: TransportGetConnectionOptions): atElasticElasticsearchLib.libConnectionMod.default | scala.Null = js.native
  def request(params: TransportRequestParams): js.Promise[ApiResponse[_, _]] = js.native
  def request(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def request(
    params: TransportRequestParams,
    options: TransportRequestOptions,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ ApiResponse[_, _], scala.Unit]
  ): TransportRequestCallback = js.native
  @JSName("request")
  def request_TransportRequestCallback(params: TransportRequestParams): TransportRequestCallback = js.native
  @JSName("request")
  def request_TransportRequestCallback(params: TransportRequestParams, options: TransportRequestOptions): TransportRequestCallback = js.native
  def sniff(): scala.Unit = js.native
  def sniff(opts: TransportSniffOptions): scala.Unit = js.native
  def sniff(opts: TransportSniffOptions, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
}

