package typings.dineroDotJs.dineroDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(amount: Int | Double = null, currency: String = null, precision: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

