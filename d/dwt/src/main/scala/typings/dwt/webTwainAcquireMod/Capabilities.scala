package typings.dwt.webTwainAcquireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Capabilities extends js.Object {
  
  /**
    * Specifies how to set capabilities
    */
  var capabilities: js.Array[CapabilitySetup] = js.native
  
  /**
    * Whether to "ignore" or "fail" the request if an exception occurs. This is an overall setting that is inherited by all capabilities.
    */
  var exceptition: String = js.native
}
object Capabilities {
  
  @scala.inline
  def apply(capabilities: js.Array[CapabilitySetup], exceptition: String): Capabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], exceptition = exceptition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  
  @scala.inline
  implicit class CapabilitiesOps[Self <: Capabilities] (val x: Self) extends AnyVal {
    
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
    def setCapabilitiesVarargs(value: CapabilitySetup*): Self = this.set("capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: js.Array[CapabilitySetup]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptition(value: String): Self = this.set("exceptition", value.asInstanceOf[js.Any])
  }
}
