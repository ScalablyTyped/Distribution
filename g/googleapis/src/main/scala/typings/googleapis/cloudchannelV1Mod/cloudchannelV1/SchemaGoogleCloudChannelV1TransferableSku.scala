package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1TransferableSku extends StObject {
  
  /**
    * Optional. The customer to transfer has an entitlement with the populated legacy SKU.
    */
  var legacySku: js.UndefOr[SchemaGoogleCloudChannelV1Sku] = js.undefined
  
  /**
    * The SKU pertaining to the provisioning resource as specified in the Offer.
    */
  var sku: js.UndefOr[SchemaGoogleCloudChannelV1Sku] = js.undefined
  
  /**
    * Describes the transfer eligibility of a SKU.
    */
  var transferEligibility: js.UndefOr[SchemaGoogleCloudChannelV1TransferEligibility] = js.undefined
}
object SchemaGoogleCloudChannelV1TransferableSku {
  
  inline def apply(): SchemaGoogleCloudChannelV1TransferableSku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1TransferableSku]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1TransferableSku](x: Self) {
    
    inline def setLegacySku(value: SchemaGoogleCloudChannelV1Sku): Self = StObject.set(x, "legacySku", value.asInstanceOf[js.Any])
    
    inline def setLegacySkuUndefined: Self = StObject.set(x, "legacySku", js.undefined)
    
    inline def setSku(value: SchemaGoogleCloudChannelV1Sku): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
    
    inline def setTransferEligibility(value: SchemaGoogleCloudChannelV1TransferEligibility): Self = StObject.set(x, "transferEligibility", value.asInstanceOf[js.Any])
    
    inline def setTransferEligibilityUndefined: Self = StObject.set(x, "transferEligibility", js.undefined)
  }
}
