package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Prorate extends js.Object {
  /**
    * Default price cannot be zero and must be less than the full subscription
    * price. Default price is always in the developer&#39;s Checkout merchant
    * currency. Targeted countries have their prices set automatically based on
    * the default_price.
    */
  var defaultPrice: js.UndefOr[Schema$Price] = js.native
  /**
    * Defines the first day on which the price takes effect.
    */
  var start: js.UndefOr[Schema$MonthDay] = js.native
}

object Schema$Prorate {
  @scala.inline
  def apply(defaultPrice: Schema$Price = null, start: Schema$MonthDay = null): Schema$Prorate = {
    val __obj = js.Dynamic.literal()
    if (defaultPrice != null) __obj.updateDynamic("defaultPrice")(defaultPrice.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Prorate]
  }
}

