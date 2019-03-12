package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Budget Orders
trait BillingAccount extends js.Object {
  def getId(): scala.Double
  def getName(): java.lang.String
  def getPrimaryBillingId(): java.lang.String
  def getSecondaryBillingId(): java.lang.String
}

object BillingAccount {
  @scala.inline
  def apply(
    getId: () => scala.Double,
    getName: () => java.lang.String,
    getPrimaryBillingId: () => java.lang.String,
    getSecondaryBillingId: () => java.lang.String
  ): BillingAccount = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getPrimaryBillingId = js.Any.fromFunction0(getPrimaryBillingId), getSecondaryBillingId = js.Any.fromFunction0(getSecondaryBillingId))
  
    __obj.asInstanceOf[BillingAccount]
  }
}

