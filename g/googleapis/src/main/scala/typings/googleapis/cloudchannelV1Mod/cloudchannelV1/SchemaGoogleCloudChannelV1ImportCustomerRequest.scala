package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ImportCustomerRequest extends StObject {
  
  /**
    * Optional. The super admin of the resold customer generates this token to authorize a reseller to access their Cloud Identity and purchase entitlements on their behalf. You can omit this token after authorization. See https://support.google.com/a/answer/7643790 for more details.
    */
  var authToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Cloud Identity ID of a channel partner who will be the direct reseller for the customer's order. This field is required for 2-tier transfer scenarios and can be provided via the request Parent binding as well.
    */
  var channelPartnerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Customer's Cloud Identity ID
    */
  var cloudIdentityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the customer that will receive imported Cloud Identity information. Format: accounts/{account_id\}/customers/{customer_id\}
    */
  var customer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Customer domain.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Choose to overwrite an existing customer if found. This must be set to true if there is an existing customer with a conflicting region code or domain.
    */
  var overwriteIfExists: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ImportCustomerRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1ImportCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ImportCustomerRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ImportCustomerRequest](x: Self) {
    
    inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenNull: Self = StObject.set(x, "authToken", null)
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    inline def setChannelPartnerId(value: String): Self = StObject.set(x, "channelPartnerId", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerIdNull: Self = StObject.set(x, "channelPartnerId", null)
    
    inline def setChannelPartnerIdUndefined: Self = StObject.set(x, "channelPartnerId", js.undefined)
    
    inline def setCloudIdentityId(value: String): Self = StObject.set(x, "cloudIdentityId", value.asInstanceOf[js.Any])
    
    inline def setCloudIdentityIdNull: Self = StObject.set(x, "cloudIdentityId", null)
    
    inline def setCloudIdentityIdUndefined: Self = StObject.set(x, "cloudIdentityId", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setOverwriteIfExists(value: Boolean): Self = StObject.set(x, "overwriteIfExists", value.asInstanceOf[js.Any])
    
    inline def setOverwriteIfExistsNull: Self = StObject.set(x, "overwriteIfExists", null)
    
    inline def setOverwriteIfExistsUndefined: Self = StObject.set(x, "overwriteIfExists", js.undefined)
  }
}
