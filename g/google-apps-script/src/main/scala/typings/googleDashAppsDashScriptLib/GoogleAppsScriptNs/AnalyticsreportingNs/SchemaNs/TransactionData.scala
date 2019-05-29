package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionData extends js.Object {
  var transactionId: js.UndefOr[java.lang.String] = js.undefined
  var transactionRevenue: js.UndefOr[scala.Double] = js.undefined
  var transactionShipping: js.UndefOr[scala.Double] = js.undefined
  var transactionTax: js.UndefOr[scala.Double] = js.undefined
}

object TransactionData {
  @scala.inline
  def apply(
    transactionId: java.lang.String = null,
    transactionRevenue: scala.Int | scala.Double = null,
    transactionShipping: scala.Int | scala.Double = null,
    transactionTax: scala.Int | scala.Double = null
  ): TransactionData = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    if (transactionRevenue != null) __obj.updateDynamic("transactionRevenue")(transactionRevenue.asInstanceOf[js.Any])
    if (transactionShipping != null) __obj.updateDynamic("transactionShipping")(transactionShipping.asInstanceOf[js.Any])
    if (transactionTax != null) __obj.updateDynamic("transactionTax")(transactionTax.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionData]
  }
}

