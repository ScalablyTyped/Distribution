package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  /**
    * The end date (included as part of the range). It must be specified in the
    * same format as the start date.
    */
  var endDate: js.UndefOr[Date] = js.undefined
  /**
    * The start date (included as part of the range) in one of the formats
    * described.
    */
  var startDate: js.UndefOr[Date] = js.undefined
}

object DateRange {
  @scala.inline
  def apply(endDate: Date = null, startDate: Date = null): DateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRange]
  }
}

