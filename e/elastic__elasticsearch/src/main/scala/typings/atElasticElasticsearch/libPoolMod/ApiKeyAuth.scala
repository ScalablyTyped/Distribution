package typings.atElasticElasticsearch.libPoolMod

import typings.atElasticElasticsearch.Anon_Apikey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyAuth extends js.Object {
  var apiKey: String | Anon_Apikey
}

object ApiKeyAuth {
  @scala.inline
  def apply(apiKey: String | Anon_Apikey): ApiKeyAuth = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApiKeyAuth]
  }
}

