package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserProfiles extends StObject {
  
  /**
    * The user's address.
    */
  var address: js.UndefOr[/* Contains address information. */ AddressInformation] = js.undefined
  
  /**
    * Indicates the authentication methods that the user uses. These properties cannot be modified by the PUT operation.
    */
  var authenticationMethods: js.UndefOr[
    js.Array[
      /* Contains information about the method used for authentication. */ AuthenticationMethod
    ]
  ] = js.undefined
  
  /**
    * The name of the user's company.
    */
  var companyName: js.UndefOr[String] = js.undefined
  
  /**
    *  When set to **true**, the user's company and title information display on the ID card.
    */
  var displayOrganizationInfo: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user's address and phone number display on the ID card.
    */
  var displayPersonalInfo: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user's ID card can be viewed from signed documents and envelope history.
    */
  var displayProfile: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the user's usage information displays on the ID card.
    */
  var displayUsageHistory: js.UndefOr[String] = js.undefined
  
  /**
    * The URL for retrieving the user's profile image.
    */
  var profileImageUri: js.UndefOr[String] = js.undefined
  
  /**
    * The user's job title.
    *
    * Limit: 100 characters.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * A complex element consisting of:
    *
    * - `lastSentDateTime`: The date and time the user last sent an envelope.
    * - `lastSignedDateTime`: The date and time the user last signed an envelope.
    * - `sentCount`: The number of envelopes the user has sent.
    * - `signedCount`: The number of envelopes the user has signed.
    *
    */
  var usageHistory: js.UndefOr[UsageHistory] = js.undefined
  
  /**
    * Detailed information about the user.
    */
  var userDetails: js.UndefOr[UserInformation] = js.undefined
  
  /**
    * The date and time that the user's profile was last modified.
    */
  var userProfileLastModifiedDate: js.UndefOr[String] = js.undefined
}
object UserProfiles {
  
  inline def apply(): UserProfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserProfiles] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: /* Contains address information. */ AddressInformation): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAuthenticationMethods(
      value: js.Array[
          /* Contains information about the method used for authentication. */ AuthenticationMethod
        ]
    ): Self = StObject.set(x, "authenticationMethods", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationMethodsUndefined: Self = StObject.set(x, "authenticationMethods", js.undefined)
    
    inline def setAuthenticationMethodsVarargs(
      value: (/* Contains information about the method used for authentication. */ AuthenticationMethod)*
    ): Self = StObject.set(x, "authenticationMethods", js.Array(value*))
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    inline def setDisplayOrganizationInfo(value: String): Self = StObject.set(x, "displayOrganizationInfo", value.asInstanceOf[js.Any])
    
    inline def setDisplayOrganizationInfoUndefined: Self = StObject.set(x, "displayOrganizationInfo", js.undefined)
    
    inline def setDisplayPersonalInfo(value: String): Self = StObject.set(x, "displayPersonalInfo", value.asInstanceOf[js.Any])
    
    inline def setDisplayPersonalInfoUndefined: Self = StObject.set(x, "displayPersonalInfo", js.undefined)
    
    inline def setDisplayProfile(value: String): Self = StObject.set(x, "displayProfile", value.asInstanceOf[js.Any])
    
    inline def setDisplayProfileUndefined: Self = StObject.set(x, "displayProfile", js.undefined)
    
    inline def setDisplayUsageHistory(value: String): Self = StObject.set(x, "displayUsageHistory", value.asInstanceOf[js.Any])
    
    inline def setDisplayUsageHistoryUndefined: Self = StObject.set(x, "displayUsageHistory", js.undefined)
    
    inline def setProfileImageUri(value: String): Self = StObject.set(x, "profileImageUri", value.asInstanceOf[js.Any])
    
    inline def setProfileImageUriUndefined: Self = StObject.set(x, "profileImageUri", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUsageHistory(value: UsageHistory): Self = StObject.set(x, "usageHistory", value.asInstanceOf[js.Any])
    
    inline def setUsageHistoryUndefined: Self = StObject.set(x, "usageHistory", js.undefined)
    
    inline def setUserDetails(value: UserInformation): Self = StObject.set(x, "userDetails", value.asInstanceOf[js.Any])
    
    inline def setUserDetailsUndefined: Self = StObject.set(x, "userDetails", js.undefined)
    
    inline def setUserProfileLastModifiedDate(value: String): Self = StObject.set(x, "userProfileLastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setUserProfileLastModifiedDateUndefined: Self = StObject.set(x, "userProfileLastModifiedDate", js.undefined)
  }
}
