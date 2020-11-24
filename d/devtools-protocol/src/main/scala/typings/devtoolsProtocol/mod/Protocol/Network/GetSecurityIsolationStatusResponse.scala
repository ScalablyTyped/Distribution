package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecurityIsolationStatusResponse extends js.Object {
  
  var status: SecurityIsolationStatus = js.native
}
object GetSecurityIsolationStatusResponse {
  
  @scala.inline
  def apply(status: SecurityIsolationStatus): GetSecurityIsolationStatusResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityIsolationStatusResponse]
  }
  
  @scala.inline
  implicit class GetSecurityIsolationStatusResponseOps[Self <: GetSecurityIsolationStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: SecurityIsolationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
