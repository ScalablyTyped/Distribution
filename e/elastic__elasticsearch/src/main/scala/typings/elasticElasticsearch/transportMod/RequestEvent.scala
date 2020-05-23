package typings.elasticElasticsearch.transportMod

import typings.elasticElasticsearch.anon.Aborted
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestEvent[TResponse, TContext] extends js.Object {
  var body: TResponse
  var headers: (Record[String, _]) | Null
  var meta: Aborted[TContext]
  var statusCode: Double | Null
  var warnings: js.Array[String] | Null
}

object RequestEvent {
  @scala.inline
  def apply[TResponse, TContext](
    body: TResponse,
    meta: Aborted[TContext],
    headers: Record[String, _] = null,
    statusCode: Double = null.asInstanceOf[Double],
    warnings: js.Array[String] = null
  ): RequestEvent[TResponse, TContext] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEvent[TResponse, TContext]]
  }
}

