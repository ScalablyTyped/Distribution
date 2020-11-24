package typings.elasticElasticsearch.connectionMod

import typings.node.Buffer
import typings.node.httpMod.ClientRequestArgs
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions extends ClientRequestArgs {
  
  var asStream: js.UndefOr[Boolean] = js.native
  
  var body: js.UndefOr[String | Buffer | Readable | Null] = js.native
  
  var querystring: js.UndefOr[String] = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String | Buffer | Readable): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setQuerystring(value: String): Self = this.set("querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuerystring: Self = this.set("querystring", js.undefined)
  }
}
