package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostIp extends js.Object {
  
  var HostIp: String = js.native
  
  var HostPort: String = js.native
}
object HostIp {
  
  @scala.inline
  def apply(HostIp: String, HostPort: String): HostIp = {
    val __obj = js.Dynamic.literal(HostIp = HostIp.asInstanceOf[js.Any], HostPort = HostPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostIp]
  }
  
  @scala.inline
  implicit class HostIpOps[Self <: HostIp] (val x: Self) extends AnyVal {
    
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
    def setHostIp(value: String): Self = this.set("HostIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPort(value: String): Self = this.set("HostPort", value.asInstanceOf[js.Any])
  }
}
