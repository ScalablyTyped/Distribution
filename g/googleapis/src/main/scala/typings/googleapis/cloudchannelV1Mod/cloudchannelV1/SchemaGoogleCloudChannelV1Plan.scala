package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Plan extends StObject {
  
  /**
    * Reseller Billing account to charge after an offer transaction. Only present for Google Cloud Platform offers.
    */
  var billingAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes how frequently the reseller will be billed, such as once per month.
    */
  var paymentCycle: js.UndefOr[SchemaGoogleCloudChannelV1Period] = js.undefined
  
  /**
    * Describes how a reseller will be billed.
    */
  var paymentPlan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies when the payment needs to happen.
    */
  var paymentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Present for Offers with a trial period. For trial-only Offers, a paid service needs to start before the trial period ends for continued service. For Regular Offers with a trial period, the regular pricing goes into effect when trial period ends, or if paid service is started before the end of the trial period.
    */
  var trialPeriod: js.UndefOr[SchemaGoogleCloudChannelV1Period] = js.undefined
}
object SchemaGoogleCloudChannelV1Plan {
  
  inline def apply(): SchemaGoogleCloudChannelV1Plan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Plan]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Plan](x: Self) {
    
    inline def setBillingAccount(value: String): Self = StObject.set(x, "billingAccount", value.asInstanceOf[js.Any])
    
    inline def setBillingAccountNull: Self = StObject.set(x, "billingAccount", null)
    
    inline def setBillingAccountUndefined: Self = StObject.set(x, "billingAccount", js.undefined)
    
    inline def setPaymentCycle(value: SchemaGoogleCloudChannelV1Period): Self = StObject.set(x, "paymentCycle", value.asInstanceOf[js.Any])
    
    inline def setPaymentCycleUndefined: Self = StObject.set(x, "paymentCycle", js.undefined)
    
    inline def setPaymentPlan(value: String): Self = StObject.set(x, "paymentPlan", value.asInstanceOf[js.Any])
    
    inline def setPaymentPlanNull: Self = StObject.set(x, "paymentPlan", null)
    
    inline def setPaymentPlanUndefined: Self = StObject.set(x, "paymentPlan", js.undefined)
    
    inline def setPaymentType(value: String): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
    
    inline def setPaymentTypeNull: Self = StObject.set(x, "paymentType", null)
    
    inline def setPaymentTypeUndefined: Self = StObject.set(x, "paymentType", js.undefined)
    
    inline def setTrialPeriod(value: SchemaGoogleCloudChannelV1Period): Self = StObject.set(x, "trialPeriod", value.asInstanceOf[js.Any])
    
    inline def setTrialPeriodUndefined: Self = StObject.set(x, "trialPeriod", js.undefined)
  }
}
