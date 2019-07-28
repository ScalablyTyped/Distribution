package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  /** 3 letter Currency code, as defined by ISO 4217. */
  var currency: js.UndefOr[String] = js.undefined
  /** The price in millionths of the currency base unit represented as a string. */
  var priceMicros: js.UndefOr[String] = js.undefined
}

object Price {
  @scala.inline
  def apply(currency: String = null, priceMicros: String = null): Price = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (priceMicros != null) __obj.updateDynamic("priceMicros")(priceMicros)
    __obj.asInstanceOf[Price]
  }
}

