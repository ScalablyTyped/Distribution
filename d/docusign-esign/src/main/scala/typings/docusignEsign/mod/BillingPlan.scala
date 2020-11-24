package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPlan extends js.Object {
  
  /**
    * Reserved for DocuSign.
    */
  var appStoreProducts: js.UndefOr[js.Array[/* Contains information about an APP store product. */ AppStoreProduct]] = js.native
  
  /**
    * Contains the `currencyCode` and `currencySymbol` for the alternate currency values for `envelopeFee`, `fixedFee`, and `seatFee` that are configured for this plan feature set.
    */
  var currencyPlanPrices: js.UndefOr[js.Array[CurrencyPlanPrice]] = js.native
  
  /**
    * When set to **true**, customer support is provided as part of the account plan.
    */
  var enableSupport: js.UndefOr[String] = js.native
  
  /**
    * The number of seats (users) included in the plan.
    */
  var includedSeats: js.UndefOr[String] = js.native
  
  /**
    * Any other percentage discount for the plan.
    *
    * Example: `"0.00"`
    */
  var otherDiscountPercent: js.UndefOr[String] = js.native
  
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
  var planFeatureSets: js.UndefOr[
    js.Array[
      /* This object provides details about a feature set, or add-on product that is associated with an account.
    It is reserved for DocuSign internal use only. */ FeatureSet
    ]
  ] = js.native
  
  /**
    * DocuSign's id for the account plan.
    */
  var planId: js.UndefOr[String] = js.native
  
  var planName: js.UndefOr[String] = js.native
  
  /**
    * A complex type that returns information about any seat discounts. It contains the information `BeginSeatCount`, `EndSeatCount` and `SeatDiscountPercent`.
    */
  var seatDiscounts: js.UndefOr[
    js.Array[/* This object contains information about a seat discount. */ SeatDiscount]
  ] = js.native
  
  /**
    * The support incident fee charged for each support incident.
    *
    * Example: `"$0.00"`
    */
  var supportIncidentFee: js.UndefOr[String] = js.native
  
  /**
    * The support plan fee charged for this plan.
    *
    * Example: `"$0.00"`
    */
  var supportPlanFee: js.UndefOr[String] = js.native
}
object BillingPlan {
  
  @scala.inline
  def apply(): BillingPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlan]
  }
  
  @scala.inline
  implicit class BillingPlanOps[Self <: BillingPlan] (val x: Self) extends AnyVal {
    
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
    def setAppStoreProductsVarargs(value: (/* Contains information about an APP store product. */ AppStoreProduct)*): Self = this.set("appStoreProducts", js.Array(value :_*))
    
    @scala.inline
    def setAppStoreProducts(value: js.Array[/* Contains information about an APP store product. */ AppStoreProduct]): Self = this.set("appStoreProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStoreProducts: Self = this.set("appStoreProducts", js.undefined)
    
    @scala.inline
    def setCurrencyPlanPricesVarargs(value: CurrencyPlanPrice*): Self = this.set("currencyPlanPrices", js.Array(value :_*))
    
    @scala.inline
    def setCurrencyPlanPrices(value: js.Array[CurrencyPlanPrice]): Self = this.set("currencyPlanPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyPlanPrices: Self = this.set("currencyPlanPrices", js.undefined)
    
    @scala.inline
    def setEnableSupport(value: String): Self = this.set("enableSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSupport: Self = this.set("enableSupport", js.undefined)
    
    @scala.inline
    def setIncludedSeats(value: String): Self = this.set("includedSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedSeats: Self = this.set("includedSeats", js.undefined)
    
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
    def setPlanFeatureSetsVarargs(
      value: (/* This object provides details about a feature set, or add-on product that is associated with an account.
      It is reserved for DocuSign internal use only. */ FeatureSet)*
    ): Self = this.set("planFeatureSets", js.Array(value :_*))
    
    @scala.inline
    def setPlanFeatureSets(
      value: js.Array[
          /* This object provides details about a feature set, or add-on product that is associated with an account.
      It is reserved for DocuSign internal use only. */ FeatureSet
        ]
    ): Self = this.set("planFeatureSets", value.asInstanceOf[js.Any])
    
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
    def setSeatDiscountsVarargs(value: (/* This object contains information about a seat discount. */ SeatDiscount)*): Self = this.set("seatDiscounts", js.Array(value :_*))
    
    @scala.inline
    def setSeatDiscounts(value: js.Array[/* This object contains information about a seat discount. */ SeatDiscount]): Self = this.set("seatDiscounts", value.asInstanceOf[js.Any])
    
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
