package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var etag: etag
  var id: java.lang.String
  var kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#calendar`
  var location: js.UndefOr[java.lang.String] = js.undefined
  var summary: java.lang.String
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object Calendar {
  @scala.inline
  def apply(
    etag: etag,
    id: java.lang.String,
    kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#calendar`,
    summary: java.lang.String,
    description: java.lang.String = null,
    location: java.lang.String = null,
    timeZone: java.lang.String = null
  ): Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("summary")(summary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (location != null) __obj.updateDynamic("location")(location)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[Calendar]
  }
}

