package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.firebaseMod.analyticsNs.Currency
import typings.firebase.firebaseMod.analyticsNs.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CouponCurrency
  extends /* key */ StringDictionary[js.Any] {
  var coupon: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var shipping: js.UndefOr[Currency] = js.undefined
  var tax: js.UndefOr[Currency] = js.undefined
  var transaction_id: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_CouponCurrency {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    coupon: String = null,
    currency: String = null,
    items: js.Array[Item] = null,
    shipping: Currency = null,
    tax: Currency = null,
    transaction_id: String = null,
    value: Int | Double = null
  ): Anon_CouponCurrency = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (items != null) __obj.updateDynamic("items")(items)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    if (transaction_id != null) __obj.updateDynamic("transaction_id")(transaction_id)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CouponCurrency]
  }
}

