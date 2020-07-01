package typings.fluentuiDateTimeUtilities.dateGridTypesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAvailableDateOptions extends IRestrictedDatesOptions {
  /** Direction of search (`1` - search in future / `-1` search in past) */
  var direction: Double
  /** Date from which we start the search */
  var initialDate: Date
  /** Ideal available date */
  var targetDate: Date
}

object IAvailableDateOptions {
  @scala.inline
  def apply(
    direction: Double,
    initialDate: Date,
    targetDate: Date,
    maxDate: Date = null,
    minDate: Date = null,
    restrictedDates: js.Array[Date] = null
  ): IAvailableDateOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], initialDate = initialDate.asInstanceOf[js.Any], targetDate = targetDate.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (restrictedDates != null) __obj.updateDynamic("restrictedDates")(restrictedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAvailableDateOptions]
  }
}

