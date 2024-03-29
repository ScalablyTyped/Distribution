package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPlan extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var appStoreProducts: js.UndefOr[js.Array[/* Contains information about an APP store product. */ AppStoreProduct]] = js.undefined
  
  /**
    * Contains the `currencyCode` and `currencySymbol` for the alternate currency values for `envelopeFee`, `fixedFee`, and `seatFee` that are configured for this plan feature set.
    */
  var currencyPlanPrices: js.UndefOr[js.Array[CurrencyPlanPrice]] = js.undefined
  
  /**
    * When set to **true**, customer support is provided as part of the account plan.
    */
  var enableSupport: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seats (users) included in the plan.
    */
  var includedSeats: js.UndefOr[String] = js.undefined
  
  /**
    * Any other percentage discount for the plan.
    *
    * Example: `"0.00"`
    */
  var otherDiscountPercent: js.UndefOr[String] = js.undefined
  
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
    * The per-seat price associated with the plan.
    *
    * Example: `"456.0000"`
    */
  var perSeatPrice: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the type of plan. Examples include:
    *
    * - `business`
    * - `corporate`
    * - `enterprise`
    * - `free`
    */
  var planClassification: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var planFeatureSets: js.UndefOr[
    js.Array[
      /* This object provides details about a feature set, or add-on product that is associated with an account.
    It is reserved for DocuSign internal use only. */ FeatureSet
    ]
  ] = js.undefined
  
  /**
    * DocuSign's id for the account plan.
    */
  var planId: js.UndefOr[String] = js.undefined
  
  var planName: js.UndefOr[String] = js.undefined
  
  /**
    * A complex type that returns information about any seat discounts. It contains the information `BeginSeatCount`, `EndSeatCount` and `SeatDiscountPercent`.
    */
  var seatDiscounts: js.UndefOr[
    js.Array[/* This object contains information about a seat discount. */ SeatDiscount]
  ] = js.undefined
  
  /**
    * The support incident fee charged for each support incident.
    *
    * Example: `"$0.00"`
    */
  var supportIncidentFee: js.UndefOr[String] = js.undefined
  
  /**
    * The support plan fee charged for this plan.
    *
    * Example: `"$0.00"`
    */
  var supportPlanFee: js.UndefOr[String] = js.undefined
}
object BillingPlan {
  
  inline def apply(): BillingPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingPlan] (val x: Self) extends AnyVal {
    
    inline def setAppStoreProducts(value: js.Array[/* Contains information about an APP store product. */ AppStoreProduct]): Self = StObject.set(x, "appStoreProducts", value.asInstanceOf[js.Any])
    
    inline def setAppStoreProductsUndefined: Self = StObject.set(x, "appStoreProducts", js.undefined)
    
    inline def setAppStoreProductsVarargs(value: (/* Contains information about an APP store product. */ AppStoreProduct)*): Self = StObject.set(x, "appStoreProducts", js.Array(value*))
    
    inline def setCurrencyPlanPrices(value: js.Array[CurrencyPlanPrice]): Self = StObject.set(x, "currencyPlanPrices", value.asInstanceOf[js.Any])
    
    inline def setCurrencyPlanPricesUndefined: Self = StObject.set(x, "currencyPlanPrices", js.undefined)
    
    inline def setCurrencyPlanPricesVarargs(value: CurrencyPlanPrice*): Self = StObject.set(x, "currencyPlanPrices", js.Array(value*))
    
    inline def setEnableSupport(value: String): Self = StObject.set(x, "enableSupport", value.asInstanceOf[js.Any])
    
    inline def setEnableSupportUndefined: Self = StObject.set(x, "enableSupport", js.undefined)
    
    inline def setIncludedSeats(value: String): Self = StObject.set(x, "includedSeats", value.asInstanceOf[js.Any])
    
    inline def setIncludedSeatsUndefined: Self = StObject.set(x, "includedSeats", js.undefined)
    
    inline def setOtherDiscountPercent(value: String): Self = StObject.set(x, "otherDiscountPercent", value.asInstanceOf[js.Any])
    
    inline def setOtherDiscountPercentUndefined: Self = StObject.set(x, "otherDiscountPercent", js.undefined)
    
    inline def setPaymentCycle(value: String): Self = StObject.set(x, "paymentCycle", value.asInstanceOf[js.Any])
    
    inline def setPaymentCycleUndefined: Self = StObject.set(x, "paymentCycle", js.undefined)
    
    inline def setPaymentMethod(value: String): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    inline def setPerSeatPrice(value: String): Self = StObject.set(x, "perSeatPrice", value.asInstanceOf[js.Any])
    
    inline def setPerSeatPriceUndefined: Self = StObject.set(x, "perSeatPrice", js.undefined)
    
    inline def setPlanClassification(value: String): Self = StObject.set(x, "planClassification", value.asInstanceOf[js.Any])
    
    inline def setPlanClassificationUndefined: Self = StObject.set(x, "planClassification", js.undefined)
    
    inline def setPlanFeatureSets(
      value: js.Array[
          /* This object provides details about a feature set, or add-on product that is associated with an account.
      It is reserved for DocuSign internal use only. */ FeatureSet
        ]
    ): Self = StObject.set(x, "planFeatureSets", value.asInstanceOf[js.Any])
    
    inline def setPlanFeatureSetsUndefined: Self = StObject.set(x, "planFeatureSets", js.undefined)
    
    inline def setPlanFeatureSetsVarargs(
      value: (/* This object provides details about a feature set, or add-on product that is associated with an account.
      It is reserved for DocuSign internal use only. */ FeatureSet)*
    ): Self = StObject.set(x, "planFeatureSets", js.Array(value*))
    
    inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    inline def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
    
    inline def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
    
    inline def setSeatDiscounts(value: js.Array[/* This object contains information about a seat discount. */ SeatDiscount]): Self = StObject.set(x, "seatDiscounts", value.asInstanceOf[js.Any])
    
    inline def setSeatDiscountsUndefined: Self = StObject.set(x, "seatDiscounts", js.undefined)
    
    inline def setSeatDiscountsVarargs(value: (/* This object contains information about a seat discount. */ SeatDiscount)*): Self = StObject.set(x, "seatDiscounts", js.Array(value*))
    
    inline def setSupportIncidentFee(value: String): Self = StObject.set(x, "supportIncidentFee", value.asInstanceOf[js.Any])
    
    inline def setSupportIncidentFeeUndefined: Self = StObject.set(x, "supportIncidentFee", js.undefined)
    
    inline def setSupportPlanFee(value: String): Self = StObject.set(x, "supportPlanFee", value.asInstanceOf[js.Any])
    
    inline def setSupportPlanFeeUndefined: Self = StObject.set(x, "supportPlanFee", js.undefined)
  }
}
