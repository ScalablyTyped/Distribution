package typings.devtoolsProtocol.mod.Protocol.CacheStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestCachedResponseResponse extends js.Object {
  
  /**
    * Response read from the cache.
    */
  var response: CachedResponse = js.native
}
object RequestCachedResponseResponse {
  
  @scala.inline
  def apply(response: CachedResponse): RequestCachedResponseResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCachedResponseResponse]
  }
  
  @scala.inline
  implicit class RequestCachedResponseResponseOps[Self <: RequestCachedResponseResponse] (val x: Self) extends AnyVal {
    
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
    def setResponse(value: CachedResponse): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
