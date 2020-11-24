package typings.elasticElasticsearch.transportMod

import typings.elasticElasticsearch.anon.Aborted
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestEvent[TResponse, TContext] extends js.Object {
  
  var body: TResponse = js.native
  
  var headers: (Record[String, _]) | Null = js.native
  
  var meta: Aborted[TContext] = js.native
  
  var statusCode: Double | Null = js.native
  
  var warnings: js.Array[String] | Null = js.native
}
object RequestEvent {
  
  @scala.inline
  def apply[TResponse, TContext](body: TResponse, meta: Aborted[TContext]): RequestEvent[TResponse, TContext] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEvent[TResponse, TContext]]
  }
  
  @scala.inline
  implicit class RequestEventOps[Self <: RequestEvent[_, _], TResponse, TContext] (val x: Self with (RequestEvent[TResponse, TContext])) extends AnyVal {
    
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
    def setBody(value: TResponse): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Aborted[TContext]): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Record[String, _]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersNull: Self = this.set("headers", null)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeNull: Self = this.set("statusCode", null)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsNull: Self = this.set("warnings", null)
  }
}
