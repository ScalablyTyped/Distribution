package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetCacheDisabledRequest extends js.Object {
  
  /**
    * Cache disabled state.
    */
  var cacheDisabled: Boolean = js.native
}
object SetCacheDisabledRequest {
  
  @scala.inline
  def apply(cacheDisabled: Boolean): SetCacheDisabledRequest = {
    val __obj = js.Dynamic.literal(cacheDisabled = cacheDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCacheDisabledRequest]
  }
  
  @scala.inline
  implicit class SetCacheDisabledRequestOps[Self <: SetCacheDisabledRequest] (val x: Self) extends AnyVal {
    
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
    def setCacheDisabled(value: Boolean): Self = this.set("cacheDisabled", value.asInstanceOf[js.Any])
  }
}
