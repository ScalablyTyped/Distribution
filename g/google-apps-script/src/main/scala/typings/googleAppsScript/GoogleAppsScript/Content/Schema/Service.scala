package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var deliveryCountry: js.UndefOr[String] = js.undefined
  var deliveryTime: js.UndefOr[DeliveryTime] = js.undefined
  var eligibility: js.UndefOr[String] = js.undefined
  var minimumOrderValue: js.UndefOr[Price] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rateGroups: js.UndefOr[js.Array[RateGroup]] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    currency: String = null,
    deliveryCountry: String = null,
    deliveryTime: DeliveryTime = null,
    eligibility: String = null,
    minimumOrderValue: Price = null,
    name: String = null,
    rateGroups: js.Array[RateGroup] = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (deliveryCountry != null) __obj.updateDynamic("deliveryCountry")(deliveryCountry.asInstanceOf[js.Any])
    if (deliveryTime != null) __obj.updateDynamic("deliveryTime")(deliveryTime.asInstanceOf[js.Any])
    if (eligibility != null) __obj.updateDynamic("eligibility")(eligibility.asInstanceOf[js.Any])
    if (minimumOrderValue != null) __obj.updateDynamic("minimumOrderValue")(minimumOrderValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rateGroups != null) __obj.updateDynamic("rateGroups")(rateGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

