package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1ProvisionedService extends StObject {
  
  /**
    * Output only. The product pertaining to the provisioning resource as specified in the Offer.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Provisioning ID of the entitlement. For Google Workspace, this is the underlying Subscription ID. For Google Cloud Platform, this is the Billing Account ID of the billing subaccount."
    */
  var provisioningId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The SKU pertaining to the provisioning resource as specified in the Offer.
    */
  var skuId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1ProvisionedService {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1ProvisionedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1ProvisionedService]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1ProvisionedService](x: Self) {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProvisioningId(value: String): Self = StObject.set(x, "provisioningId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningIdNull: Self = StObject.set(x, "provisioningId", null)
    
    inline def setProvisioningIdUndefined: Self = StObject.set(x, "provisioningId", js.undefined)
    
    inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    inline def setSkuIdNull: Self = StObject.set(x, "skuId", null)
    
    inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
  }
}
