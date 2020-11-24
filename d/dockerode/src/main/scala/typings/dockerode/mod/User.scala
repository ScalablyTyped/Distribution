package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  var GID: Double = js.native
  
  var UID: Double = js.native
}
object User {
  
  @scala.inline
  def apply(GID: Double, UID: Double): User = {
    val __obj = js.Dynamic.literal(GID = GID.asInstanceOf[js.Any], UID = UID.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setGID(value: Double): Self = this.set("GID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUID(value: Double): Self = this.set("UID", value.asInstanceOf[js.Any])
  }
}
