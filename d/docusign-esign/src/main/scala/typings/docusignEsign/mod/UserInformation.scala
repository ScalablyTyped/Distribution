package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInformation extends js.Object {
  
  /**
    * Access code provided to the user to activate the account.
    */
  var activationAccessCode: js.UndefOr[String] = js.native
  
  /**
    * The name of the user's company.
    */
  var company: js.UndefOr[String] = js.native
  
  /**
    * object representing the user's custom Connect configuration.
    */
  var connectConfigurations: js.UndefOr[js.Array[ConnectUserObject]] = js.native
  
  /**
    * The three-letter code for the user's country.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the item was created.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  
  /**
    * The name/value pair information for the user custom setting.
    */
  var customSettings: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
  
  /**
    * The default account ID associated with the user.
    */
  var defaultAccountId: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  /**
    * Boolean value that specifies whether the user is enabled for updates from DocuSign Connect.
    */
  var enableConnectForUser: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The user's first name.
    * Maximum Length: 50 characters.
    */
  var firstName: js.UndefOr[String] = js.native
  
  /**
    * A complex element containing up to four Question/Answer pairs for forgotten password information.
    */
  var forgottenPasswordInfo: js.UndefOr[
    /* A complex element that has up to four Question/Answer pairs for forgotten password information. */ ForgottenPasswordInformation
  ] = js.native
  
  /**
    * A list of the group information for groups to add the user to.
    * Use [UserGroups::listGroups](https://developers.docusign.com/esign-rest-api/reference/UserGroups/Groups/list) to get information about groups.
    *
    * When setting a user's group, only the `groupId` is required.
    *
    */
  var groupList: js.UndefOr[js.Array[/* This object contains information about a group. */ Group]] = js.native
  
  /**
    * Specifies the email for the signing host. It is a Required element for In Person Signers recipient Type.
    * Maximum Length: 100 characters.
    */
  var homeAddress: js.UndefOr[/* Contains address information. */ AddressInformation] = js.native
  
  /**
    * The URI for retrieving the image of the user's initials.
    */
  var initialsImageUri: js.UndefOr[String] = js.native
  
  /**
    * Determines if the feature set is actively set as part of the plan.
    */
  var isAdmin: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, National Association of Realtors (NAR) signature logos are enabled for the user.
    */
  var isNAREnabled: js.UndefOr[String] = js.native
  
  /**
    * The user's job title.
    */
  var jobTitle: js.UndefOr[String] = js.native
  
  /**
    * The date and time when the user last logged in to the system.
    */
  var lastLogin: js.UndefOr[String] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  /**
    * Boolean value that indicates whether the user is currently logged in or not.
    */
  var loginStatus: js.UndefOr[String] = js.native
  
  /**
    * The user's middle name.
    * Limit: 50 characters.
    */
  var middleName: js.UndefOr[String] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * If password expiration is enabled, the date-time when the user's password expires.
    */
  var passwordExpiration: js.UndefOr[String] = js.native
  
  /**
    * The ID of the permission profile. Possible values include:
    *
    * - `2301416` (for the `DocuSign Viewer` profile)
    * - `2301415` (for the `DocuSign Sender` profile)
    * - `2301414` (for the `Account Administrator` profile)
    *
    * In addition, any custom permission profiles associated with your account will have an automatically generated `permissionProfileId`.
    */
  var permissionProfileId: js.UndefOr[String] = js.native
  
  /**
    * The name of the account permission profile.
    *
    * Example: `Account Administrator`
    */
  var permissionProfileName: js.UndefOr[String] = js.native
  
  /**
    * The URL for retrieving the user's profile image.
    */
  var profileImageUri: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, specifies that an activation email be sent to the user.
    */
  var sendActivationEmail: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, specifies that an additional activation email be sent if user's log on fails before the account is activated.
    */
  var sendActivationOnInvalidLogin: js.UndefOr[String] = js.native
  
  /**
    * An endpoint URI that you can use to retrieve the user's signature image.
    */
  var signatureImageUri: js.UndefOr[String] = js.native
  
  var subscribe: js.UndefOr[String] = js.native
  
  /**
    * The suffix for the user's name, such as Jr, IV, PhD, etc.
    *
    * Limit: 50 characters.
    */
  var suffixName: js.UndefOr[String] = js.native
  
  /**
    * The title of the user.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the user was added to the account.
    */
  var userAddedToAccountDateTime: js.UndefOr[String] = js.native
  
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
    * The date and time that the user's profile was last modified.
    */
  var userProfileLastModifiedDate: js.UndefOr[String] = js.native
  
  /**
    * The collection of settings representing the actions a user can perform. See [userSettingsInformation]
    * (https://developers.docusign.com/esign-rest-api/reference/Users/Users/get#userSettingsInformation) for available settings.
    */
  var userSettings: js.UndefOr[UserSettingsInformation] = js.native
  
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
  
  var workAddress: js.UndefOr[/* Contains address information. */ AddressInformation] = js.native
}
object UserInformation {
  
  @scala.inline
  def apply(): UserInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInformation]
  }
  
  @scala.inline
  implicit class UserInformationOps[Self <: UserInformation] (val x: Self) extends AnyVal {
    
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
    def setActivationAccessCode(value: String): Self = this.set("activationAccessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationAccessCode: Self = this.set("activationAccessCode", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setConnectConfigurationsVarargs(value: ConnectUserObject*): Self = this.set("connectConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setConnectConfigurations(value: js.Array[ConnectUserObject]): Self = this.set("connectConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectConfigurations: Self = this.set("connectConfigurations", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCustomSettingsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("customSettings", js.Array(value :_*))
    
    @scala.inline
    def setCustomSettings(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("customSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSettings: Self = this.set("customSettings", js.undefined)
    
    @scala.inline
    def setDefaultAccountId(value: String): Self = this.set("defaultAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAccountId: Self = this.set("defaultAccountId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEnableConnectForUser(value: String): Self = this.set("enableConnectForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableConnectForUser: Self = this.set("enableConnectForUser", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setForgottenPasswordInfo(
      value: /* A complex element that has up to four Question/Answer pairs for forgotten password information. */ ForgottenPasswordInformation
    ): Self = this.set("forgottenPasswordInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordInfo: Self = this.set("forgottenPasswordInfo", js.undefined)
    
    @scala.inline
    def setGroupListVarargs(value: (/* This object contains information about a group. */ Group)*): Self = this.set("groupList", js.Array(value :_*))
    
    @scala.inline
    def setGroupList(value: js.Array[/* This object contains information about a group. */ Group]): Self = this.set("groupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupList: Self = this.set("groupList", js.undefined)
    
    @scala.inline
    def setHomeAddress(value: /* Contains address information. */ AddressInformation): Self = this.set("homeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddress: Self = this.set("homeAddress", js.undefined)
    
    @scala.inline
    def setInitialsImageUri(value: String): Self = this.set("initialsImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialsImageUri: Self = this.set("initialsImageUri", js.undefined)
    
    @scala.inline
    def setIsAdmin(value: String): Self = this.set("isAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAdmin: Self = this.set("isAdmin", js.undefined)
    
    @scala.inline
    def setIsNAREnabled(value: String): Self = this.set("isNAREnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNAREnabled: Self = this.set("isNAREnabled", js.undefined)
    
    @scala.inline
    def setJobTitle(value: String): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    
    @scala.inline
    def setLastLogin(value: String): Self = this.set("lastLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastLogin: Self = this.set("lastLogin", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setLoginStatus(value: String): Self = this.set("loginStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginStatus: Self = this.set("loginStatus", js.undefined)
    
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPasswordExpiration(value: String): Self = this.set("passwordExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordExpiration: Self = this.set("passwordExpiration", js.undefined)
    
    @scala.inline
    def setPermissionProfileId(value: String): Self = this.set("permissionProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionProfileId: Self = this.set("permissionProfileId", js.undefined)
    
    @scala.inline
    def setPermissionProfileName(value: String): Self = this.set("permissionProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionProfileName: Self = this.set("permissionProfileName", js.undefined)
    
    @scala.inline
    def setProfileImageUri(value: String): Self = this.set("profileImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileImageUri: Self = this.set("profileImageUri", js.undefined)
    
    @scala.inline
    def setSendActivationEmail(value: String): Self = this.set("sendActivationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendActivationEmail: Self = this.set("sendActivationEmail", js.undefined)
    
    @scala.inline
    def setSendActivationOnInvalidLogin(value: String): Self = this.set("sendActivationOnInvalidLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendActivationOnInvalidLogin: Self = this.set("sendActivationOnInvalidLogin", js.undefined)
    
    @scala.inline
    def setSignatureImageUri(value: String): Self = this.set("signatureImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureImageUri: Self = this.set("signatureImageUri", js.undefined)
    
    @scala.inline
    def setSubscribe(value: String): Self = this.set("subscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
    
    @scala.inline
    def setSuffixName(value: String): Self = this.set("suffixName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffixName: Self = this.set("suffixName", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUserAddedToAccountDateTime(value: String): Self = this.set("userAddedToAccountDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAddedToAccountDateTime: Self = this.set("userAddedToAccountDateTime", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    
    @scala.inline
    def setUserProfileLastModifiedDate(value: String): Self = this.set("userProfileLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfileLastModifiedDate: Self = this.set("userProfileLastModifiedDate", js.undefined)
    
    @scala.inline
    def setUserSettings(value: UserSettingsInformation): Self = this.set("userSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSettings: Self = this.set("userSettings", js.undefined)
    
    @scala.inline
    def setUserStatus(value: String): Self = this.set("userStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStatus: Self = this.set("userStatus", js.undefined)
    
    @scala.inline
    def setUserType(value: String): Self = this.set("userType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserType: Self = this.set("userType", js.undefined)
    
    @scala.inline
    def setWorkAddress(value: /* Contains address information. */ AddressInformation): Self = this.set("workAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddress: Self = this.set("workAddress", js.undefined)
  }
}
