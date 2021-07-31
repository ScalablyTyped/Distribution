package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPlanUpdateResponse extends StObject {
  
  /**
    * The type of payment method used for the account. Valid values are:
    *
    * - `credit_card`
    * -
    */
  var accountPaymentMethod: js.UndefOr[String] = js.undefined
  
  var billingPlanPreview: js.UndefOr[
    /* Information used to provide a preview of a billing plan. */ BillingPlanPreview
  ] = js.undefined
  
  /**
    * Specifies the ISO currency code for the account.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seats (users) included in the plan.
    */
  var includedSeats: js.UndefOr[String] = js.undefined
  
  /**
    * The payment cycle associated with the plan. The possible values are:
    *
    * - `Monthly`
    * - `Annually`
    */
  var paymentCycle: js.UndefOr[String] = js.undefined
  
  /**
    * The payment method used for the billing plan. Valid values are:
    *
    * - `NotSupported`
    * - `CreditCard`
    * - `PurchaseOrder`
    * - `Premium`
    * - `Freemium`
    * - `FreeTrial`
    * - `AppStore`
    * - `DigitalExternal`
    * - `DirectDebit`
    */
  var paymentMethod: js.UndefOr[String] = js.undefined
  
  /**
    * DocuSign's id for the account plan.
    */
  var planId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the billing plan used for the account.
    *
    * Examples:
    *
    * - `Personal - Annual`
    * - `Unlimited Envelope Subscription - Annual Billing`
    */
  var planName: js.UndefOr[String] = js.undefined
}
object BillingPlanUpdateResponse {
  
  @scala.inline
  def apply(): BillingPlanUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlanUpdateResponse]
  }
  
  @scala.inline
  implicit class BillingPlanUpdateResponseMutableBuilder[Self <: BillingPlanUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountPaymentMethod(value: String): Self = StObject.set(x, "accountPaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountPaymentMethodUndefined: Self = StObject.set(x, "accountPaymentMethod", js.undefined)
    
    @scala.inline
    def setBillingPlanPreview(value: /* Information used to provide a preview of a billing plan. */ BillingPlanPreview): Self = StObject.set(x, "billingPlanPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingPlanPreviewUndefined: Self = StObject.set(x, "billingPlanPreview", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setIncludedSeats(value: String): Self = StObject.set(x, "includedSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedSeatsUndefined: Self = StObject.set(x, "includedSeats", js.undefined)
    
    @scala.inline
    def setPaymentCycle(value: String): Self = StObject.set(x, "paymentCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentCycleUndefined: Self = StObject.set(x, "paymentCycle", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
  }
}
