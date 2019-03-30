package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemProductFee extends js.Object {
  var amount: js.UndefOr[Price] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object OrderLineItemProductFee {
  @scala.inline
  def apply(amount: Price = null, name: java.lang.String = null): OrderLineItemProductFee = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OrderLineItemProductFee]
  }
}

