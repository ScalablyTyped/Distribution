package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var day: js.UndefOr[scala.Double] = js.undefined
  var month: js.UndefOr[scala.Double] = js.undefined
  var year: js.UndefOr[scala.Double] = js.undefined
}

object Date {
  @scala.inline
  def apply(
    day: scala.Int | scala.Double = null,
    month: scala.Int | scala.Double = null,
    year: scala.Int | scala.Double = null
  ): Date = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

