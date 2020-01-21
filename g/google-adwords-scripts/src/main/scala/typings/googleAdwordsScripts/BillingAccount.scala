package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Budget Orders
trait BillingAccount extends js.Object {
  def getId(): Double
  def getName(): String
  def getPrimaryBillingId(): String
  def getSecondaryBillingId(): String
}

object BillingAccount {
  @scala.inline
  def apply(
    getId: () => Double,
    getName: () => String,
    getPrimaryBillingId: () => String,
    getSecondaryBillingId: () => String
  ): BillingAccount = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getPrimaryBillingId = js.Any.fromFunction0(getPrimaryBillingId), getSecondaryBillingId = js.Any.fromFunction0(getSecondaryBillingId))
  
    __obj.asInstanceOf[BillingAccount]
  }
}

