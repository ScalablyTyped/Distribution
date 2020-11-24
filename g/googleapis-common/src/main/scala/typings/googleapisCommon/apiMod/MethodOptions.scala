package typings.googleapisCommon.apiMod

import typings.gaxios.commonMod.GaxiosOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodOptions extends GaxiosOptions {
  
  var rootUrl: js.UndefOr[String] = js.native
  
  var userAgentDirectives: js.UndefOr[js.Array[UserAgentDirective]] = js.native
}
object MethodOptions {
  
  @scala.inline
  def apply(): MethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodOptions]
  }
  
  @scala.inline
  implicit class MethodOptionsOps[Self <: MethodOptions] (val x: Self) extends AnyVal {
    
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
    def setRootUrl(value: String): Self = this.set("rootUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootUrl: Self = this.set("rootUrl", js.undefined)
    
    @scala.inline
    def setUserAgentDirectivesVarargs(value: UserAgentDirective*): Self = this.set("userAgentDirectives", js.Array(value :_*))
    
    @scala.inline
    def setUserAgentDirectives(value: js.Array[UserAgentDirective]): Self = this.set("userAgentDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgentDirectives: Self = this.set("userAgentDirectives", js.undefined)
  }
}
