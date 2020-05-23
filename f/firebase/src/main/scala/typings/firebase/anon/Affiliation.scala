package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Affiliation
  extends /* key */ StringDictionary[js.Any] {
  var affiliation: js.UndefOr[String] = js.undefined
  var coupon: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var shipping: js.UndefOr[typings.firebase.mod.analytics.Currency] = js.undefined
  var tax: js.UndefOr[typings.firebase.mod.analytics.Currency] = js.undefined
  var transaction_id: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Affiliation {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    affiliation: String = null,
    coupon: String = null,
    currency: String = null,
    items: js.Array[Item] = null,
    shipping: typings.firebase.mod.analytics.Currency = null,
    tax: typings.firebase.mod.analytics.Currency = null,
    transaction_id: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): Affiliation = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    if (transaction_id != null) __obj.updateDynamic("transaction_id")(transaction_id.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affiliation]
  }
}

