package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.anon.Apikey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyAuth extends js.Object {
  var apiKey: String | Apikey
}

object ApiKeyAuth {
  @scala.inline
  def apply(apiKey: String | Apikey): ApiKeyAuth = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAuth]
  }
}

