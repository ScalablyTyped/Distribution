package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSocialIdResult extends js.Object {
  
  /**
    * Contains properties that map a DocuSign user to a social account such as Facebook or Yahoo.
    */
  var socialAccountInformation: js.UndefOr[js.Array[SocialAccountInformation]] = js.native
  
  /**
    * The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    * `userId` can represent another user whom the Administrator is accessing.
    *
    */
  var userId: js.UndefOr[String] = js.native
}
object UserSocialIdResult {
  
  @scala.inline
  def apply(): UserSocialIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSocialIdResult]
  }
  
  @scala.inline
  implicit class UserSocialIdResultOps[Self <: UserSocialIdResult] (val x: Self) extends AnyVal {
    
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
    def setSocialAccountInformationVarargs(value: SocialAccountInformation*): Self = this.set("socialAccountInformation", js.Array(value :_*))
    
    @scala.inline
    def setSocialAccountInformation(value: js.Array[SocialAccountInformation]): Self = this.set("socialAccountInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialAccountInformation: Self = this.set("socialAccountInformation", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
