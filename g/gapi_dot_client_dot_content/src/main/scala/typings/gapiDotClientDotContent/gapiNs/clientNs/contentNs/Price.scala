package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  /** The currency of the price. */
  var currency: js.UndefOr[String] = js.undefined
  /** The price represented as a number. */
  var value: js.UndefOr[String] = js.undefined
}

object Price {
  @scala.inline
  def apply(currency: String = null, value: String = null): Price = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Price]
  }
}

