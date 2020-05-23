package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextMonth extends js.Object {
  var nextMonth: js.UndefOr[String] = js.undefined
  var previousMonth: js.UndefOr[String] = js.undefined
  var show12NextYears: js.UndefOr[String] = js.undefined
  var show12PreviousYears: js.UndefOr[String] = js.undefined
}

object NextMonth {
  @scala.inline
  def apply(
    nextMonth: String = null,
    previousMonth: String = null,
    show12NextYears: String = null,
    show12PreviousYears: String = null
  ): NextMonth = {
    val __obj = js.Dynamic.literal()
    if (nextMonth != null) __obj.updateDynamic("nextMonth")(nextMonth.asInstanceOf[js.Any])
    if (previousMonth != null) __obj.updateDynamic("previousMonth")(previousMonth.asInstanceOf[js.Any])
    if (show12NextYears != null) __obj.updateDynamic("show12NextYears")(show12NextYears.asInstanceOf[js.Any])
    if (show12PreviousYears != null) __obj.updateDynamic("show12PreviousYears")(show12PreviousYears.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextMonth]
  }
}

