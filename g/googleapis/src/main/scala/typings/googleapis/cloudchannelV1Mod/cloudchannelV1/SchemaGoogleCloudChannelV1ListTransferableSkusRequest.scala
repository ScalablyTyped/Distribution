package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListTransferableSkusRequest extends StObject {
  
  /**
    * The super admin of the resold customer generates this token to authorize a reseller to access their Cloud Identity and purchase entitlements on their behalf. You can omit this token after authorization. See https://support.google.com/a/answer/7643790 for more details.
    */
  var authToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Customer's Cloud Identity ID
    */
  var cloudIdentityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A reseller is required to create a customer and use the resource name of the created customer here. Customer_name uses the format: accounts/{account_id\}/customers/{customer_id\}
    */
  var customerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The BCP-47 language code. For example, "en-US". The response will localize in the corresponding language code, if specified. The default value is "en-US". Optional.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 SKUs. The maximum value is 1000; the server will coerce values above 1000. Optional.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A token for a page of results other than the first page. Obtained using ListTransferableSkusResponse.next_page_token of the previous CloudChannelService.ListTransferableSkus call. Optional.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ListTransferableSkusRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListTransferableSkusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListTransferableSkusRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListTransferableSkusRequest](x: Self) {
    
    inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenNull: Self = StObject.set(x, "authToken", null)
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    inline def setCloudIdentityId(value: String): Self = StObject.set(x, "cloudIdentityId", value.asInstanceOf[js.Any])
    
    inline def setCloudIdentityIdNull: Self = StObject.set(x, "cloudIdentityId", null)
    
    inline def setCloudIdentityIdUndefined: Self = StObject.set(x, "cloudIdentityId", js.undefined)
    
    inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
    
    inline def setCustomerNameNull: Self = StObject.set(x, "customerName", null)
    
    inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
