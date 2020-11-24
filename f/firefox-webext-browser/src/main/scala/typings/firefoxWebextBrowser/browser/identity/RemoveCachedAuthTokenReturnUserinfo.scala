package typings.firefoxWebextBrowser.browser.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveCachedAuthTokenReturnUserinfo extends js.Object {
  
  var email: String = js.native
  
  var id: String = js.native
}
object RemoveCachedAuthTokenReturnUserinfo {
  
  @scala.inline
  def apply(email: String, id: String): RemoveCachedAuthTokenReturnUserinfo = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCachedAuthTokenReturnUserinfo]
  }
  
  @scala.inline
  implicit class RemoveCachedAuthTokenReturnUserinfoOps[Self <: RemoveCachedAuthTokenReturnUserinfo] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
