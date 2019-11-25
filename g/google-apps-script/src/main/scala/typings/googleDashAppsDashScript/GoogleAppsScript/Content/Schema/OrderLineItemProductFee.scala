package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemProductFee extends js.Object {
  var amount: js.UndefOr[Price] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object OrderLineItemProductFee {
  @scala.inline
  def apply(amount: Price = null, name: String = null): OrderLineItemProductFee = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderLineItemProductFee]
  }
}

