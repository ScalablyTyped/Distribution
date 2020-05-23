package typings.elasticElasticsearch.transportMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportRequestParams extends js.Object {
  var body: js.UndefOr[RequestBody[Record[String, _]]] = js.undefined
  var bulkBody: js.UndefOr[RequestNDBody[js.Array[Record[String, _]]]] = js.undefined
  var method: String
  var path: String
  var querystring: js.UndefOr[Record[String, _]] = js.undefined
}

object TransportRequestParams {
  @scala.inline
  def apply(
    method: String,
    path: String,
    body: RequestBody[Record[String, _]] = null,
    bulkBody: RequestNDBody[js.Array[Record[String, _]]] = null,
    querystring: Record[String, _] = null
  ): TransportRequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bulkBody != null) __obj.updateDynamic("bulkBody")(bulkBody.asInstanceOf[js.Any])
    if (querystring != null) __obj.updateDynamic("querystring")(querystring.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportRequestParams]
  }
}

