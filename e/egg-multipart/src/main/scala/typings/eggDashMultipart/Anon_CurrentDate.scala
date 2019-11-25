package typings.eggDashMultipart

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentDate extends js.Object {
  var currentDate: js.UndefOr[String | Double | Date] = js.undefined
  var endDate: js.UndefOr[String | Double | Date] = js.undefined
  var iterator: js.UndefOr[Boolean] = js.undefined
  var tz: js.UndefOr[String] = js.undefined
  var utc: js.UndefOr[Boolean] = js.undefined
}

object Anon_CurrentDate {
  @scala.inline
  def apply(
    currentDate: String | Double | Date = null,
    endDate: String | Double | Date = null,
    iterator: js.UndefOr[Boolean] = js.undefined,
    tz: String = null,
    utc: js.UndefOr[Boolean] = js.undefined
  ): Anon_CurrentDate = {
    val __obj = js.Dynamic.literal()
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(iterator)) __obj.updateDynamic("iterator")(iterator.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz.asInstanceOf[js.Any])
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CurrentDate]
  }
}

