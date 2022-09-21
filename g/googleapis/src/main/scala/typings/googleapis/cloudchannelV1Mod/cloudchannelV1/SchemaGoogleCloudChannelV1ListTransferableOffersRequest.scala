package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListTransferableOffersRequest extends StObject {
  
  /**
    * Customer's Cloud Identity ID
    */
  var cloudIdentityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A reseller should create a customer and use the resource name of that customer here.
    */
  var customerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The BCP-47 language code. For example, "en-US". The response will localize in the corresponding language code, if specified. The default value is "en-US".
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 offers. The maximum value is 1000; the server will coerce values above 1000.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A token for a page of results other than the first page. Obtained using ListTransferableOffersResponse.next_page_token of the previous CloudChannelService.ListTransferableOffers call.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The SKU to look up Offers for.
    */
  var sku: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ListTransferableOffersRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListTransferableOffersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListTransferableOffersRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListTransferableOffersRequest](x: Self) {
    
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
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuNull: Self = StObject.set(x, "sku", null)
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
