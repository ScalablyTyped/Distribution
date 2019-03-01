package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  /** Amount in the currency listed below. (In LITE projection.) */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /** An ISO 4217, three-letter currency code. (In LITE projection.) */
  var currencyCode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(amount: scala.Int | scala.Double = null, currencyCode: java.lang.String = null): Anon_Amount = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    __obj.asInstanceOf[Anon_Amount]
  }
}

