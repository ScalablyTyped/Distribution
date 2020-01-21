package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilter extends js.Object {
  /**
    * List of dates that match the media items' creation date. A maximum of
    * 5 dates can be included per request.
    */
  var dates: js.UndefOr[js.Array[Date]] = js.undefined
  /**
    * List of dates ranges that match the media items' creation date. A
    * maximum of 5 dates ranges can be included per request.
    */
  var ranges: js.UndefOr[js.Array[DateRange]] = js.undefined
}

object DateFilter {
  @scala.inline
  def apply(dates: js.Array[Date] = null, ranges: js.Array[DateRange] = null): DateFilter = {
    val __obj = js.Dynamic.literal()
    if (dates != null) __obj.updateDynamic("dates")(dates.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilter]
  }
}

