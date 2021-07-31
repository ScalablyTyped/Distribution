package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewUser extends StObject {
  
  /**
    * Contains a token that can be used for authentication in API calls instead of using the user name and password.
    */
  var apiPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the item was created.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The ID of the permission profile. Possible values include:
    *
    * - `2301416` (for the `DocuSign Viewer` profile)
    * - `2301415` (for the `DocuSign Sender` profile)
    * - `2301414` (for the `Account Administrator` profile)
    *
    * In addition, any custom permission profiles associated with your account will have an automatically generated `permissionProfileId`.
    */
  var permissionProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the account permission profile.
    *
    * Example: `Account Administrator`
    */
  var permissionProfileName: js.UndefOr[String] = js.undefined
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the user ID for the new user.
    */
  var userId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user.
    */
  var userName: js.UndefOr[String] = js.undefined
  
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
  var userStatus: js.UndefOr[String] = js.undefined
}
object NewUser {
  
  @scala.inline
  def apply(): NewUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUser]
  }
  
  @scala.inline
  implicit class NewUserMutableBuilder[Self <: NewUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiPassword(value: String): Self = StObject.set(x, "apiPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiPasswordUndefined: Self = StObject.set(x, "apiPassword", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
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
    def setPermissionProfileId(value: String): Self = StObject.set(x, "permissionProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionProfileIdUndefined: Self = StObject.set(x, "permissionProfileId", js.undefined)
    
    @scala.inline
    def setPermissionProfileName(value: String): Self = StObject.set(x, "permissionProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionProfileNameUndefined: Self = StObject.set(x, "permissionProfileName", js.undefined)
    
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
  }
}
