package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkoutoption
  extends /* key */ StringDictionary[js.Any] {
  var checkout_option: js.UndefOr[String] = js.undefined
  var checkout_step: js.UndefOr[Double] = js.undefined
  var coupon: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Checkoutoption {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    checkout_option: String = null,
    checkout_step: js.UndefOr[Double] = js.undefined,
    coupon: String = null,
    currency: String = null,
    items: js.Array[Item] = null,
    value: js.UndefOr[Double] = js.undefined
  ): Checkoutoption = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkout_option != null) __obj.updateDynamic("checkout_option")(checkout_option.asInstanceOf[js.Any])
    if (!js.isUndefined(checkout_step)) __obj.updateDynamic("checkout_step")(checkout_step.get.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkoutoption]
  }
}

