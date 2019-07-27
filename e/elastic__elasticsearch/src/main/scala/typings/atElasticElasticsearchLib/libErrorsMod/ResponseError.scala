package typings
package atElasticElasticsearchLib.libErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch/lib/errors", "ResponseError")
@js.native
class ResponseError protected () extends ElasticsearchClientError {
  def this(meta: atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]) = this()
  var body: js.Any = js.native
  var headers: js.Any = js.native
  var meta: atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _] = js.native
  var statusCode: scala.Double = js.native
}

