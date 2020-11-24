package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountBillingPlan extends js.Object {
  
  /**
    * Reserved for DocuSign.
    */
  var addOns: js.UndefOr[js.Array[AddOn]] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canCancelRenewal: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, specifies that you can upgrade the account through the API. For GET methods, you must set the
    * `include_metadata` query parameter to **true** for this property to appear in the response.
    */
  var canUpgrade: js.UndefOr[String] = js.native
  
  /**
    * Specifies the ISO currency code to use for the account.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  var downgradePlanInformation: js.UndefOr[DowngradePlanUpdateResponse] = js.native
  
  /**
    * When set to **true**, customer support is provided as part of the account plan.
    */
  var enableSupport: js.UndefOr[String] = js.native
  
  /**
    * The number of seats (users) included in the plan.
    */
  var includedSeats: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var incrementalSeats: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the account has been downgraded from a premium account type. Otherwise **false**.
    */
  var isDowngrade: js.UndefOr[String] = js.native
  
  /**
    * Any other percentage discount for the plan.
    *
    * Example: `"0.00"`
    */
  var otherDiscountPercent: js.UndefOr[String] = js.native
  
  /**
    * The payment cycle associated with the plan. The possible values are:
    * - `Monthly`
    * - `Annually`
    */
  var paymentCycle: js.UndefOr[String] = js.native
  
  /**
    * The payment method used for the billing plan. Valid values are:
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
    * The per-seat price associated with the plan.
    *
    * Example: `"456.0000"`
    */
  var perSeatPrice: js.UndefOr[String] = js.native
  
  /**
    * Identifies the type of plan. Examples include:
    *
    * - `business`
    * - `corporate`
    * - `enterprise`
    * - `free`
    */
  var planClassification: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var planFeatureSets: js.UndefOr[js.Array[FeatureSet]] = js.native
  
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
  
  /**
    * The renewal status for the account. Valid values are:
    *
    * * `auto`: The account automatically renews.
    * * `queued_for_close`: The account will be closed at the `billingPeriodEndDate`.
    * * `queued_for_downgrade`: The account will be downgraded at the `billingPeriodEndDate`.
    *
    * **Note**: For GET methods, you must set the `include_metadata` query parameter to **true** for this property to appear in the response.
    */
  var renewalStatus: js.UndefOr[String] = js.native
  
  var seatDiscounts: js.UndefOr[js.Array[SeatDiscount]] = js.native
  
  /**
    * The support incident fee charged for each support incident.
    * Example: `"$0.00"`
    */
  var supportIncidentFee: js.UndefOr[String] = js.native
  
  /**
    * The support plan fee charged for this plan.
    * Example: `"$0.00"`
    */
  var supportPlanFee: js.UndefOr[String] = js.native
}
object AccountBillingPlan {
  
  @scala.inline
  def apply(): AccountBillingPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountBillingPlan]
  }
  
  @scala.inline
  implicit class AccountBillingPlanOps[Self <: AccountBillingPlan] (val x: Self) extends AnyVal {
    
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
    def setAddOnsVarargs(value: AddOn*): Self = this.set("addOns", js.Array(value :_*))
    
    @scala.inline
    def setAddOns(value: js.Array[AddOn]): Self = this.set("addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOns: Self = this.set("addOns", js.undefined)
    
    @scala.inline
    def setCanCancelRenewal(value: String): Self = this.set("canCancelRenewal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanCancelRenewal: Self = this.set("canCancelRenewal", js.undefined)
    
    @scala.inline
    def setCanUpgrade(value: String): Self = this.set("canUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUpgrade: Self = this.set("canUpgrade", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setDowngradePlanInformation(value: DowngradePlanUpdateResponse): Self = this.set("downgradePlanInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradePlanInformation: Self = this.set("downgradePlanInformation", js.undefined)
    
    @scala.inline
    def setEnableSupport(value: String): Self = this.set("enableSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSupport: Self = this.set("enableSupport", js.undefined)
    
    @scala.inline
    def setIncludedSeats(value: String): Self = this.set("includedSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedSeats: Self = this.set("includedSeats", js.undefined)
    
    @scala.inline
    def setIncrementalSeats(value: String): Self = this.set("incrementalSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementalSeats: Self = this.set("incrementalSeats", js.undefined)
    
    @scala.inline
    def setIsDowngrade(value: String): Self = this.set("isDowngrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDowngrade: Self = this.set("isDowngrade", js.undefined)
    
    @scala.inline
    def setOtherDiscountPercent(value: String): Self = this.set("otherDiscountPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherDiscountPercent: Self = this.set("otherDiscountPercent", js.undefined)
    
    @scala.inline
    def setPaymentCycle(value: String): Self = this.set("paymentCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentCycle: Self = this.set("paymentCycle", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    
    @scala.inline
    def setPerSeatPrice(value: String): Self = this.set("perSeatPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerSeatPrice: Self = this.set("perSeatPrice", js.undefined)
    
    @scala.inline
    def setPlanClassification(value: String): Self = this.set("planClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanClassification: Self = this.set("planClassification", js.undefined)
    
    @scala.inline
    def setPlanFeatureSetsVarargs(value: FeatureSet*): Self = this.set("planFeatureSets", js.Array(value :_*))
    
    @scala.inline
    def setPlanFeatureSets(value: js.Array[FeatureSet]): Self = this.set("planFeatureSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanFeatureSets: Self = this.set("planFeatureSets", js.undefined)
    
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanId: Self = this.set("planId", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = this.set("planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanName: Self = this.set("planName", js.undefined)
    
    @scala.inline
    def setRenewalStatus(value: String): Self = this.set("renewalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalStatus: Self = this.set("renewalStatus", js.undefined)
    
    @scala.inline
    def setSeatDiscountsVarargs(value: SeatDiscount*): Self = this.set("seatDiscounts", js.Array(value :_*))
    
    @scala.inline
    def setSeatDiscounts(value: js.Array[SeatDiscount]): Self = this.set("seatDiscounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeatDiscounts: Self = this.set("seatDiscounts", js.undefined)
    
    @scala.inline
    def setSupportIncidentFee(value: String): Self = this.set("supportIncidentFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportIncidentFee: Self = this.set("supportIncidentFee", js.undefined)
    
    @scala.inline
    def setSupportPlanFee(value: String): Self = this.set("supportPlanFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportPlanFee: Self = this.set("supportPlanFee", js.undefined)
  }
}
