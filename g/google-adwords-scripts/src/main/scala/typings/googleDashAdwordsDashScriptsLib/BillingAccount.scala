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
    getId: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    getPrimaryBillingId: js.Function0[java.lang.String],
    getSecondaryBillingId: js.Function0[java.lang.String]
  ): BillingAccount = {
    val __obj = js.Dynamic.literal(getId = getId, getName = getName, getPrimaryBillingId = getPrimaryBillingId, getSecondaryBillingId = getSecondaryBillingId)
  
    __obj.asInstanceOf[BillingAccount]
  }
}

