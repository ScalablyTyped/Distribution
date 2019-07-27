package typings
package atElasticElasticsearchLib.libErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch/lib/errors", "TimeoutError")
@js.native
class TimeoutError protected () extends ElasticsearchClientError {
  def this(message: java.lang.String, meta: atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]) = this()
  var meta: atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _] = js.native
}

