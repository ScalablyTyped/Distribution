package typings.expressUaMiddleware.mod

import typings.expressUaMiddleware.anon.Model
import typings.expressUaMiddleware.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgent extends js.Object {
  
  val browser: Name = js.native
  
  val device: Model = js.native
  
  val os: Name = js.native
  
  val raw: String = js.native
}
object UserAgent {
  
  @scala.inline
  def apply(browser: Name, device: Model, os: Name, raw: String): UserAgent = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgent]
  }
  
  @scala.inline
  implicit class UserAgentOps[Self <: UserAgent] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: Name): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Model): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: Name): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
}
