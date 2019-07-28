package typings.atElasticElasticsearch.libErrorsMod

import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch/lib/errors", "ConnectionError")
@js.native
class ConnectionError protected () extends ElasticsearchClientError {
  def this(message: String, meta: ApiResponse[_, _]) = this()
  var meta: ApiResponse[_, _] = js.native
}

