package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Offer extends StObject {
  
  /**
    * Constraints on transacting the Offer.
    */
  var constraints: js.UndefOr[SchemaGoogleCloudChannelV1Constraints] = js.undefined
  
  /**
    * Output only. End of the Offer validity time.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Marketing information for the Offer.
    */
  var marketingInfo: js.UndefOr[SchemaGoogleCloudChannelV1MarketingInfo] = js.undefined
  
  /**
    * Resource Name of the Offer. Format: accounts/{account_id\}/offers/{offer_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameters required to use current Offer to purchase.
    */
  var parameterDefinitions: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1ParameterDefinition]] = js.undefined
  
  /**
    * Describes the payment plan for the Offer.
    */
  var plan: js.UndefOr[SchemaGoogleCloudChannelV1Plan] = js.undefined
  
  /**
    * Price for each monetizable resource type.
    */
  var priceByResources: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1PriceByResource]] = js.undefined
  
  /**
    * SKU the offer is associated with.
    */
  var sku: js.UndefOr[SchemaGoogleCloudChannelV1Sku] = js.undefined
  
  /**
    * Start of the Offer validity time.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1Offer {
  
  inline def apply(): SchemaGoogleCloudChannelV1Offer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Offer]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Offer](x: Self) {
    
    inline def setConstraints(value: SchemaGoogleCloudChannelV1Constraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMarketingInfo(value: SchemaGoogleCloudChannelV1MarketingInfo): Self = StObject.set(x, "marketingInfo", value.asInstanceOf[js.Any])
    
    inline def setMarketingInfoUndefined: Self = StObject.set(x, "marketingInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameterDefinitions(value: js.Array[SchemaGoogleCloudChannelV1ParameterDefinition]): Self = StObject.set(x, "parameterDefinitions", value.asInstanceOf[js.Any])
    
    inline def setParameterDefinitionsUndefined: Self = StObject.set(x, "parameterDefinitions", js.undefined)
    
    inline def setParameterDefinitionsVarargs(value: SchemaGoogleCloudChannelV1ParameterDefinition*): Self = StObject.set(x, "parameterDefinitions", js.Array(value*))
    
    inline def setPlan(value: SchemaGoogleCloudChannelV1Plan): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPriceByResources(value: js.Array[SchemaGoogleCloudChannelV1PriceByResource]): Self = StObject.set(x, "priceByResources", value.asInstanceOf[js.Any])
    
    inline def setPriceByResourcesUndefined: Self = StObject.set(x, "priceByResources", js.undefined)
    
    inline def setPriceByResourcesVarargs(value: SchemaGoogleCloudChannelV1PriceByResource*): Self = StObject.set(x, "priceByResources", js.Array(value*))
    
    inline def setSku(value: SchemaGoogleCloudChannelV1Sku): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
