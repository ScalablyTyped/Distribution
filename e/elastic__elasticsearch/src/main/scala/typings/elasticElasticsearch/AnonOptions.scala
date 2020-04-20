package typings.elasticElasticsearch

import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var id: js.Any
  var options: TransportRequestOptions
  var params: TransportRequestParams
}

object AnonOptions {
  @scala.inline
  def apply(id: js.Any, options: TransportRequestOptions, params: TransportRequestParams): AnonOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

