package typings.atElasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apikey extends js.Object {
  var api_key: String
  var id: String
}

object Anon_Apikey {
  @scala.inline
  def apply(api_key: String, id: String): Anon_Apikey = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Apikey]
  }
}

