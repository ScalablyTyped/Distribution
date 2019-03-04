package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetOrder extends js.Object {
  def getBillingAccount(): BillingAccount
  def getEndDatetime(): AdWordsDate
  def getId(): scala.Double
  def getName(): java.lang.String
  def getPoNumber(): scala.Double
  def getSpendingLimit(): scala.Double
  def getStartDateTime(): AdWordsDate
  def getTotalAdjustments(): scala.Double
}

object BudgetOrder {
  @scala.inline
  def apply(
    getBillingAccount: js.Function0[BillingAccount],
    getEndDatetime: js.Function0[AdWordsDate],
    getId: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getPoNumber: js.Function0[scala.Double],
    getSpendingLimit: js.Function0[scala.Double],
    getStartDateTime: js.Function0[AdWordsDate],
    getTotalAdjustments: js.Function0[scala.Double]
  ): BudgetOrder = {
    val __obj = js.Dynamic.literal(getBillingAccount = getBillingAccount, getEndDatetime = getEndDatetime, getId = getId, getName = getName, getPoNumber = getPoNumber, getSpendingLimit = getSpendingLimit, getStartDateTime = getStartDateTime, getTotalAdjustments = getTotalAdjustments)
  
    __obj.asInstanceOf[BudgetOrder]
  }
}

