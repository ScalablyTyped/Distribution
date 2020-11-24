package typings.globalAgent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyAgentConfigurationType extends js.Object {
  
  val HTTPS_PROXY: String | Null = js.native
  
  val HTTP_PROXY: String | Null = js.native
  
  val NO_PROXY: String | Null = js.native
}
object ProxyAgentConfigurationType {
  
  @scala.inline
  def apply(): ProxyAgentConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyAgentConfigurationType]
  }
  
  @scala.inline
  implicit class ProxyAgentConfigurationTypeOps[Self <: ProxyAgentConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setHTTPS_PROXY(value: String): Self = this.set("HTTPS_PROXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTTPS_PROXYNull: Self = this.set("HTTPS_PROXY", null)
    
    @scala.inline
    def setHTTP_PROXY(value: String): Self = this.set("HTTP_PROXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTTP_PROXYNull: Self = this.set("HTTP_PROXY", null)
    
    @scala.inline
    def setNO_PROXY(value: String): Self = this.set("NO_PROXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_PROXYNull: Self = this.set("NO_PROXY", null)
  }
}
