package typings.dwt.dynamsoftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DWTInitialConfig extends js.Object {
  
  var Host: js.UndefOr[String] = js.native
  
  var Port: js.UndefOr[String] = js.native
  
  var SSLPort: js.UndefOr[String] = js.native
  
  var WebTwainId: String = js.native
}
object DWTInitialConfig {
  
  @scala.inline
  def apply(WebTwainId: String): DWTInitialConfig = {
    val __obj = js.Dynamic.literal(WebTwainId = WebTwainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DWTInitialConfig]
  }
  
  @scala.inline
  implicit class DWTInitialConfigOps[Self <: DWTInitialConfig] (val x: Self) extends AnyVal {
    
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
    def setWebTwainId(value: String): Self = this.set("WebTwainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("Host", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setSSLPort(value: String): Self = this.set("SSLPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSLPort: Self = this.set("SSLPort", js.undefined)
  }
}
