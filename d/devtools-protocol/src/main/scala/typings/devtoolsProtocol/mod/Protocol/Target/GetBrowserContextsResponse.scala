package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBrowserContextsResponse extends js.Object {
  
  /**
    * An array of browser context ids.
    */
  var browserContextIds: js.Array[BrowserContextID] = js.native
}
object GetBrowserContextsResponse {
  
  @scala.inline
  def apply(browserContextIds: js.Array[BrowserContextID]): GetBrowserContextsResponse = {
    val __obj = js.Dynamic.literal(browserContextIds = browserContextIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrowserContextsResponse]
  }
  
  @scala.inline
  implicit class GetBrowserContextsResponseOps[Self <: GetBrowserContextsResponse] (val x: Self) extends AnyVal {
    
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
    def setBrowserContextIdsVarargs(value: BrowserContextID*): Self = this.set("browserContextIds", js.Array(value :_*))
    
    @scala.inline
    def setBrowserContextIds(value: js.Array[BrowserContextID]): Self = this.set("browserContextIds", value.asInstanceOf[js.Any])
  }
}
