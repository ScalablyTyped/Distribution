package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads budget.
  * Budgets are used for managing the amount of money spent on Google Ads.
  * Budgets may be shared among a number of campaigns; use `Budget.campaigns()` to find the campaigns that are using the budget.
  * For more information on Shared Budgets, please see [AdWords API article](https://developers.google.com/adwords/api/docs/guides/budgets).
  */
@js.native
trait Budget
  extends StObject
     with StatsFor {
  
  /** Returns the selector of all campaigns that share this budget. */
  def campaigns(): CampaignSelector = js.native
  
  /** Returns the amount of the budget, in the currency of the account. */
  def getAmount(): Double = js.native
  
  /** Returns the delivery method of the budget. */
  def getDeliveryMethod(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "Budget". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the budget. */
  def getId(): Double = js.native
  
  /** Returns the name of the budget. */
  def getName(): String = js.native
  
  /** Returns the total amount of the budget, in the currency of the account. */
  def getTotalAmount(): Double = js.native
  
  /** Returns the type of the budget (also known as the period). */
  def getType(): String = js.native
  
  /** Returns true if the budget is explicitly shared, and false otherwise. */
  def isExplicitlyShared(): Boolean = js.native
  
  /** Sets the budget's amount to the specified value, in the currency of the account. */
  def setAmount(ammount: Double): Unit = js.native
  
  /** Sets the delivery method of the budget. */
  def setDeliveryMethod(deliveryMethod: String): Unit = js.native
  
  /** Sets the total budget's amount to the specified value, in the currency of the account. */
  def setTotalAmount(totalAmount: Double): Unit = js.native
}
