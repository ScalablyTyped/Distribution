package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasePlan extends StObject {
  
  /**
    * Set when the base plan automatically renews at a regular interval.
    */
  var autoRenewingBasePlanType: js.UndefOr[SchemaAutoRenewingBasePlanType] = js.undefined
  
  /**
    * Required. Immutable. The unique identifier of this base plan. Must be unique within the subscription, and conform with RFC-1034. That is, this ID can only contain lower-case letters (a-z), numbers (0-9), and hyphens (-), and be at most 63 characters.
    */
  var basePlanId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of up to 20 custom tags specified for this base plan, and returned to the app through the billing library. Subscription offers for this base plan will also receive these offer tags in the billing library.
    */
  var offerTags: js.UndefOr[js.Array[SchemaOfferTag]] = js.undefined
  
  /**
    * Pricing information for any new locations Play may launch in the future. If omitted, the BasePlan will not be automatically available any new locations Play may launch in the future.
    */
  var otherRegionsConfig: js.UndefOr[SchemaOtherRegionsBasePlanConfig] = js.undefined
  
  /**
    * Set when the base plan does not automatically renew at the end of the billing period.
    */
  var prepaidBasePlanType: js.UndefOr[SchemaPrepaidBasePlanType] = js.undefined
  
  /**
    * Region-specific information for this base plan.
    */
  var regionalConfigs: js.UndefOr[js.Array[SchemaRegionalBasePlanConfig]] = js.undefined
  
  /**
    * Output only. The state of the base plan, i.e. whether it's active. Draft and inactive base plans can be activated or deleted. Active base plans can be made inactive. Inactive base plans can be canceled. This field cannot be changed by updating the resource. Use the dedicated endpoints instead.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaBasePlan {
  
  inline def apply(): SchemaBasePlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasePlan]
  }
  
  extension [Self <: SchemaBasePlan](x: Self) {
    
    inline def setAutoRenewingBasePlanType(value: SchemaAutoRenewingBasePlanType): Self = StObject.set(x, "autoRenewingBasePlanType", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewingBasePlanTypeUndefined: Self = StObject.set(x, "autoRenewingBasePlanType", js.undefined)
    
    inline def setBasePlanId(value: String): Self = StObject.set(x, "basePlanId", value.asInstanceOf[js.Any])
    
    inline def setBasePlanIdNull: Self = StObject.set(x, "basePlanId", null)
    
    inline def setBasePlanIdUndefined: Self = StObject.set(x, "basePlanId", js.undefined)
    
    inline def setOfferTags(value: js.Array[SchemaOfferTag]): Self = StObject.set(x, "offerTags", value.asInstanceOf[js.Any])
    
    inline def setOfferTagsUndefined: Self = StObject.set(x, "offerTags", js.undefined)
    
    inline def setOfferTagsVarargs(value: SchemaOfferTag*): Self = StObject.set(x, "offerTags", js.Array(value*))
    
    inline def setOtherRegionsConfig(value: SchemaOtherRegionsBasePlanConfig): Self = StObject.set(x, "otherRegionsConfig", value.asInstanceOf[js.Any])
    
    inline def setOtherRegionsConfigUndefined: Self = StObject.set(x, "otherRegionsConfig", js.undefined)
    
    inline def setPrepaidBasePlanType(value: SchemaPrepaidBasePlanType): Self = StObject.set(x, "prepaidBasePlanType", value.asInstanceOf[js.Any])
    
    inline def setPrepaidBasePlanTypeUndefined: Self = StObject.set(x, "prepaidBasePlanType", js.undefined)
    
    inline def setRegionalConfigs(value: js.Array[SchemaRegionalBasePlanConfig]): Self = StObject.set(x, "regionalConfigs", value.asInstanceOf[js.Any])
    
    inline def setRegionalConfigsUndefined: Self = StObject.set(x, "regionalConfigs", js.undefined)
    
    inline def setRegionalConfigsVarargs(value: SchemaRegionalBasePlanConfig*): Self = StObject.set(x, "regionalConfigs", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
