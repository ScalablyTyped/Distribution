package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInfo extends StObject {
  
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
  implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    @scala.inline
    def setActivationAccessCode(value: String): Self = StObject.set(x, "activationAccessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationAccessCodeUndefined: Self = StObject.set(x, "activationAccessCode", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setLoginStatus(value: String): Self = StObject.set(x, "loginStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginStatusUndefined: Self = StObject.set(x, "loginStatus", js.undefined)
    
    @scala.inline
    def setMembershipId(value: String): Self = StObject.set(x, "membershipId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipIdUndefined: Self = StObject.set(x, "membershipId", js.undefined)
    
    @scala.inline
    def setSendActivationEmail(value: String): Self = StObject.set(x, "sendActivationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendActivationEmailUndefined: Self = StObject.set(x, "sendActivationEmail", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    @scala.inline
    def setUserStatus(value: String): Self = StObject.set(x, "userStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStatusUndefined: Self = StObject.set(x, "userStatus", js.undefined)
    
    @scala.inline
    def setUserType(value: String): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypeUndefined: Self = StObject.set(x, "userType", js.undefined)
  }
}
