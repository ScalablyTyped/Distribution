package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

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
    if (capCostType != null) __obj.updateDynamic("capCostType")(capCostType)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (flights != null) __obj.updateDynamic("flights")(flights)
    if (groupType != null) __obj.updateDynamic("groupType")(groupType)
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Pricing]
  }
}

