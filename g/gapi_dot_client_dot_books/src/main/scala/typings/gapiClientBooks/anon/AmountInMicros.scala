package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmountInMicros extends js.Object {
  var amountInMicros: js.UndefOr[Double] = js.undefined
  var currencyCode: js.UndefOr[String] = js.undefined
}

object AmountInMicros {
  @scala.inline
  def apply(amountInMicros: js.UndefOr[Double] = js.undefined, currencyCode: String = null): AmountInMicros = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amountInMicros)) __obj.updateDynamic("amountInMicros")(amountInMicros.get.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountInMicros]
  }
}

