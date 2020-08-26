package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetOrder extends js.Object {
  def getBillingAccount(): BillingAccount = js.native
  def getEndDatetime(): AdWordsDate = js.native
  def getId(): Double = js.native
  def getName(): String = js.native
  def getPoNumber(): Double = js.native
  def getSpendingLimit(): Double = js.native
  def getStartDateTime(): AdWordsDate = js.native
  def getTotalAdjustments(): Double = js.native
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
  implicit class BudgetOrderOps[Self <: BudgetOrder] (val x: Self) extends AnyVal {
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
    def setGetBillingAccount(value: () => BillingAccount): Self = this.set("getBillingAccount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEndDatetime(value: () => AdWordsDate): Self = this.set("getEndDatetime", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPoNumber(value: () => Double): Self = this.set("getPoNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSpendingLimit(value: () => Double): Self = this.set("getSpendingLimit", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStartDateTime(value: () => AdWordsDate): Self = this.set("getStartDateTime", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTotalAdjustments(value: () => Double): Self = this.set("getTotalAdjustments", js.Any.fromFunction0(value))
  }
  
}

