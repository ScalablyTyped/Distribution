package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1alpha1RenewalSettings extends StObject {
  
  /**
    * If true, disables commitment-based offer on renewal and switches to flexible or pay as you go. Deprecated: Use `payment_plan` instead.
    */
  var disableCommitment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If false, the plan will be completed at the end date.
    */
  var enableRenewal: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Describes how frequently the reseller will be billed, such as once per month.
    */
  var paymentCycle: js.UndefOr[SchemaGoogleCloudChannelV1alpha1Period] = js.undefined
  
  /**
    * Set if enable_renewal=true. Deprecated: Use `payment_cycle` instead.
    */
  var paymentOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes how a reseller will be billed.
    */
  var paymentPlan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true and enable_renewal = true, the unit (for example seats or licenses) will be set to the number of active units at renewal time.
    */
  var resizeUnitCount: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1alpha1RenewalSettings {
  
  inline def apply(): SchemaGoogleCloudChannelV1alpha1RenewalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1alpha1RenewalSettings]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1alpha1RenewalSettings](x: Self) {
    
    inline def setDisableCommitment(value: Boolean): Self = StObject.set(x, "disableCommitment", value.asInstanceOf[js.Any])
    
    inline def setDisableCommitmentNull: Self = StObject.set(x, "disableCommitment", null)
    
    inline def setDisableCommitmentUndefined: Self = StObject.set(x, "disableCommitment", js.undefined)
    
    inline def setEnableRenewal(value: Boolean): Self = StObject.set(x, "enableRenewal", value.asInstanceOf[js.Any])
    
    inline def setEnableRenewalNull: Self = StObject.set(x, "enableRenewal", null)
    
    inline def setEnableRenewalUndefined: Self = StObject.set(x, "enableRenewal", js.undefined)
    
    inline def setPaymentCycle(value: SchemaGoogleCloudChannelV1alpha1Period): Self = StObject.set(x, "paymentCycle", value.asInstanceOf[js.Any])
    
    inline def setPaymentCycleUndefined: Self = StObject.set(x, "paymentCycle", js.undefined)
    
    inline def setPaymentOption(value: String): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionNull: Self = StObject.set(x, "paymentOption", null)
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "paymentOption", js.undefined)
    
    inline def setPaymentPlan(value: String): Self = StObject.set(x, "paymentPlan", value.asInstanceOf[js.Any])
    
    inline def setPaymentPlanNull: Self = StObject.set(x, "paymentPlan", null)
    
    inline def setPaymentPlanUndefined: Self = StObject.set(x, "paymentPlan", js.undefined)
    
    inline def setResizeUnitCount(value: Boolean): Self = StObject.set(x, "resizeUnitCount", value.asInstanceOf[js.Any])
    
    inline def setResizeUnitCountNull: Self = StObject.set(x, "resizeUnitCount", null)
    
    inline def setResizeUnitCountUndefined: Self = StObject.set(x, "resizeUnitCount", js.undefined)
  }
}
