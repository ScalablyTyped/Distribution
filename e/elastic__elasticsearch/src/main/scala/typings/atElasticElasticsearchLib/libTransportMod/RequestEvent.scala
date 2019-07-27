package typings
package atElasticElasticsearchLib.libTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestEvent[T, C] extends js.Object {
  var body: T
  var headers: anyObject | scala.Null
  var meta: atElasticElasticsearchLib.Anon_Aborted[C]
  var statusCode: scala.Double | scala.Null
  var warnings: js.Array[java.lang.String] | scala.Null
}

object RequestEvent {
  @scala.inline
  def apply[T, C](
    body: T,
    meta: atElasticElasticsearchLib.Anon_Aborted[C],
    headers: anyObject = null,
    statusCode: scala.Int | scala.Double = null,
    warnings: js.Array[java.lang.String] = null
  ): RequestEvent[T, C] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], meta = meta)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[RequestEvent[T, C]]
  }
}

