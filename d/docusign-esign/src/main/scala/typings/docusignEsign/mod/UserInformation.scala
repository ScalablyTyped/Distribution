package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInformation extends StObject {
  
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
  implicit class UserInformationMutableBuilder[Self <: UserInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationAccessCode(value: String): Self = StObject.set(x, "activationAccessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationAccessCodeUndefined: Self = StObject.set(x, "activationAccessCode", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setConnectConfigurations(value: js.Array[ConnectUserObject]): Self = StObject.set(x, "connectConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectConfigurationsUndefined: Self = StObject.set(x, "connectConfigurations", js.undefined)
    
    @scala.inline
    def setConnectConfigurationsVarargs(value: ConnectUserObject*): Self = StObject.set(x, "connectConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setCustomSettings(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "customSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSettingsUndefined: Self = StObject.set(x, "customSettings", js.undefined)
    
    @scala.inline
    def setCustomSettingsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "customSettings", js.Array(value :_*))
    
    @scala.inline
    def setDefaultAccountId(value: String): Self = StObject.set(x, "defaultAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAccountIdUndefined: Self = StObject.set(x, "defaultAccountId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEnableConnectForUser(value: String): Self = StObject.set(x, "enableConnectForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableConnectForUserUndefined: Self = StObject.set(x, "enableConnectForUser", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setForgottenPasswordInfo(
      value: /* A complex element that has up to four Question/Answer pairs for forgotten password information. */ ForgottenPasswordInformation
    ): Self = StObject.set(x, "forgottenPasswordInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgottenPasswordInfoUndefined: Self = StObject.set(x, "forgottenPasswordInfo", js.undefined)
    
    @scala.inline
    def setGroupList(value: js.Array[/* This object contains information about a group. */ Group]): Self = StObject.set(x, "groupList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupListUndefined: Self = StObject.set(x, "groupList", js.undefined)
    
    @scala.inline
    def setGroupListVarargs(value: (/* This object contains information about a group. */ Group)*): Self = StObject.set(x, "groupList", js.Array(value :_*))
    
    @scala.inline
    def setHomeAddress(value: /* Contains address information. */ AddressInformation): Self = StObject.set(x, "homeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressUndefined: Self = StObject.set(x, "homeAddress", js.undefined)
    
    @scala.inline
    def setInitialsImageUri(value: String): Self = StObject.set(x, "initialsImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialsImageUriUndefined: Self = StObject.set(x, "initialsImageUri", js.undefined)
    
    @scala.inline
    def setIsAdmin(value: String): Self = StObject.set(x, "isAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdminUndefined: Self = StObject.set(x, "isAdmin", js.undefined)
    
    @scala.inline
    def setIsNAREnabled(value: String): Self = StObject.set(x, "isNAREnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNAREnabledUndefined: Self = StObject.set(x, "isNAREnabled", js.undefined)
    
    @scala.inline
    def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    @scala.inline
    def setLastLogin(value: String): Self = StObject.set(x, "lastLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLoginUndefined: Self = StObject.set(x, "lastLogin", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setLoginStatus(value: String): Self = StObject.set(x, "loginStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginStatusUndefined: Self = StObject.set(x, "loginStatus", js.undefined)
    
    @scala.inline
    def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpiration(value: String): Self = StObject.set(x, "passwordExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpirationUndefined: Self = StObject.set(x, "passwordExpiration", js.undefined)
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPermissionProfileId(value: String): Self = StObject.set(x, "permissionProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionProfileIdUndefined: Self = StObject.set(x, "permissionProfileId", js.undefined)
    
    @scala.inline
    def setPermissionProfileName(value: String): Self = StObject.set(x, "permissionProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionProfileNameUndefined: Self = StObject.set(x, "permissionProfileName", js.undefined)
    
    @scala.inline
    def setProfileImageUri(value: String): Self = StObject.set(x, "profileImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileImageUriUndefined: Self = StObject.set(x, "profileImageUri", js.undefined)
    
    @scala.inline
    def setSendActivationEmail(value: String): Self = StObject.set(x, "sendActivationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendActivationEmailUndefined: Self = StObject.set(x, "sendActivationEmail", js.undefined)
    
    @scala.inline
    def setSendActivationOnInvalidLogin(value: String): Self = StObject.set(x, "sendActivationOnInvalidLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendActivationOnInvalidLoginUndefined: Self = StObject.set(x, "sendActivationOnInvalidLogin", js.undefined)
    
    @scala.inline
    def setSignatureImageUri(value: String): Self = StObject.set(x, "signatureImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureImageUriUndefined: Self = StObject.set(x, "signatureImageUri", js.undefined)
    
    @scala.inline
    def setSubscribe(value: String): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    
    @scala.inline
    def setSuffixName(value: String): Self = StObject.set(x, "suffixName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixNameUndefined: Self = StObject.set(x, "suffixName", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUserAddedToAccountDateTime(value: String): Self = StObject.set(x, "userAddedToAccountDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAddedToAccountDateTimeUndefined: Self = StObject.set(x, "userAddedToAccountDateTime", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    @scala.inline
    def setUserProfileLastModifiedDate(value: String): Self = StObject.set(x, "userProfileLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileLastModifiedDateUndefined: Self = StObject.set(x, "userProfileLastModifiedDate", js.undefined)
    
    @scala.inline
    def setUserSettings(value: UserSettingsInformation): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettingsUndefined: Self = StObject.set(x, "userSettings", js.undefined)
    
    @scala.inline
    def setUserStatus(value: String): Self = StObject.set(x, "userStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStatusUndefined: Self = StObject.set(x, "userStatus", js.undefined)
    
    @scala.inline
    def setUserType(value: String): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypeUndefined: Self = StObject.set(x, "userType", js.undefined)
    
    @scala.inline
    def setWorkAddress(value: /* Contains address information. */ AddressInformation): Self = StObject.set(x, "workAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressUndefined: Self = StObject.set(x, "workAddress", js.undefined)
  }
}
