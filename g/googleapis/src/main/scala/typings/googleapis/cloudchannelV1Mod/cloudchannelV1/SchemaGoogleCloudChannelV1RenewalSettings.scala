package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1RenewalSettings extends StObject {
  
  /**
    * If false, the plan will be completed at the end date.
    */
  var enableRenewal: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Describes how frequently the reseller will be billed, such as once per month.
    */
  var paymentCycle: js.UndefOr[SchemaGoogleCloudChannelV1Period] = js.undefined
  
  /**
    * Describes how a reseller will be billed.
    */
  var paymentPlan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true and enable_renewal = true, the unit (for example seats or licenses) will be set to the number of active units at renewal time.
    */
  var resizeUnitCount: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1RenewalSettings {
  
  inline def apply(): SchemaGoogleCloudChannelV1RenewalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1RenewalSettings]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1RenewalSettings](x: Self) {
    
    inline def setEnableRenewal(value: Boolean): Self = StObject.set(x, "enableRenewal", value.asInstanceOf[js.Any])
    
    inline def setEnableRenewalNull: Self = StObject.set(x, "enableRenewal", null)
    
    inline def setEnableRenewalUndefined: Self = StObject.set(x, "enableRenewal", js.undefined)
    
    inline def setPaymentCycle(value: SchemaGoogleCloudChannelV1Period): Self = StObject.set(x, "paymentCycle", value.asInstanceOf[js.Any])
    
    inline def setPaymentCycleUndefined: Self = StObject.set(x, "paymentCycle", js.undefined)
    
    inline def setPaymentPlan(value: String): Self = StObject.set(x, "paymentPlan", value.asInstanceOf[js.Any])
    
    inline def setPaymentPlanNull: Self = StObject.set(x, "paymentPlan", null)
    
    inline def setPaymentPlanUndefined: Self = StObject.set(x, "paymentPlan", js.undefined)
    
    inline def setResizeUnitCount(value: Boolean): Self = StObject.set(x, "resizeUnitCount", value.asInstanceOf[js.Any])
    
    inline def setResizeUnitCountNull: Self = StObject.set(x, "resizeUnitCount", null)
    
    inline def setResizeUnitCountUndefined: Self = StObject.set(x, "resizeUnitCount", js.undefined)
  }
}
