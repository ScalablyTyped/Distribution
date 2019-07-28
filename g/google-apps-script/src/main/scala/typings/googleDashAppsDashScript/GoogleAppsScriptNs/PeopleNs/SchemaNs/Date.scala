package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object Date {
  @scala.inline
  def apply(day: Int | Double = null, month: Int | Double = null, year: Int | Double = null): Date = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

