package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apikey extends js.Object {
  var api_key: String
  var id: String
}

object Apikey {
  @scala.inline
  def apply(api_key: String, id: String): Apikey = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apikey]
  }
}

