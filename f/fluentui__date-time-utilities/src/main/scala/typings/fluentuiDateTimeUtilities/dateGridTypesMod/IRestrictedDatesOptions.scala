package typings.fluentuiDateTimeUtilities.dateGridTypesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestrictedDatesOptions extends js.Object {
  /**
    * If set the Calendar will not allow navigation to or selection of a date later than this value.
    */
  var maxDate: js.UndefOr[Date] = js.undefined
  /**
    * If set the Calendar will not allow navigation to or selection of a date earlier than this value.
    */
  var minDate: js.UndefOr[Date] = js.undefined
  /**
    * If set the Calendar will not allow selection of dates in this array.
    */
  var restrictedDates: js.UndefOr[js.Array[Date]] = js.undefined
}

object IRestrictedDatesOptions {
  @scala.inline
  def apply(maxDate: Date = null, minDate: Date = null, restrictedDates: js.Array[Date] = null): IRestrictedDatesOptions = {
    val __obj = js.Dynamic.literal()
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (restrictedDates != null) __obj.updateDynamic("restrictedDates")(restrictedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestrictedDatesOptions]
  }
}

