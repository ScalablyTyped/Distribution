package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Aborted
import typings.elasticElasticsearch.transportMod.RequestEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSearchResponse[TDocument, TResponse, TContext] extends RequestEvent[TResponse, TContext] {
  var documents: js.Array[TDocument] = js.native
  def clear(): js.Promise[Unit] = js.native
}

object ScrollSearchResponse {
  @scala.inline
  def apply[TDocument, TResponse, TContext](
    body: TResponse,
    clear: () => js.Promise[Unit],
    documents: js.Array[TDocument],
    meta: Aborted[TContext]
  ): ScrollSearchResponse[TDocument, TResponse, TContext] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), documents = documents.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSearchResponse[TDocument, TResponse, TContext]]
  }
  @scala.inline
  implicit class ScrollSearchResponseOps[Self <: ScrollSearchResponse[_, _, _], TDocument, TResponse, TContext] (val x: Self with (ScrollSearchResponse[TDocument, TResponse, TContext])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: () => js.Promise[Unit]): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setDocumentsVarargs(value: TDocument*): Self = this.set("documents", js.Array(value :_*))
    @scala.inline
    def setDocuments(value: js.Array[TDocument]): Self = this.set("documents", value.asInstanceOf[js.Any])
  }
  
}

