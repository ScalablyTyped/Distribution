package typings.expressSimpleLocale.mod.expressServeStaticCoreAugmentingMod

import typings.expressSimpleLocale.mod.ShortLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  var userLocale: ShortLocale = js.native
}
object Request {
  
  @scala.inline
  def apply(userLocale: ShortLocale): Request = {
    val __obj = js.Dynamic.literal(userLocale = userLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setUserLocale(value: ShortLocale): Self = this.set("userLocale", value.asInstanceOf[js.Any])
  }
}
