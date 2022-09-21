package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCustomersListpurchasableskus
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Change Type for the entitlement.
    */
  @JSName("changeOfferPurchase.changeType")
  var changeOfferPurchaseDotchangeType: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the entitlement. Format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    */
  @JSName("changeOfferPurchase.entitlement")
  var changeOfferPurchaseDotentitlement: js.UndefOr[String] = js.undefined
  
  /**
    * Required. List SKUs belonging to this Product. Format: products/{product_id\}. Supports products/- to retrieve SKUs for all products.
    */
  @JSName("createEntitlementPurchase.product")
  var createEntitlementPurchaseDotproduct: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the customer to list SKUs for. Format: accounts/{account_id\}/customers/{customer_id\}.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The BCP-47 language code. For example, "en-US". The response will localize in the corresponding language code, if specified. The default value is "en-US".
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 SKUs. The maximum value is 1000; the server will coerce values above 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A token for a page of results other than the first page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsCustomersListpurchasableskus {
  
  inline def apply(): ParamsResourceAccountsCustomersListpurchasableskus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomersListpurchasableskus]
  }
  
  extension [Self <: ParamsResourceAccountsCustomersListpurchasableskus](x: Self) {
    
    inline def setChangeOfferPurchaseDotchangeType(value: String): Self = StObject.set(x, "changeOfferPurchase.changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeOfferPurchaseDotchangeTypeUndefined: Self = StObject.set(x, "changeOfferPurchase.changeType", js.undefined)
    
    inline def setChangeOfferPurchaseDotentitlement(value: String): Self = StObject.set(x, "changeOfferPurchase.entitlement", value.asInstanceOf[js.Any])
    
    inline def setChangeOfferPurchaseDotentitlementUndefined: Self = StObject.set(x, "changeOfferPurchase.entitlement", js.undefined)
    
    inline def setCreateEntitlementPurchaseDotproduct(value: String): Self = StObject.set(x, "createEntitlementPurchase.product", value.asInstanceOf[js.Any])
    
    inline def setCreateEntitlementPurchaseDotproductUndefined: Self = StObject.set(x, "createEntitlementPurchase.product", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
