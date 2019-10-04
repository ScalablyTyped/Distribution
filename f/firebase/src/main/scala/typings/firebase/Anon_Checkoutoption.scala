package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.firebaseMod.analyticsNs.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checkoutoption
  extends /* key */ StringDictionary[js.Any] {
  var checkout_option: js.UndefOr[String] = js.undefined
  var checkout_step: js.UndefOr[Double] = js.undefined
  var coupon: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_Checkoutoption {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    checkout_option: String = null,
    checkout_step: Int | Double = null,
    coupon: String = null,
    currency: String = null,
    items: js.Array[Item] = null,
    value: Int | Double = null
  ): Anon_Checkoutoption = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkout_option != null) __obj.updateDynamic("checkout_option")(checkout_option)
    if (checkout_step != null) __obj.updateDynamic("checkout_step")(checkout_step.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (items != null) __obj.updateDynamic("items")(items)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Checkoutoption]
  }
}

