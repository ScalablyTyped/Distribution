package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pricing extends js.Object {
  var capCostType: js.UndefOr[String] = js.undefined
  var endDate: js.UndefOr[String] = js.undefined
  var flights: js.UndefOr[js.Array[Flight]] = js.undefined
  var groupType: js.UndefOr[String] = js.undefined
  var pricingType: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
}

object Pricing {
  @scala.inline
  def apply(
    capCostType: String = null,
    endDate: String = null,
    flights: js.Array[Flight] = null,
    groupType: String = null,
    pricingType: String = null,
    startDate: String = null
  ): Pricing = {
    val __obj = js.Dynamic.literal()
    if (capCostType != null) __obj.updateDynamic("capCostType")(capCostType.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (flights != null) __obj.updateDynamic("flights")(flights.asInstanceOf[js.Any])
    if (groupType != null) __obj.updateDynamic("groupType")(groupType.asInstanceOf[js.Any])
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pricing]
  }
}

