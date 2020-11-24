package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserProfile extends js.Object {
  
  /**
    * The user's address.
    */
  var address: js.UndefOr[/* Contains address information. */ AddressInformation] = js.native
  
  /**
    * Indicates the authentication methods that the user uses. These properties cannot be modified by the PUT operation.
    */
  var authenticationMethods: js.UndefOr[
    js.Array[
      /* Contains information about the method used for authentication. */ AuthenticationMethod
    ]
  ] = js.native
  
  /**
    * The name of the user's company.
    */
  var companyName: js.UndefOr[String] = js.native
  
  /**
    *  When set to **true**, the user's company and title information display on the ID card.
    */
  var displayOrganizationInfo: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user's address and phone number display on the ID card.
    */
  var displayPersonalInfo: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user's ID card can be viewed from signed documents and envelope history.
    */
  var displayProfile: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user's usage information displays on the ID card.
    */
  var displayUsageHistory: js.UndefOr[String] = js.native
  
  /**
    * The URL for retrieving the user's profile image.
    */
  var profileImageUri: js.UndefOr[String] = js.native
  
  /**
    * The title of the user.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * A complex element consisting of:
    *
    * - `lastSentDateTime`: The date and time the user last sent an envelope.
    * - `lastSignedDateTime`: The date and time the user last signed an envelope.
    * - `sentCount`: The number of envelopes the user has sent.
    * - `signedCount`: The number of envelopes the user has signed.
    *
    */
  var usageHistory: js.UndefOr[UsageHistory] = js.native
  
  var userDetails: js.UndefOr[UserInformation] = js.native
  
  /**
    * The date and time that the user's profile was last modified.
    */
  var userProfileLastModifiedDate: js.UndefOr[String] = js.native
}
object UserProfile {
  
  @scala.inline
  def apply(): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfile]
  }
  
  @scala.inline
  implicit class UserProfileOps[Self <: UserProfile] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: /* Contains address information. */ AddressInformation): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAuthenticationMethodsVarargs(
      value: (/* Contains information about the method used for authentication. */ AuthenticationMethod)*
    ): Self = this.set("authenticationMethods", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticationMethods(
      value: js.Array[
          /* Contains information about the method used for authentication. */ AuthenticationMethod
        ]
    ): Self = this.set("authenticationMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationMethods: Self = this.set("authenticationMethods", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setDisplayOrganizationInfo(value: String): Self = this.set("displayOrganizationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOrganizationInfo: Self = this.set("displayOrganizationInfo", js.undefined)
    
    @scala.inline
    def setDisplayPersonalInfo(value: String): Self = this.set("displayPersonalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayPersonalInfo: Self = this.set("displayPersonalInfo", js.undefined)
    
    @scala.inline
    def setDisplayProfile(value: String): Self = this.set("displayProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayProfile: Self = this.set("displayProfile", js.undefined)
    
    @scala.inline
    def setDisplayUsageHistory(value: String): Self = this.set("displayUsageHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayUsageHistory: Self = this.set("displayUsageHistory", js.undefined)
    
    @scala.inline
    def setProfileImageUri(value: String): Self = this.set("profileImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileImageUri: Self = this.set("profileImageUri", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUsageHistory(value: UsageHistory): Self = this.set("usageHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageHistory: Self = this.set("usageHistory", js.undefined)
    
    @scala.inline
    def setUserDetails(value: UserInformation): Self = this.set("userDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDetails: Self = this.set("userDetails", js.undefined)
    
    @scala.inline
    def setUserProfileLastModifiedDate(value: String): Self = this.set("userProfileLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfileLastModifiedDate: Self = this.set("userProfileLastModifiedDate", js.undefined)
  }
}
