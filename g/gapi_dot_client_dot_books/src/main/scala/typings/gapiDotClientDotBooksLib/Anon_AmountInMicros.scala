package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountInMicros extends js.Object {
  var amountInMicros: js.UndefOr[scala.Double] = js.undefined
  var currencyCode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AmountInMicros {
  @scala.inline
  def apply(amountInMicros: scala.Int | scala.Double = null, currencyCode: java.lang.String = null): Anon_AmountInMicros = {
    val __obj = js.Dynamic.literal()
    if (amountInMicros != null) __obj.updateDynamic("amountInMicros")(amountInMicros.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    __obj.asInstanceOf[Anon_AmountInMicros]
  }
}

