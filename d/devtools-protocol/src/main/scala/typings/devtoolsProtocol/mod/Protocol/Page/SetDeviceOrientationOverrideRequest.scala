package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDeviceOrientationOverrideRequest extends js.Object {
  
  /**
    * Mock alpha
    */
  var alpha: Double = js.native
  
  /**
    * Mock beta
    */
  var beta: Double = js.native
  
  /**
    * Mock gamma
    */
  var gamma: Double = js.native
}
object SetDeviceOrientationOverrideRequest {
  
  @scala.inline
  def apply(alpha: Double, beta: Double, gamma: Double): SetDeviceOrientationOverrideRequest = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDeviceOrientationOverrideRequest]
  }
  
  @scala.inline
  implicit class SetDeviceOrientationOverrideRequestOps[Self <: SetDeviceOrientationOverrideRequest] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamma(value: Double): Self = this.set("gamma", value.asInstanceOf[js.Any])
  }
}
