package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1RepricingConfig extends StObject {
  
  /**
    * Required. Information about the adjustment.
    */
  var adjustment: js.UndefOr[SchemaGoogleCloudChannelV1RepricingAdjustment] = js.undefined
  
  /**
    * Applies the repricing configuration at the channel partner level. This is the only supported value for ChannelPartnerRepricingConfig.
    */
  var channelPartnerGranularity: js.UndefOr[SchemaGoogleCloudChannelV1RepricingConfigChannelPartnerGranularity] = js.undefined
  
  /**
    * Required. The YearMonth when these adjustments activate. The Day field needs to be "0" since we only accept YearMonth repricing boundaries.
    */
  var effectiveInvoiceMonth: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * Applies the repricing configuration at the entitlement level. This is the only supported value for CustomerRepricingConfig.
    */
  var entitlementGranularity: js.UndefOr[SchemaGoogleCloudChannelV1RepricingConfigEntitlementGranularity] = js.undefined
  
  /**
    * Required. The RebillingBasis to use for this bill. Specifies the relative cost based on repricing costs you will apply.
    */
  var rebillingBasis: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1RepricingConfig {
  
  inline def apply(): SchemaGoogleCloudChannelV1RepricingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1RepricingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1RepricingConfig](x: Self) {
    
    inline def setAdjustment(value: SchemaGoogleCloudChannelV1RepricingAdjustment): Self = StObject.set(x, "adjustment", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentUndefined: Self = StObject.set(x, "adjustment", js.undefined)
    
    inline def setChannelPartnerGranularity(value: SchemaGoogleCloudChannelV1RepricingConfigChannelPartnerGranularity): Self = StObject.set(x, "channelPartnerGranularity", value.asInstanceOf[js.Any])
    
    inline def setChannelPartnerGranularityUndefined: Self = StObject.set(x, "channelPartnerGranularity", js.undefined)
    
    inline def setEffectiveInvoiceMonth(value: SchemaGoogleTypeDate): Self = StObject.set(x, "effectiveInvoiceMonth", value.asInstanceOf[js.Any])
    
    inline def setEffectiveInvoiceMonthUndefined: Self = StObject.set(x, "effectiveInvoiceMonth", js.undefined)
    
    inline def setEntitlementGranularity(value: SchemaGoogleCloudChannelV1RepricingConfigEntitlementGranularity): Self = StObject.set(x, "entitlementGranularity", value.asInstanceOf[js.Any])
    
    inline def setEntitlementGranularityUndefined: Self = StObject.set(x, "entitlementGranularity", js.undefined)
    
    inline def setRebillingBasis(value: String): Self = StObject.set(x, "rebillingBasis", value.asInstanceOf[js.Any])
    
    inline def setRebillingBasisNull: Self = StObject.set(x, "rebillingBasis", null)
    
    inline def setRebillingBasisUndefined: Self = StObject.set(x, "rebillingBasis", js.undefined)
  }
}
