package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmountInMicros extends js.Object {
  var amountInMicros: js.UndefOr[Double] = js.native
  var currencyCode: js.UndefOr[String] = js.native
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

