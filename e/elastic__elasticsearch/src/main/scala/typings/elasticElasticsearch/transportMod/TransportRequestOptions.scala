package typings.elasticElasticsearch.transportMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransportRequestOptions extends js.Object {
  
  var asStream: js.UndefOr[Boolean] = js.native
  
  var compression: js.UndefOr[gzip] = js.native
  
  var context: js.UndefOr[Context] = js.native
  
  var headers: js.UndefOr[Record[String, _]] = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var ignore: js.UndefOr[js.Array[Double]] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var opaqueId: js.UndefOr[String] = js.native
  
  var querystring: js.UndefOr[Record[String, _]] = js.native
  
  var requestTimeout: js.UndefOr[Double | String] = js.native
  
  var warnings: js.UndefOr[js.Array[String]] = js.native
}
object TransportRequestOptions {
  
  @scala.inline
  def apply(): TransportRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportRequestOptions]
  }
  
  @scala.inline
  implicit class TransportRequestOptionsOps[Self <: TransportRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setAsStream(value: Boolean): Self = this.set("asStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsStream: Self = this.set("asStream", js.undefined)
    
    @scala.inline
    def setCompression(value: gzip): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    
    @scala.inline
    def setHeaders(value: Record[String, _]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: Double*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[Double]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setOpaqueId(value: String): Self = this.set("opaqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpaqueId: Self = this.set("opaqueId", js.undefined)
    
    @scala.inline
    def setQuerystring(value: Record[String, _]): Self = this.set("querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuerystring: Self = this.set("querystring", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double | String): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
