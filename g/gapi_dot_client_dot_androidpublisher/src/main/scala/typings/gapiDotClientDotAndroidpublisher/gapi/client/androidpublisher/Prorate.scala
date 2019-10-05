package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prorate extends js.Object {
  /**
    * Default price cannot be zero and must be less than the full subscription price. Default price is always in the developer's Checkout merchant currency.
    * Targeted countries have their prices set automatically based on the default_price.
    */
  var defaultPrice: js.UndefOr[Price] = js.undefined
  /** Defines the first day on which the price takes effect. */
  var start: js.UndefOr[MonthDay] = js.undefined
}

object Prorate {
  @scala.inline
  def apply(defaultPrice: Price = null, start: MonthDay = null): Prorate = {
    val __obj = js.Dynamic.literal()
    if (defaultPrice != null) __obj.updateDynamic("defaultPrice")(defaultPrice)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Prorate]
  }
}

