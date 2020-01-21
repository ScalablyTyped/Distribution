package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountInMicros extends js.Object {
  var amountInMicros: js.UndefOr[Double] = js.undefined
  var currencyCode: js.UndefOr[String] = js.undefined
}

object AnonAmountInMicros {
  @scala.inline
  def apply(amountInMicros: Int | Double = null, currencyCode: String = null): AnonAmountInMicros = {
    val __obj = js.Dynamic.literal()
    if (amountInMicros != null) __obj.updateDynamic("amountInMicros")(amountInMicros.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmountInMicros]
  }
}

