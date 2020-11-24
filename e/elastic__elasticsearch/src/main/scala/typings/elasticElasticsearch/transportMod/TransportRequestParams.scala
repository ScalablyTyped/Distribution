package typings.elasticElasticsearch.transportMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransportRequestParams extends js.Object {
  
  var body: js.UndefOr[RequestBody[Record[String, _]]] = js.native
  
  var bulkBody: js.UndefOr[RequestNDBody[js.Array[Record[String, _]]]] = js.native
  
  var method: String = js.native
  
  var path: String = js.native
  
  var querystring: js.UndefOr[(Record[String, _]) | String] = js.native
}
object TransportRequestParams {
  
  @scala.inline
  def apply(method: String, path: String): TransportRequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportRequestParams]
  }
  
  @scala.inline
  implicit class TransportRequestParamsOps[Self <: TransportRequestParams] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: RequestBody[Record[String, _]]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBulkBodyVarargs(value: ((Record[String, js.Any]) | String)*): Self = this.set("bulkBody", js.Array(value :_*))
    
    @scala.inline
    def setBulkBody(value: RequestNDBody[js.Array[Record[String, _]]]): Self = this.set("bulkBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkBody: Self = this.set("bulkBody", js.undefined)
    
    @scala.inline
    def setQuerystring(value: (Record[String, _]) | String): Self = this.set("querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuerystring: Self = this.set("querystring", js.undefined)
  }
}
