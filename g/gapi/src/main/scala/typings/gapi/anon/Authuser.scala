package typings.gapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authuser extends js.Object {
  
  var authuser: String = js.native
}
object Authuser {
  
  @scala.inline
  def apply(authuser: String): Authuser = {
    val __obj = js.Dynamic.literal(authuser = authuser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authuser]
  }
  
  @scala.inline
  implicit class AuthuserOps[Self <: Authuser] (val x: Self) extends AnyVal {
    
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
    def setAuthuser(value: String): Self = this.set("authuser", value.asInstanceOf[js.Any])
  }
}
