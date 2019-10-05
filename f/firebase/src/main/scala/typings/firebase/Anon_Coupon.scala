package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.firebaseMod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coupon
  extends /* key */ StringDictionary[js.Any] {
  var coupon: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_Coupon {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    coupon: String = null,
    currency: String = null,
    items: js.Array[Item] = null,
    value: Int | Double = null
  ): Anon_Coupon = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (items != null) __obj.updateDynamic("items")(items)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Coupon]
  }
}

