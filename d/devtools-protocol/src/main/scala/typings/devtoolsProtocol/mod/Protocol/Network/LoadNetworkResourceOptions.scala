package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadNetworkResourceOptions extends js.Object {
  
  var disableCache: Boolean = js.native
  
  var includeCredentials: Boolean = js.native
}
object LoadNetworkResourceOptions {
  
  @scala.inline
  def apply(disableCache: Boolean, includeCredentials: Boolean): LoadNetworkResourceOptions = {
    val __obj = js.Dynamic.literal(disableCache = disableCache.asInstanceOf[js.Any], includeCredentials = includeCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourceOptions]
  }
  
  @scala.inline
  implicit class LoadNetworkResourceOptionsOps[Self <: LoadNetworkResourceOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableCache(value: Boolean): Self = this.set("disableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCredentials(value: Boolean): Self = this.set("includeCredentials", value.asInstanceOf[js.Any])
  }
}
