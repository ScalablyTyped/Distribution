package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsManagerAccountInfo extends js.Object {
  /** Name of the customer this account represents. */
  var customerName: js.UndefOr[String] = js.undefined
  /** The AdWords Manager Account id. */
  var id: js.UndefOr[String] = js.undefined
}

object AdWordsManagerAccountInfo {
  @scala.inline
  def apply(customerName: String = null, id: String = null): AdWordsManagerAccountInfo = {
    val __obj = js.Dynamic.literal()
    if (customerName != null) __obj.updateDynamic("customerName")(customerName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[AdWordsManagerAccountInfo]
  }
}

