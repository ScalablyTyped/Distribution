package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapiDotCalendar.gapiDotCalendarStrings.`calendar#calendar`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var etag: typings.gapiDotCalendar.gapi.client.calendar.etag
  var id: String
  var kind: `calendar#calendar`
  var location: js.UndefOr[String] = js.undefined
  var summary: String
  var timeZone: js.UndefOr[String] = js.undefined
}

object Calendar {
  @scala.inline
  def apply(
    etag: etag,
    id: String,
    kind: `calendar#calendar`,
    summary: String,
    description: String = null,
    location: String = null,
    timeZone: String = null
  ): Calendar = {
    val __obj = js.Dynamic.literal(etag = etag, id = id, kind = kind, summary = summary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (location != null) __obj.updateDynamic("location")(location)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[Calendar]
  }
}

