package typings
package dineroDotJsLib.dineroDotJsMod.DineroFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var amount: js.UndefOr[scala.Double] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    amount: scala.Int | scala.Double = null,
    currency: java.lang.String = null,
    precision: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

