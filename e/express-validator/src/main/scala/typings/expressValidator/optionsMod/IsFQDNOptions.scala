package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFQDNOptions extends js.Object {
  
  var allow_trailing_dot: js.UndefOr[Boolean] = js.native
  
  var allow_underscores: js.UndefOr[Boolean] = js.native
  
  var require_tld: js.UndefOr[Boolean] = js.native
}
object IsFQDNOptions {
  
  @scala.inline
  def apply(): IsFQDNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFQDNOptions]
  }
  
  @scala.inline
  implicit class IsFQDNOptionsOps[Self <: IsFQDNOptions] (val x: Self) extends AnyVal {
    
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
    def setAllow_trailing_dot(value: Boolean): Self = this.set("allow_trailing_dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_trailing_dot: Self = this.set("allow_trailing_dot", js.undefined)
    
    @scala.inline
    def setAllow_underscores(value: Boolean): Self = this.set("allow_underscores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_underscores: Self = this.set("allow_underscores", js.undefined)
    
    @scala.inline
    def setRequire_tld(value: Boolean): Self = this.set("require_tld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire_tld: Self = this.set("require_tld", js.undefined)
  }
}
