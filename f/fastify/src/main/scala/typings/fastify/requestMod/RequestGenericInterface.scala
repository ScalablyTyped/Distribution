package typings.fastify.requestMod

import typings.fastify.utilsMod.RequestBodyDefault
import typings.fastify.utilsMod.RequestHeadersDefault
import typings.fastify.utilsMod.RequestParamsDefault
import typings.fastify.utilsMod.RequestQuerystringDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestGenericInterface extends js.Object {
  
  var Body: js.UndefOr[RequestBodyDefault] = js.native
  
  var Headers: js.UndefOr[RequestHeadersDefault] = js.native
  
  var Params: js.UndefOr[RequestParamsDefault] = js.native
  
  var Querystring: js.UndefOr[RequestQuerystringDefault] = js.native
}
object RequestGenericInterface {
  
  @scala.inline
  def apply(): RequestGenericInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestGenericInterface]
  }
  
  @scala.inline
  implicit class RequestGenericInterfaceOps[Self <: RequestGenericInterface] (val x: Self) extends AnyVal {
    
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
    def setBody(value: RequestBodyDefault): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setHeaders(value: RequestHeadersDefault): Self = this.set("Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("Headers", js.undefined)
    
    @scala.inline
    def setParams(value: RequestParamsDefault): Self = this.set("Params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("Params", js.undefined)
    
    @scala.inline
    def setQuerystring(value: RequestQuerystringDefault): Self = this.set("Querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuerystring: Self = this.set("Querystring", js.undefined)
  }
}
