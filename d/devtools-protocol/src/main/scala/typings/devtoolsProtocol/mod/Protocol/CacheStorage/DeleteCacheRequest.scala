package typings.devtoolsProtocol.mod.Protocol.CacheStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCacheRequest extends js.Object {
  
  /**
    * Id of cache for deletion.
    */
  var cacheId: CacheId = js.native
}
object DeleteCacheRequest {
  
  @scala.inline
  def apply(cacheId: CacheId): DeleteCacheRequest = {
    val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheRequest]
  }
  
  @scala.inline
  implicit class DeleteCacheRequestOps[Self <: DeleteCacheRequest] (val x: Self) extends AnyVal {
    
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
    def setCacheId(value: CacheId): Self = this.set("cacheId", value.asInstanceOf[js.Any])
  }
}
