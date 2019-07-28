package typings.atElasticElasticsearch.libErrorsMod

import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch/lib/errors", "ResponseError")
@js.native
class ResponseError protected () extends ElasticsearchClientError {
  def this(meta: ApiResponse[_, _]) = this()
  var body: js.Any = js.native
  var headers: js.Any = js.native
  var meta: ApiResponse[_, _] = js.native
  var statusCode: Double = js.native
}

