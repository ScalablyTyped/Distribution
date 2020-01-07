package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Price extends js.Object {
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

object Schema$Price {
  @scala.inline
  def apply(currency: String = null, priceMicros: String = null): Schema$Price = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (priceMicros != null) __obj.updateDynamic("priceMicros")(priceMicros.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Price]
  }
}

