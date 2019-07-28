package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetOrder extends js.Object {
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
}

