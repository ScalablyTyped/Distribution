package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
  /** Amount in the currency listed below. (In LITE projection.) */
  var amount: js.UndefOr[Double] = js.undefined
  /** An ISO 4217, three-letter currency code. (In LITE projection.) */
  var currencyCode: js.UndefOr[String] = js.undefined
}

object Amount {
  @scala.inline
  def apply(amount: js.UndefOr[Double] = js.undefined, currencyCode: String = null): Amount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
}

