package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginAccount extends StObject {
  
  /**
    * The account ID associated with the envelope.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The GUID associated with the account ID.
    */
  var accountIdGuid: js.UndefOr[String] = js.undefined
  
  /**
    * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located,
    * and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The email address for the user.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * This value is true if this is the default account for the user, otherwise false is returned.
    */
  var isDefault: js.UndefOr[String] = js.undefined
  
  /**
    * A list of settings on the acccount that indicate what features are available.
    */
  var loginAccountSettings: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.undefined
  
  /**
    * A list of user-level settings that indicate what user-specific features are available.
    */
  var loginUserSettings: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.undefined
  
  /**
    * The name associated with the account.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An optional descirption of the site that hosts the account.
    */
  var siteDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    * `userId` can represent another user whom the Administrator is accessing.
    *
    */
  var userId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of this user as defined by the account.
    */
  var userName: js.UndefOr[String] = js.undefined
}
object LoginAccount {
  
  @scala.inline
  def apply(): LoginAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginAccount]
  }
  
  @scala.inline
  implicit class LoginAccountMutableBuilder[Self <: LoginAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdGuid(value: String): Self = StObject.set(x, "accountIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdGuidUndefined: Self = StObject.set(x, "accountIdGuid", js.undefined)
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setIsDefault(value: String): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setLoginAccountSettings(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "loginAccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginAccountSettingsUndefined: Self = StObject.set(x, "loginAccountSettings", js.undefined)
    
    @scala.inline
    def setLoginAccountSettingsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "loginAccountSettings", js.Array(value :_*))
    
    @scala.inline
    def setLoginUserSettings(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "loginUserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUserSettingsUndefined: Self = StObject.set(x, "loginUserSettings", js.undefined)
    
    @scala.inline
    def setLoginUserSettingsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "loginUserSettings", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSiteDescription(value: String): Self = StObject.set(x, "siteDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteDescriptionUndefined: Self = StObject.set(x, "siteDescription", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
