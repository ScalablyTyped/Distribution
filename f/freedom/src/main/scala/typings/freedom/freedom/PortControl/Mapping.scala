package typings.freedom.freedom.PortControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mapping extends js.Object {
  
  var errInfo: js.UndefOr[String] = js.native
  
  var externalIp: js.UndefOr[String] = js.native
  
  var externalPort: Double = js.native
  
  var internalIp: String = js.native
  
  var internalPort: Double = js.native
  
  var lifetime: Double = js.native
  
  var nonce: js.UndefOr[js.Array[Double]] = js.native
  
  var protocol: String = js.native
  
  var timeoutId: js.UndefOr[Double] = js.native
}
object Mapping {
  
  @scala.inline
  def apply(externalPort: Double, internalIp: String, internalPort: Double, lifetime: Double, protocol: String): Mapping = {
    val __obj = js.Dynamic.literal(externalPort = externalPort.asInstanceOf[js.Any], internalIp = internalIp.asInstanceOf[js.Any], internalPort = internalPort.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  
  @scala.inline
  implicit class MappingOps[Self <: Mapping] (val x: Self) extends AnyVal {
    
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
    def setExternalPort(value: Double): Self = this.set("externalPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalIp(value: String): Self = this.set("internalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalPort(value: Double): Self = this.set("internalPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifetime(value: Double): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrInfo(value: String): Self = this.set("errInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrInfo: Self = this.set("errInfo", js.undefined)
    
    @scala.inline
    def setExternalIp(value: String): Self = this.set("externalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalIp: Self = this.set("externalIp", js.undefined)
    
    @scala.inline
    def setNonceVarargs(value: Double*): Self = this.set("nonce", js.Array(value :_*))
    
    @scala.inline
    def setNonce(value: js.Array[Double]): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setTimeoutId(value: Double): Self = this.set("timeoutId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutId: Self = this.set("timeoutId", js.undefined)
  }
}
