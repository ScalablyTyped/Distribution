package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInfo extends js.Object {
  
  /**
    * The external account number (int) or account ID GUID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The name on the account.
    */
  var accountName: js.UndefOr[String] = js.native
  
  /**
    * Access code provided to the user to activate the account.
    */
  var activationAccessCode: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Boolean value that indicates whether the user is currently logged in or not.
    */
  var loginStatus: js.UndefOr[String] = js.native
  
  /**
    * The user's membership ID.
    */
  var membershipId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, specifies that an activation email be sent to the user.
    */
  var sendActivationEmail: js.UndefOr[String] = js.native
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.native
  
  /**
    * The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    * `userId` can represent another user whom the Administrator is accessing.
    *
    */
  var userId: js.UndefOr[String] = js.native
  
  /**
    * The name of the user.
    */
  var userName: js.UndefOr[String] = js.native
  
  /**
    * Status of the user's account. One of:
    *
    * - `ActivationRequired`
    * - `ActivationSent`
    * - `Active`
    * - `Closed`
    * - `Disabled`
    *
    */
  var userStatus: js.UndefOr[String] = js.native
  
  /**
    * The type of user, for example `CompanyUser`.
    */
  var userType: js.UndefOr[String] = js.native
}
object UserInfo {
  
  @scala.inline
  def apply(): UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInfo]
  }
  
  @scala.inline
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    
    @scala.inline
    def setActivationAccessCode(value: String): Self = this.set("activationAccessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationAccessCode: Self = this.set("activationAccessCode", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setLoginStatus(value: String): Self = this.set("loginStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginStatus: Self = this.set("loginStatus", js.undefined)
    
    @scala.inline
    def setMembershipId(value: String): Self = this.set("membershipId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipId: Self = this.set("membershipId", js.undefined)
    
    @scala.inline
    def setSendActivationEmail(value: String): Self = this.set("sendActivationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendActivationEmail: Self = this.set("sendActivationEmail", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    
    @scala.inline
    def setUserStatus(value: String): Self = this.set("userStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStatus: Self = this.set("userStatus", js.undefined)
    
    @scala.inline
    def setUserType(value: String): Self = this.set("userType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserType: Self = this.set("userType", js.undefined)
  }
}
