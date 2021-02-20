package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountBillingPlan extends StObject {
  
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
  implicit class AccountBillingPlanMutableBuilder[Self <: AccountBillingPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOns(value: js.Array[AddOn]): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    @scala.inline
    def setAddOnsVarargs(value: AddOn*): Self = StObject.set(x, "addOns", js.Array(value :_*))
    
    @scala.inline
    def setCanCancelRenewal(value: String): Self = StObject.set(x, "canCancelRenewal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCancelRenewalUndefined: Self = StObject.set(x, "canCancelRenewal", js.undefined)
    
    @scala.inline
    def setCanUpgrade(value: String): Self = StObject.set(x, "canUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUpgradeUndefined: Self = StObject.set(x, "canUpgrade", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setDowngradePlanInformation(value: DowngradePlanUpdateResponse): Self = StObject.set(x, "downgradePlanInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowngradePlanInformationUndefined: Self = StObject.set(x, "downgradePlanInformation", js.undefined)
    
    @scala.inline
    def setEnableSupport(value: String): Self = StObject.set(x, "enableSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSupportUndefined: Self = StObject.set(x, "enableSupport", js.undefined)
    
    @scala.inline
    def setIncludedSeats(value: String): Self = StObject.set(x, "includedSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedSeatsUndefined: Self = StObject.set(x, "includedSeats", js.undefined)
    
    @scala.inline
    def setIncrementalSeats(value: String): Self = StObject.set(x, "incrementalSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementalSeatsUndefined: Self = StObject.set(x, "incrementalSeats", js.undefined)
    
    @scala.inline
    def setIsDowngrade(value: String): Self = StObject.set(x, "isDowngrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDowngradeUndefined: Self = StObject.set(x, "isDowngrade", js.undefined)
    
    @scala.inline
    def setOtherDiscountPercent(value: String): Self = StObject.set(x, "otherDiscountPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherDiscountPercentUndefined: Self = StObject.set(x, "otherDiscountPercent", js.undefined)
    
    @scala.inline
    def setPaymentCycle(value: String): Self = StObject.set(x, "paymentCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentCycleUndefined: Self = StObject.set(x, "paymentCycle", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    @scala.inline
    def setPerSeatPrice(value: String): Self = StObject.set(x, "perSeatPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerSeatPriceUndefined: Self = StObject.set(x, "perSeatPrice", js.undefined)
    
    @scala.inline
    def setPlanClassification(value: String): Self = StObject.set(x, "planClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanClassificationUndefined: Self = StObject.set(x, "planClassification", js.undefined)
    
    @scala.inline
    def setPlanFeatureSets(value: js.Array[FeatureSet]): Self = StObject.set(x, "planFeatureSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanFeatureSetsUndefined: Self = StObject.set(x, "planFeatureSets", js.undefined)
    
    @scala.inline
    def setPlanFeatureSetsVarargs(value: FeatureSet*): Self = StObject.set(x, "planFeatureSets", js.Array(value :_*))
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
    
    @scala.inline
    def setRenewalStatus(value: String): Self = StObject.set(x, "renewalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalStatusUndefined: Self = StObject.set(x, "renewalStatus", js.undefined)
    
    @scala.inline
    def setSeatDiscounts(value: js.Array[SeatDiscount]): Self = StObject.set(x, "seatDiscounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeatDiscountsUndefined: Self = StObject.set(x, "seatDiscounts", js.undefined)
    
    @scala.inline
    def setSeatDiscountsVarargs(value: SeatDiscount*): Self = StObject.set(x, "seatDiscounts", js.Array(value :_*))
    
    @scala.inline
    def setSupportIncidentFee(value: String): Self = StObject.set(x, "supportIncidentFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportIncidentFeeUndefined: Self = StObject.set(x, "supportIncidentFee", js.undefined)
    
    @scala.inline
    def setSupportPlanFee(value: String): Self = StObject.set(x, "supportPlanFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportPlanFeeUndefined: Self = StObject.set(x, "supportPlanFee", js.undefined)
  }
}
