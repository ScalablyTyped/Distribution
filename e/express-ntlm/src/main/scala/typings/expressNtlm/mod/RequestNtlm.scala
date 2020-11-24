package typings.expressNtlm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestNtlm extends js.Object {
  
  var DomainName: js.UndefOr[String] = js.native
  
  var UserName: js.UndefOr[String] = js.native
  
  var Workstation: js.UndefOr[String] = js.native
}
object RequestNtlm {
  
  @scala.inline
  def apply(): RequestNtlm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestNtlm]
  }
  
  @scala.inline
  implicit class RequestNtlmOps[Self <: RequestNtlm] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: String): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
    
    @scala.inline
    def setWorkstation(value: String): Self = this.set("Workstation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkstation: Self = this.set("Workstation", js.undefined)
  }
}
