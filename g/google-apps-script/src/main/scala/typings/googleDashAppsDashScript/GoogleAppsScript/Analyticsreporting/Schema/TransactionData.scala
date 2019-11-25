package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionData extends js.Object {
  var transactionId: js.UndefOr[String] = js.undefined
  var transactionRevenue: js.UndefOr[Double] = js.undefined
  var transactionShipping: js.UndefOr[Double] = js.undefined
  var transactionTax: js.UndefOr[Double] = js.undefined
}

object TransactionData {
  @scala.inline
  def apply(
    transactionId: String = null,
    transactionRevenue: Int | Double = null,
    transactionShipping: Int | Double = null,
    transactionTax: Int | Double = null
  ): TransactionData = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    if (transactionRevenue != null) __obj.updateDynamic("transactionRevenue")(transactionRevenue.asInstanceOf[js.Any])
    if (transactionShipping != null) __obj.updateDynamic("transactionShipping")(transactionShipping.asInstanceOf[js.Any])
    if (transactionTax != null) __obj.updateDynamic("transactionTax")(transactionTax.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionData]
  }
}

