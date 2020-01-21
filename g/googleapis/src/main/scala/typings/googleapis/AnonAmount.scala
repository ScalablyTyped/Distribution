package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmount extends js.Object {
  var amount: js.UndefOr[Double] = js.native
  var currencyCode: js.UndefOr[String] = js.native
}

object AnonAmount {
  @scala.inline
  def apply(amount: Int | Double = null, currencyCode: String = null): AnonAmount = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmount]
  }
}

