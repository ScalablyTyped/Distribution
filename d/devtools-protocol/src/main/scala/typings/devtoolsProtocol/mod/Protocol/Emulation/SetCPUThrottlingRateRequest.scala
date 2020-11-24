package typings.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetCPUThrottlingRateRequest extends js.Object {
  
  /**
    * Throttling rate as a slowdown factor (1 is no throttle, 2 is 2x slowdown, etc).
    */
  var rate: Double = js.native
}
object SetCPUThrottlingRateRequest {
  
  @scala.inline
  def apply(rate: Double): SetCPUThrottlingRateRequest = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCPUThrottlingRateRequest]
  }
  
  @scala.inline
  implicit class SetCPUThrottlingRateRequestOps[Self <: SetCPUThrottlingRateRequest] (val x: Self) extends AnyVal {
    
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
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
  }
}
