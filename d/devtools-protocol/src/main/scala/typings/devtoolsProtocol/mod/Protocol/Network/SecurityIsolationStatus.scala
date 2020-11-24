package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityIsolationStatus extends js.Object {
  
  var coep: CrossOriginEmbedderPolicyStatus = js.native
  
  var coop: CrossOriginOpenerPolicyStatus = js.native
}
object SecurityIsolationStatus {
  
  @scala.inline
  def apply(coep: CrossOriginEmbedderPolicyStatus, coop: CrossOriginOpenerPolicyStatus): SecurityIsolationStatus = {
    val __obj = js.Dynamic.literal(coep = coep.asInstanceOf[js.Any], coop = coop.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityIsolationStatus]
  }
  
  @scala.inline
  implicit class SecurityIsolationStatusOps[Self <: SecurityIsolationStatus] (val x: Self) extends AnyVal {
    
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
    def setCoep(value: CrossOriginEmbedderPolicyStatus): Self = this.set("coep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoop(value: CrossOriginOpenerPolicyStatus): Self = this.set("coop", value.asInstanceOf[js.Any])
  }
}
