package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1CloudIdentityInfo extends StObject {
  
  /**
    * Output only. URI of Customer's Admin console dashboard.
    */
  var adminConsoleUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The alternate email.
    */
  var alternateEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CustomerType indicates verification type needed for using services.
    */
  var customerType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Edu information about the customer.
    */
  var eduData: js.UndefOr[SchemaGoogleCloudChannelV1EduData] = js.undefined
  
  /**
    * Output only. Whether the domain is verified. This field is not returned for a Customer's cloud_identity_info resource. Partners can use the domains.get() method of the Workspace SDK's Directory API, or listen to the PRIMARY_DOMAIN_VERIFIED Pub/Sub event in to track domain verification of their resolve Workspace customers.
    */
  var isDomainVerified: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Language code.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Phone number associated with the Cloud Identity.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The primary domain name.
    */
  var primaryDomain: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1CloudIdentityInfo {
  
  inline def apply(): SchemaGoogleCloudChannelV1CloudIdentityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1CloudIdentityInfo]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1CloudIdentityInfo](x: Self) {
    
    inline def setAdminConsoleUri(value: String): Self = StObject.set(x, "adminConsoleUri", value.asInstanceOf[js.Any])
    
    inline def setAdminConsoleUriNull: Self = StObject.set(x, "adminConsoleUri", null)
    
    inline def setAdminConsoleUriUndefined: Self = StObject.set(x, "adminConsoleUri", js.undefined)
    
    inline def setAlternateEmail(value: String): Self = StObject.set(x, "alternateEmail", value.asInstanceOf[js.Any])
    
    inline def setAlternateEmailNull: Self = StObject.set(x, "alternateEmail", null)
    
    inline def setAlternateEmailUndefined: Self = StObject.set(x, "alternateEmail", js.undefined)
    
    inline def setCustomerType(value: String): Self = StObject.set(x, "customerType", value.asInstanceOf[js.Any])
    
    inline def setCustomerTypeNull: Self = StObject.set(x, "customerType", null)
    
    inline def setCustomerTypeUndefined: Self = StObject.set(x, "customerType", js.undefined)
    
    inline def setEduData(value: SchemaGoogleCloudChannelV1EduData): Self = StObject.set(x, "eduData", value.asInstanceOf[js.Any])
    
    inline def setEduDataUndefined: Self = StObject.set(x, "eduData", js.undefined)
    
    inline def setIsDomainVerified(value: Boolean): Self = StObject.set(x, "isDomainVerified", value.asInstanceOf[js.Any])
    
    inline def setIsDomainVerifiedNull: Self = StObject.set(x, "isDomainVerified", null)
    
    inline def setIsDomainVerifiedUndefined: Self = StObject.set(x, "isDomainVerified", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPrimaryDomain(value: String): Self = StObject.set(x, "primaryDomain", value.asInstanceOf[js.Any])
    
    inline def setPrimaryDomainNull: Self = StObject.set(x, "primaryDomain", null)
    
    inline def setPrimaryDomainUndefined: Self = StObject.set(x, "primaryDomain", js.undefined)
  }
}
