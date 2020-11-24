package typings.framebus.framebusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FramebusOptions extends js.Object {
  
  var channel: js.UndefOr[String] = js.native
  
  var origin: js.UndefOr[String] = js.native
  
  var verifyDomain: js.UndefOr[VerifyDomainMethod] = js.native
}
object FramebusOptions {
  
  @scala.inline
  def apply(): FramebusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FramebusOptions]
  }
  
  @scala.inline
  implicit class FramebusOptionsOps[Self <: FramebusOptions] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setVerifyDomain(value: /* domain */ String => Boolean): Self = this.set("verifyDomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVerifyDomain: Self = this.set("verifyDomain", js.undefined)
  }
}
