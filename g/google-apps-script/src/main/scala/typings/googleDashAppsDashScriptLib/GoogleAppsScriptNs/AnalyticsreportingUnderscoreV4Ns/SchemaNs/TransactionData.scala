package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionData extends js.Object {
  var transactionId: js.UndefOr[java.lang.String] = js.undefined
  var transactionRevenue: js.UndefOr[stdLib.Number] = js.undefined
  var transactionShipping: js.UndefOr[stdLib.Number] = js.undefined
  var transactionTax: js.UndefOr[stdLib.Number] = js.undefined
}

object TransactionData {
  @scala.inline
  def apply(
    transactionId: java.lang.String = null,
    transactionRevenue: stdLib.Number = null,
    transactionShipping: stdLib.Number = null,
    transactionTax: stdLib.Number = null
  ): TransactionData = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    if (transactionRevenue != null) __obj.updateDynamic("transactionRevenue")(transactionRevenue)
    if (transactionShipping != null) __obj.updateDynamic("transactionShipping")(transactionShipping)
    if (transactionTax != null) __obj.updateDynamic("transactionTax")(transactionTax)
    __obj.asInstanceOf[TransactionData]
  }
}

