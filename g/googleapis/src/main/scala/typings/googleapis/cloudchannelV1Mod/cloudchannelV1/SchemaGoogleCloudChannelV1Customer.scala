package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Customer extends StObject {
  
  /**
    * Secondary contact email. You need to provide an alternate email to create different domains if a primary contact email already exists. Users will receive a notification with credentials when you create an admin.google.com account. Secondary emails are also recovery email addresses. Alternate emails are optional when you create Team customers.
    */
  var alternateEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud Identity ID of the customer's channel partner. Populated only if a channel partner exists for this customer.
    */
  var channelPartnerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The customer's Cloud Identity ID if the customer has a Cloud Identity resource.
    */
  var cloudIdentityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Cloud Identity information for the customer. Populated only if a Cloud Identity account exists for this customer.
    */
  var cloudIdentityInfo: js.UndefOr[SchemaGoogleCloudChannelV1CloudIdentityInfo] = js.undefined
  
  /**
    * Output only. Time when the customer was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The customer's primary domain. Must match the primary contact email's domain.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of the customer. Format: accounts/{account_id\}/customers/{customer_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Name of the organization that the customer entity represents.
    */
  var orgDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The organization address for the customer. To enforce US laws and embargoes, we require a region and zip code. You must provide valid addresses for every customer. To set the customer's language, use the Customer-level language code.
    */
  var orgPostalAddress: js.UndefOr[SchemaGoogleTypePostalAddress] = js.undefined
  
  /**
    * Primary contact info.
    */
  var primaryContactInfo: js.UndefOr[SchemaGoogleCloudChannelV1ContactInfo] = js.undefined
  
  /**
    * Output only. Time when the customer was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1Customer {
  
  inline def apply(): SchemaGoogleCloudChannelV1Customer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Customer]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Customer](x: Self) {
    
    inline def setAlternateEmail(value: String): Self = StObject.set(x, "alternateEmail", value.asInstanceOf[js.Any])
    
    inline def setAlternateEmailNull: Self = StObject.set(x, "alternateEmail", null)
    
    inline def setAlternateEmailUndefined: Self = StObject.set(x, "alternateEmail", js.undefined)
    
    inline def setChannelPartnerId(value: String): Self = StObject.set(x, "channelPartnerId", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerIdNull: Self = StObject.set(x, "channelPartnerId", null)
    
    inline def setChannelPartnerIdUndefined: Self = StObject.set(x, "channelPartnerId", js.undefined)
    
    inline def setCloudIdentityId(value: String): Self = StObject.set(x, "cloudIdentityId", value.asInstanceOf[js.Any])
    
    inline def setCloudIdentityIdNull: Self = StObject.set(x, "cloudIdentityId", null)
    
    inline def setCloudIdentityIdUndefined: Self = StObject.set(x, "cloudIdentityId", js.undefined)
    
    inline def setCloudIdentityInfo(value: SchemaGoogleCloudChannelV1CloudIdentityInfo): Self = StObject.set(x, "cloudIdentityInfo", value.asInstanceOf[js.Any])
    
    inline def setCloudIdentityInfoUndefined: Self = StObject.set(x, "cloudIdentityInfo", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrgDisplayName(value: String): Self = StObject.set(x, "orgDisplayName", value.asInstanceOf[js.Any])
    
    inline def setOrgDisplayNameNull: Self = StObject.set(x, "orgDisplayName", null)
    
    inline def setOrgDisplayNameUndefined: Self = StObject.set(x, "orgDisplayName", js.undefined)
    
    inline def setOrgPostalAddress(value: SchemaGoogleTypePostalAddress): Self = StObject.set(x, "orgPostalAddress", value.asInstanceOf[js.Any])
    
    inline def setOrgPostalAddressUndefined: Self = StObject.set(x, "orgPostalAddress", js.undefined)
    
    inline def setPrimaryContactInfo(value: SchemaGoogleCloudChannelV1ContactInfo): Self = StObject.set(x, "primaryContactInfo", value.asInstanceOf[js.Any])
    
    inline def setPrimaryContactInfoUndefined: Self = StObject.set(x, "primaryContactInfo", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
