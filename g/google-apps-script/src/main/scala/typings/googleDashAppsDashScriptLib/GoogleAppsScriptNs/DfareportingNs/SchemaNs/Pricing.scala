package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pricing extends js.Object {
  var capCostType: js.UndefOr[java.lang.String] = js.undefined
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  var flights: js.UndefOr[js.Array[Flight]] = js.undefined
  var groupType: js.UndefOr[java.lang.String] = js.undefined
  var pricingType: js.UndefOr[java.lang.String] = js.undefined
  var startDate: js.UndefOr[java.lang.String] = js.undefined
}

object Pricing {
  @scala.inline
  def apply(
    capCostType: java.lang.String = null,
    endDate: java.lang.String = null,
    flights: js.Array[Flight] = null,
    groupType: java.lang.String = null,
    pricingType: java.lang.String = null,
    startDate: java.lang.String = null
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

