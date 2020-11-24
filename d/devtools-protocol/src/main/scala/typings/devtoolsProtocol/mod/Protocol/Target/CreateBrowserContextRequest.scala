package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBrowserContextRequest extends js.Object {
  
  /**
    * If specified, disposes this context when debugging session disconnects.
    */
  var disposeOnDetach: js.UndefOr[Boolean] = js.native
  
  /**
    * Proxy bypass list, similar to the one passed to --proxy-bypass-list
    */
  var proxyBypassList: js.UndefOr[String] = js.native
  
  /**
    * Proxy server, similar to the one passed to --proxy-server
    */
  var proxyServer: js.UndefOr[String] = js.native
}
object CreateBrowserContextRequest {
  
  @scala.inline
  def apply(): CreateBrowserContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBrowserContextRequest]
  }
  
  @scala.inline
  implicit class CreateBrowserContextRequestOps[Self <: CreateBrowserContextRequest] (val x: Self) extends AnyVal {
    
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
    def setDisposeOnDetach(value: Boolean): Self = this.set("disposeOnDetach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposeOnDetach: Self = this.set("disposeOnDetach", js.undefined)
    
    @scala.inline
    def setProxyBypassList(value: String): Self = this.set("proxyBypassList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyBypassList: Self = this.set("proxyBypassList", js.undefined)
    
    @scala.inline
    def setProxyServer(value: String): Self = this.set("proxyServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyServer: Self = this.set("proxyServer", js.undefined)
  }
}
