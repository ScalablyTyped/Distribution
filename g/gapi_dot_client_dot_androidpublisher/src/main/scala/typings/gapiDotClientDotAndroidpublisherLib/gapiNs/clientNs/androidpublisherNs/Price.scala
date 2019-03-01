package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  /** 3 letter Currency code, as defined by ISO 4217. */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /** The price in millionths of the currency base unit represented as a string. */
  var priceMicros: js.UndefOr[java.lang.String] = js.undefined
}

object Price {
  @scala.inline
  def apply(currency: java.lang.String = null, priceMicros: java.lang.String = null): Price = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (priceMicros != null) __obj.updateDynamic("priceMicros")(priceMicros)
    __obj.asInstanceOf[Price]
  }
}

