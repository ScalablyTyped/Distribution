package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Installment extends js.Object {
  var amount: js.UndefOr[Price] = js.undefined
  var months: js.UndefOr[java.lang.String] = js.undefined
}

object Installment {
  @scala.inline
  def apply(amount: Price = null, months: java.lang.String = null): Installment = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (months != null) __obj.updateDynamic("months")(months)
    __obj.asInstanceOf[Installment]
  }
}

