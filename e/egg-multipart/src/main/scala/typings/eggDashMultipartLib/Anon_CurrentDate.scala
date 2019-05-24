package typings
package eggDashMultipartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentDate extends js.Object {
  var currentDate: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  var endDate: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  var iterator: js.UndefOr[scala.Boolean] = js.undefined
  var tz: js.UndefOr[java.lang.String] = js.undefined
  var utc: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CurrentDate {
  @scala.inline
  def apply(
    currentDate: java.lang.String | scala.Double | stdLib.Date = null,
    endDate: java.lang.String | scala.Double | stdLib.Date = null,
    iterator: js.UndefOr[scala.Boolean] = js.undefined,
    tz: java.lang.String = null,
    utc: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CurrentDate = {
    val __obj = js.Dynamic.literal()
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(iterator)) __obj.updateDynamic("iterator")(iterator)
    if (tz != null) __obj.updateDynamic("tz")(tz)
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc)
    __obj.asInstanceOf[Anon_CurrentDate]
  }
}

