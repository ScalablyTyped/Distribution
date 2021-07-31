package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetOrder extends StObject {
  
  def getBillingAccount(): BillingAccount
  
  def getEndDatetime(): AdWordsDate
  
  def getId(): Double
  
  def getName(): String
  
  def getPoNumber(): Double
  
  def getSpendingLimit(): Double
  
  def getStartDateTime(): AdWordsDate
  
  def getTotalAdjustments(): Double
}
object BudgetOrder {
  
  @scala.inline
  def apply(
    getBillingAccount: () => BillingAccount,
    getEndDatetime: () => AdWordsDate,
    getId: () => Double,
    getName: () => String,
    getPoNumber: () => Double,
    getSpendingLimit: () => Double,
    getStartDateTime: () => AdWordsDate,
    getTotalAdjustments: () => Double
  ): BudgetOrder = {
    val __obj = js.Dynamic.literal(getBillingAccount = js.Any.fromFunction0(getBillingAccount), getEndDatetime = js.Any.fromFunction0(getEndDatetime), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getPoNumber = js.Any.fromFunction0(getPoNumber), getSpendingLimit = js.Any.fromFunction0(getSpendingLimit), getStartDateTime = js.Any.fromFunction0(getStartDateTime), getTotalAdjustments = js.Any.fromFunction0(getTotalAdjustments))
    __obj.asInstanceOf[BudgetOrder]
  }
  
  @scala.inline
  implicit class BudgetOrderMutableBuilder[Self <: BudgetOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBillingAccount(value: () => BillingAccount): Self = StObject.set(x, "getBillingAccount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEndDatetime(value: () => AdWordsDate): Self = StObject.set(x, "getEndDatetime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPoNumber(value: () => Double): Self = StObject.set(x, "getPoNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSpendingLimit(value: () => Double): Self = StObject.set(x, "getSpendingLimit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStartDateTime(value: () => AdWordsDate): Self = StObject.set(x, "getStartDateTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTotalAdjustments(value: () => Double): Self = StObject.set(x, "getTotalAdjustments", js.Any.fromFunction0(value))
  }
}
