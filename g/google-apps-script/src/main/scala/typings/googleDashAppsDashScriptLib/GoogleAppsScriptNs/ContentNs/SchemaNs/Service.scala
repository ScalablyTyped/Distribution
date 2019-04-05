package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var deliveryCountry: js.UndefOr[java.lang.String] = js.undefined
  var deliveryTime: js.UndefOr[DeliveryTime] = js.undefined
  var eligibility: js.UndefOr[java.lang.String] = js.undefined
  var minimumOrderValue: js.UndefOr[Price] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rateGroups: js.UndefOr[js.Array[RateGroup]] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    currency: java.lang.String = null,
    deliveryCountry: java.lang.String = null,
    deliveryTime: DeliveryTime = null,
    eligibility: java.lang.String = null,
    minimumOrderValue: Price = null,
    name: java.lang.String = null,
    rateGroups: js.Array[RateGroup] = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (deliveryCountry != null) __obj.updateDynamic("deliveryCountry")(deliveryCountry)
    if (deliveryTime != null) __obj.updateDynamic("deliveryTime")(deliveryTime)
    if (eligibility != null) __obj.updateDynamic("eligibility")(eligibility)
    if (minimumOrderValue != null) __obj.updateDynamic("minimumOrderValue")(minimumOrderValue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rateGroups != null) __obj.updateDynamic("rateGroups")(rateGroups)
    __obj.asInstanceOf[Service]
  }
}

