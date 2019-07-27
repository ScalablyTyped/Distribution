package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdOptions extends js.Object {
  var id: js.Any
  var options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  var params: atElasticElasticsearchLib.libTransportMod.TransportRequestParams
}

object Anon_IdOptions {
  @scala.inline
  def apply(
    id: js.Any,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    params: atElasticElasticsearchLib.libTransportMod.TransportRequestParams
  ): Anon_IdOptions = {
    val __obj = js.Dynamic.literal(id = id, options = options, params = params)
  
    __obj.asInstanceOf[Anon_IdOptions]
  }
}

