package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountInMicros extends js.Object {
  var amountInMicros: js.UndefOr[Double] = js.undefined
  var currencyCode: js.UndefOr[String] = js.undefined
}

object Anon_AmountInMicros {
  @scala.inline
  def apply(amountInMicros: Int | Double = null, currencyCode: String = null): Anon_AmountInMicros = {
    val __obj = js.Dynamic.literal()
    if (amountInMicros != null) __obj.updateDynamic("amountInMicros")(amountInMicros.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AmountInMicros]
  }
}

