package typings
package atElasticElasticsearchLib.libTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportOptions extends js.Object {
  var compression: js.UndefOr[atElasticElasticsearchLib.atElasticElasticsearchLibStrings.gzip] = js.native
  var connectionPool: atElasticElasticsearchLib.libConnectionPoolMod.default = js.native
  @JSName("emit")
  var emit_Original: emitFn with noopFn = js.native
  var generateRequestId: js.UndefOr[generateRequestIdFn] = js.native
  var headers: js.UndefOr[anyObject] = js.native
  var maxRetries: scala.Double = js.native
  var name: java.lang.String = js.native
  var nodeFilter: js.UndefOr[nodeFilterFn] = js.native
  var nodeSelector: js.UndefOr[java.lang.String | nodeSelectorFn] = js.native
  var requestTimeout: scala.Double | java.lang.String = js.native
  var serializer: atElasticElasticsearchLib.libSerializerMod.default = js.native
  var sniffEndpoint: java.lang.String = js.native
  var sniffInterval: scala.Double = js.native
  var sniffOnConnectionFault: scala.Boolean = js.native
  var sniffOnStart: scala.Boolean = js.native
  var suggestCompression: scala.Boolean = js.native
  def emit(args: js.Any*): scala.Unit = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
}

