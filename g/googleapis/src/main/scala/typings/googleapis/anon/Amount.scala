package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amount extends js.Object {
  var amount: js.UndefOr[Double] = js.native
  var currencyCode: js.UndefOr[String] = js.native
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

