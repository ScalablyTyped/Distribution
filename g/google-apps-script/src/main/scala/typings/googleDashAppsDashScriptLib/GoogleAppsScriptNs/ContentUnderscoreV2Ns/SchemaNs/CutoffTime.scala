package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CutoffTime extends js.Object {
  var hour: js.UndefOr[scala.Double] = js.undefined
  var minute: js.UndefOr[scala.Double] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
}

object CutoffTime {
  @scala.inline
  def apply(
    hour: scala.Int | scala.Double = null,
    minute: scala.Int | scala.Double = null,
    timezone: java.lang.String = null
  ): CutoffTime = {
    val __obj = js.Dynamic.literal()
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[CutoffTime]
  }
}

