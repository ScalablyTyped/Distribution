package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  /** The currency of the price. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** The price represented as a number. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Price {
  @scala.inline
  def apply(currency: java.lang.String = null, value: java.lang.String = null): Price = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Price]
  }
}

