package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPartTargeting extends js.Object {
  var daysOfWeek: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hoursOfDay: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var userLocalTime: js.UndefOr[scala.Boolean] = js.undefined
}

object DayPartTargeting {
  @scala.inline
  def apply(
    daysOfWeek: js.Array[java.lang.String] = null,
    hoursOfDay: js.Array[scala.Double] = null,
    userLocalTime: js.UndefOr[scala.Boolean] = js.undefined
  ): DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek)
    if (hoursOfDay != null) __obj.updateDynamic("hoursOfDay")(hoursOfDay)
    if (!js.isUndefined(userLocalTime)) __obj.updateDynamic("userLocalTime")(userLocalTime)
    __obj.asInstanceOf[DayPartTargeting]
  }
}

