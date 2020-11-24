package typings.firefoxWebextBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* networkStatus types */
@js.native
trait NetworkLinkInfo extends js.Object {
  
  /** If known, the network id or name. */
  var id: js.UndefOr[String] = js.native
  
  /** Status of the network link, if "unknown" then link is usually assumed to be "up" */
  var status: NetworkLinkInfoStatus = js.native
  
  /** If known, the type of network connection that is avialable. */
  var `type`: NetworkLinkInfoType = js.native
}
object NetworkLinkInfo {
  
  @scala.inline
  def apply(status: NetworkLinkInfoStatus, `type`: NetworkLinkInfoType): NetworkLinkInfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkLinkInfo]
  }
  
  @scala.inline
  implicit class NetworkLinkInfoOps[Self <: NetworkLinkInfo] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: NetworkLinkInfoStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NetworkLinkInfoType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
