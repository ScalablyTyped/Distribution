package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

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
    transactionRevenue: js.UndefOr[Double] = js.undefined,
    transactionShipping: js.UndefOr[Double] = js.undefined,
    transactionTax: js.UndefOr[Double] = js.undefined
  ): TransactionData = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionRevenue)) __obj.updateDynamic("transactionRevenue")(transactionRevenue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionShipping)) __obj.updateDynamic("transactionShipping")(transactionShipping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionTax)) __obj.updateDynamic("transactionTax")(transactionTax.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionData]
  }
}

