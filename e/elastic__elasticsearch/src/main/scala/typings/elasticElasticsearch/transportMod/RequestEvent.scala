package typings.elasticElasticsearch.transportMod

import typings.elasticElasticsearch.AnonAborted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestEvent[T, C] extends js.Object {
  var body: T
  var headers: anyObject | Null
  var meta: AnonAborted[C]
  var statusCode: Double | Null
  var warnings: js.Array[String] | Null
}

object RequestEvent {
  @scala.inline
  def apply[T, C](
    body: T,
    meta: AnonAborted[C],
    headers: anyObject = null,
    statusCode: Int | Double = null,
    warnings: js.Array[String] = null
  ): RequestEvent[T, C] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEvent[T, C]]
  }
}

