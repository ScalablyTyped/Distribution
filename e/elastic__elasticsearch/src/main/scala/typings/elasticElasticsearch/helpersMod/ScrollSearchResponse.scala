package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Aborted
import typings.elasticElasticsearch.transportMod.RequestEvent
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSearchResponse[TDocument, TResponse, TContext] extends RequestEvent[TResponse, TContext] {
  var documents: js.Array[TDocument]
  def clear(): js.Promise[Unit]
}

object ScrollSearchResponse {
  @scala.inline
  def apply[TDocument, TResponse, TContext](
    body: TResponse,
    clear: () => js.Promise[Unit],
    documents: js.Array[TDocument],
    meta: Aborted[TContext],
    headers: Record[String, _] = null,
    statusCode: Double = null.asInstanceOf[Double],
    warnings: js.Array[String] = null
  ): ScrollSearchResponse[TDocument, TResponse, TContext] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), documents = documents.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSearchResponse[TDocument, TResponse, TContext]]
  }
}

