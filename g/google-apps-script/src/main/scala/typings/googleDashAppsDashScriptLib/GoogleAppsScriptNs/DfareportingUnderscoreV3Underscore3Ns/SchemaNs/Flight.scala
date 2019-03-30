package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flight extends js.Object {
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  var rateOrCost: js.UndefOr[java.lang.String] = js.undefined
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object Flight {
  @scala.inline
  def apply(
    endDate: java.lang.String = null,
    rateOrCost: java.lang.String = null,
    startDate: java.lang.String = null,
    units: java.lang.String = null
  ): Flight = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (rateOrCost != null) __obj.updateDynamic("rateOrCost")(rateOrCost)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[Flight]
  }
}

