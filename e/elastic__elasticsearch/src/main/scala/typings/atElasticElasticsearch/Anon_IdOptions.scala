package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import typings.atElasticElasticsearch.libTransportMod.TransportRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdOptions extends js.Object {
  var id: js.Any
  var options: TransportRequestOptions
  var params: TransportRequestParams
}

object Anon_IdOptions {
  @scala.inline
  def apply(id: js.Any, options: TransportRequestOptions, params: TransportRequestParams): Anon_IdOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IdOptions]
  }
}

