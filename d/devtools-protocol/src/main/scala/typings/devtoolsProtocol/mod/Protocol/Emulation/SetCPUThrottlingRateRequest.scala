package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCPUThrottlingRateRequest extends StObject {
  
  /**
    * Throttling rate as a slowdown factor (1 is no throttle, 2 is 2x slowdown, etc).
    */
  var rate: Double
}
object SetCPUThrottlingRateRequest {
  
  @scala.inline
  def apply(rate: Double): SetCPUThrottlingRateRequest = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCPUThrottlingRateRequest]
  }
  
  @scala.inline
  implicit class SetCPUThrottlingRateRequestMutableBuilder[Self <: SetCPUThrottlingRateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
  }
}
