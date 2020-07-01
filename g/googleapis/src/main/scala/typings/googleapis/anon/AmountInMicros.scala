package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmountInMicros extends js.Object {
  var amountInMicros: js.UndefOr[Double] = js.native
  var currencyCode: js.UndefOr[String] = js.native
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

