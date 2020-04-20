package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.AnonApikey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyAuth extends js.Object {
  var apiKey: String | AnonApikey
}

object ApiKeyAuth {
  @scala.inline
  def apply(apiKey: String | AnonApikey): ApiKeyAuth = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAuth]
  }
}

