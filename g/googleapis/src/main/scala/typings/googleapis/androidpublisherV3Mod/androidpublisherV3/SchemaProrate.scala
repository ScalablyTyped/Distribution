package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProrate extends js.Object {
  /**
    * Default price cannot be zero and must be less than the full subscription
    * price. Default price is always in the developer&#39;s Checkout merchant
    * currency. Targeted countries have their prices set automatically based on
    * the default_price.
    */
  var defaultPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Defines the first day on which the price takes effect.
    */
  var start: js.UndefOr[SchemaMonthDay] = js.native
}

object SchemaProrate {
  @scala.inline
  def apply(defaultPrice: SchemaPrice = null, start: SchemaMonthDay = null): SchemaProrate = {
    val __obj = js.Dynamic.literal()
    if (defaultPrice != null) __obj.updateDynamic("defaultPrice")(defaultPrice.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProrate]
  }
}

