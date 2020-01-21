package typings.elasticElasticsearch.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportRequestParams extends js.Object {
  var body: js.UndefOr[anyObject] = js.undefined
  var bulkBody: js.UndefOr[anyObject] = js.undefined
  var method: String
  var path: String
  var querystring: js.UndefOr[anyObject] = js.undefined
}

object TransportRequestParams {
  @scala.inline
  def apply(
    method: String,
    path: String,
    body: anyObject = null,
    bulkBody: anyObject = null,
    querystring: anyObject = null
  ): TransportRequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bulkBody != null) __obj.updateDynamic("bulkBody")(bulkBody.asInstanceOf[js.Any])
    if (querystring != null) __obj.updateDynamic("querystring")(querystring.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportRequestParams]
  }
}

