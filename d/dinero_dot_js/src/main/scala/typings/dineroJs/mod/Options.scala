package typings.dineroJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
  var currency: js.UndefOr[Currency] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    amount: js.UndefOr[Double] = js.undefined,
    currency: Currency = null,
    precision: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

