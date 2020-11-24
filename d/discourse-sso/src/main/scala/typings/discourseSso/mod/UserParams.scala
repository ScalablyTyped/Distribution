package typings.discourseSso.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserParams extends js.Object {
  
  var add_groups: js.UndefOr[js.Array[String]] = js.native
  
  var admin: js.UndefOr[Boolean] = js.native
  
  var avatar_url: js.UndefOr[String] = js.native
  
  var email: String = js.native
  
  var external_id: String = js.native
  
  var moderator: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nonce: String = js.native
  
  var remove_groups: js.UndefOr[js.Array[String]] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object UserParams {
  
  @scala.inline
  def apply(email: String, external_id: String, nonce: String): UserParams = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserParams]
  }
  
  @scala.inline
  implicit class UserParamsOps[Self <: UserParams] (val x: Self) extends AnyVal {
    
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
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd_groupsVarargs(value: String*): Self = this.set("add_groups", js.Array(value :_*))
    
    @scala.inline
    def setAdd_groups(value: js.Array[String]): Self = this.set("add_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd_groups: Self = this.set("add_groups", js.undefined)
    
    @scala.inline
    def setAdmin(value: Boolean): Self = this.set("admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdmin: Self = this.set("admin", js.undefined)
    
    @scala.inline
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar_url: Self = this.set("avatar_url", js.undefined)
    
    @scala.inline
    def setModerator(value: Boolean): Self = this.set("moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModerator: Self = this.set("moderator", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRemove_groupsVarargs(value: String*): Self = this.set("remove_groups", js.Array(value :_*))
    
    @scala.inline
    def setRemove_groups(value: js.Array[String]): Self = this.set("remove_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove_groups: Self = this.set("remove_groups", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
