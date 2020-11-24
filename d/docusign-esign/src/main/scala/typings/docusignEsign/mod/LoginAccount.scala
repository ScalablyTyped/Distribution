package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginAccount extends js.Object {
  
  /**
    * The account ID associated with the envelope.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The GUID associated with the account ID.
    */
  var accountIdGuid: js.UndefOr[String] = js.native
  
  /**
    * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located,
    * and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * The email address for the user.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * This value is true if this is the default account for the user, otherwise false is returned.
    */
  var isDefault: js.UndefOr[String] = js.native
  
  /**
    * A list of settings on the acccount that indicate what features are available.
    */
  var loginAccountSettings: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
  
  /**
    * A list of user-level settings that indicate what user-specific features are available.
    */
  var loginUserSettings: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
  
  /**
    * The name associated with the account.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * An optional descirption of the site that hosts the account.
    */
  var siteDescription: js.UndefOr[String] = js.native
  
  /**
    * The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    * `userId` can represent another user whom the Administrator is accessing.
    *
    */
  var userId: js.UndefOr[String] = js.native
  
  /**
    * The name of this user as defined by the account.
    */
  var userName: js.UndefOr[String] = js.native
}
object LoginAccount {
  
  @scala.inline
  def apply(): LoginAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginAccount]
  }
  
  @scala.inline
  implicit class LoginAccountOps[Self <: LoginAccount] (val x: Self) extends AnyVal {
    
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
    def setAccountIdGuid(value: String): Self = this.set("accountIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIdGuid: Self = this.set("accountIdGuid", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setIsDefault(value: String): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setLoginAccountSettingsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("loginAccountSettings", js.Array(value :_*))
    
    @scala.inline
    def setLoginAccountSettings(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("loginAccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginAccountSettings: Self = this.set("loginAccountSettings", js.undefined)
    
    @scala.inline
    def setLoginUserSettingsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("loginUserSettings", js.Array(value :_*))
    
    @scala.inline
    def setLoginUserSettings(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("loginUserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginUserSettings: Self = this.set("loginUserSettings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSiteDescription(value: String): Self = this.set("siteDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteDescription: Self = this.set("siteDescription", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
