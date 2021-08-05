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
  
  inline def apply(): NewUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUser]
  }
  
  extension [Self <: NewUser](x: Self) {
    
    inline def setApiPassword(value: String): Self = StObject.set(x, "apiPassword", value.asInstanceOf[js.Any])
    
    inline def setApiPasswordUndefined: Self = StObject.set(x, "apiPassword", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setPermissionProfileId(value: String): Self = StObject.set(x, "permissionProfileId", value.asInstanceOf[js.Any])
    
    inline def setPermissionProfileIdUndefined: Self = StObject.set(x, "permissionProfileId", js.undefined)
    
    inline def setPermissionProfileName(value: String): Self = StObject.set(x, "permissionProfileName", value.asInstanceOf[js.Any])
    
    inline def setPermissionProfileNameUndefined: Self = StObject.set(x, "permissionProfileName", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setUserStatus(value: String): Self = StObject.set(x, "userStatus", value.asInstanceOf[js.Any])
    
    inline def setUserStatusUndefined: Self = StObject.set(x, "userStatus", js.undefined)
  }
}
