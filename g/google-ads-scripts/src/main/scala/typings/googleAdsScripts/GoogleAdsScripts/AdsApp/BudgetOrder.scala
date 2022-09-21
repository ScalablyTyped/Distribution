package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads budget order. Budget orders are used for managing client budgets at the account level.
  * Each budget order is associated with a billing account which can take invoices for consolidated billing.
  * For details about budget orders and billing accounts, see Budget Order Service.
  */
trait BudgetOrder extends StObject {
  
  /** Returns the associated billing account. */
  def getBillingAccount(): BillingAccount
  
  /** Returns the budget order's end date or null if there is no end date. */
  def getEndDateTime(): GoogleAdsDate
  
  /** Returns the ID of the budget order. */
  def getId(): Double
  
  /** Returns the name of the budget order. */
  def getName(): String
  
  /** Returns the purchase order number. */
  def getPoNumber(): Double
  
  /** Returns the effective spending limit in the account's currency, including all adjustments that have been applied to the budget order. */
  def getSpendingLimit(): Double
  
  /** Returns the budget order's start date. */
  def getStartDateTime(): GoogleAdsDate
  
  /** Returns the total adjustments that have been applied to the spending limit, in the account's currency. */
  def getTotalAdjustments(): Double
}
object BudgetOrder {
  
  inline def apply(
    getBillingAccount: () => BillingAccount,
    getEndDateTime: () => GoogleAdsDate,
    getId: () => Double,
    getName: () => String,
    getPoNumber: () => Double,
    getSpendingLimit: () => Double,
    getStartDateTime: () => GoogleAdsDate,
    getTotalAdjustments: () => Double
  ): BudgetOrder = {
    val __obj = js.Dynamic.literal(getBillingAccount = js.Any.fromFunction0(getBillingAccount), getEndDateTime = js.Any.fromFunction0(getEndDateTime), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getPoNumber = js.Any.fromFunction0(getPoNumber), getSpendingLimit = js.Any.fromFunction0(getSpendingLimit), getStartDateTime = js.Any.fromFunction0(getStartDateTime), getTotalAdjustments = js.Any.fromFunction0(getTotalAdjustments))
    __obj.asInstanceOf[BudgetOrder]
  }
  
  extension [Self <: BudgetOrder](x: Self) {
    
    inline def setGetBillingAccount(value: () => BillingAccount): Self = StObject.set(x, "getBillingAccount", js.Any.fromFunction0(value))
    
    inline def setGetEndDateTime(value: () => GoogleAdsDate): Self = StObject.set(x, "getEndDateTime", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetPoNumber(value: () => Double): Self = StObject.set(x, "getPoNumber", js.Any.fromFunction0(value))
    
    inline def setGetSpendingLimit(value: () => Double): Self = StObject.set(x, "getSpendingLimit", js.Any.fromFunction0(value))
    
    inline def setGetStartDateTime(value: () => GoogleAdsDate): Self = StObject.set(x, "getStartDateTime", js.Any.fromFunction0(value))
    
    inline def setGetTotalAdjustments(value: () => Double): Self = StObject.set(x, "getTotalAdjustments", js.Any.fromFunction0(value))
  }
}
