package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPlanUpdateResponse extends js.Object {
  
  /**
    * The type of payment method used for the account. Valid values are:
    *
    * - `credit_card`
    * -
    */
  var accountPaymentMethod: js.UndefOr[String] = js.native
  
  var billingPlanPreview: js.UndefOr[
    /* Information used to provide a preview of a billing plan. */ BillingPlanPreview
  ] = js.native
  
  /**
    * Specifies the ISO currency code for the account.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * The number of seats (users) included in the plan.
    */
  var includedSeats: js.UndefOr[String] = js.native
  
  /**
    * The payment cycle associated with the plan. The possible values are:
    *
    * - `Monthly`
    * - `Annually`
    */
  var paymentCycle: js.UndefOr[String] = js.native
  
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
  var paymentMethod: js.UndefOr[String] = js.native
  
  /**
    * DocuSign's id for the account plan.
    */
  var planId: js.UndefOr[String] = js.native
  
  /**
    * The name of the billing plan used for the account.
    *
    * Examples:
    *
    * - `Personal - Annual`
    * - `Unlimited Envelope Subscription - Annual Billing`
    */
  var planName: js.UndefOr[String] = js.native
}
object BillingPlanUpdateResponse {
  
  @scala.inline
  def apply(): BillingPlanUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlanUpdateResponse]
  }
  
  @scala.inline
  implicit class BillingPlanUpdateResponseOps[Self <: BillingPlanUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountPaymentMethod(value: String): Self = this.set("accountPaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountPaymentMethod: Self = this.set("accountPaymentMethod", js.undefined)
    
    @scala.inline
    def setBillingPlanPreview(value: /* Information used to provide a preview of a billing plan. */ BillingPlanPreview): Self = this.set("billingPlanPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPlanPreview: Self = this.set("billingPlanPreview", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setIncludedSeats(value: String): Self = this.set("includedSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedSeats: Self = this.set("includedSeats", js.undefined)
    
    @scala.inline
    def setPaymentCycle(value: String): Self = this.set("paymentCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentCycle: Self = this.set("paymentCycle", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanId: Self = this.set("planId", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = this.set("planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanName: Self = this.set("planName", js.undefined)
  }
}
