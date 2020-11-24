package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPasswordRules extends js.Object {
  
  /**
    * Contains details about the password rules for the user.
    */
  var passwordRules: js.UndefOr[AccountPasswordRules] = js.native
  
  /**
    * The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    * `userId` can represent another user whom the Administrator is accessing.
    *
    */
  var userId: js.UndefOr[String] = js.native
}
object UserPasswordRules {
  
  @scala.inline
  def apply(): UserPasswordRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPasswordRules]
  }
  
  @scala.inline
  implicit class UserPasswordRulesOps[Self <: UserPasswordRules] (val x: Self) extends AnyVal {
    
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
    def setPasswordRules(value: AccountPasswordRules): Self = this.set("passwordRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRules: Self = this.set("passwordRules", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
