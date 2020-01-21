package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPrice extends js.Object {
  /**
    * 3 letter Currency code, as defined by ISO 4217.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The price in millionths of the currency base unit represented as a
    * string.
    */
  var priceMicros: js.UndefOr[String] = js.native
}

object SchemaPrice {
  @scala.inline
  def apply(currency: String = null, priceMicros: String = null): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (priceMicros != null) __obj.updateDynamic("priceMicros")(priceMicros.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrice]
  }
}

