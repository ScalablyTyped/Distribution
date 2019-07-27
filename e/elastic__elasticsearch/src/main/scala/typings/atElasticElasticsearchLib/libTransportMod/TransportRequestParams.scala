package typings
package atElasticElasticsearchLib.libTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportRequestParams extends js.Object {
  var body: js.UndefOr[anyObject] = js.undefined
  var bulkBody: js.UndefOr[anyObject] = js.undefined
  var method: java.lang.String
  var path: java.lang.String
  var querystring: js.UndefOr[anyObject] = js.undefined
}

object TransportRequestParams {
  @scala.inline
  def apply(
    method: java.lang.String,
    path: java.lang.String,
    body: anyObject = null,
    bulkBody: anyObject = null,
    querystring: anyObject = null
  ): TransportRequestParams = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    if (body != null) __obj.updateDynamic("body")(body)
    if (bulkBody != null) __obj.updateDynamic("bulkBody")(bulkBody)
    if (querystring != null) __obj.updateDynamic("querystring")(querystring)
    __obj.asInstanceOf[TransportRequestParams]
  }
}

